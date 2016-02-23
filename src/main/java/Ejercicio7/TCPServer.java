package Ejercicio7;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

/**
 * Created by lima on 2/21/16.
 */
public class TCPServer
{
    private final static int DEFAULT_PORT = 12345;

    public static void main(String[] args) throws IOException
    {
        int port = (args.length ==1) ? Integer.parseInt(args[0]) : DEFAULT_PORT;

        SimpleDateFormat SDF = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        ServerSocket serverSocket = new ServerSocket(port);

        while (true)
        {
            Socket socket = new accept();
            PrintWriter Writer = new PrintWriter(socket.getOutputStream());
            Writer.println(SDF.format(System.currentTimeMillis()));
            Writer.flush();
        }
    }

    private static class accept extends Socket {
    }
}
