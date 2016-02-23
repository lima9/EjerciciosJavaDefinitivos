package Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.Socket;

/**
 * Created by lima on 2/22/16.
 */
public class TCPClient
{
    public static void main(String[] args) throws IOException
    {
        String Server = "localhost";
        int port = 12345;
        Socket socket = new Socket(Server,port);
        BufferedReader Reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String time = Reader.readLine();
        System.out.println(time);
    }
}
