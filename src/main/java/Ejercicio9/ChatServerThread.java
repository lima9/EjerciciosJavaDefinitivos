package Ejercicio9;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lima on 2/21/16.
 */
public class ChatServerThread implements Runnable
{
    private static List<ChatServerThread> ThreadList = Collections.synchronizedList(new ArrayList<ChatServerThread>());

    private Socket socket = null;
    private String Username = null;
    private BufferedReader Reader = null;
    private PrintWriter Writer = null;

    public ChatServerThread(Socket socket) throws IOException
    {
        this.socket = socket;

        Reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Writer = new PrintWriter(socket.getOutputStream());
    }

    public void run()
    {
        try
        {
            String[] Message = null;
            do
            {
                Message = Reader.readLine().split(" ", 2);
                if (Message[0].equals("JOIN"))
                {
                    Username = Message[1];
                    Thread.currentThread().setName(Username + " Thread.");
                    ThreadList.add(this);
                    Broadcast("Estoy dentro. ");
                }

                else if (Message[0].equals("MESSAGE"))
                {
                    Broadcast(Message[1]);
                }
            }

            while (!Message[0].equals("LEAVE"));
            ThreadList.remove(this);
            Broadcast("Me piro. ");
            socket.close();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void Broadcast (String Message)
    {
        for (ChatServerThread T : ThreadList)
            T.Send(Username + "> " + Message);
    }

    private void Send(String Message)
    {
        Writer.println(Message);
        Writer.flush();
    }
}
