package Ejercicio8;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by lima on 2/21/16.
 */
public class UDPClient {

    public static void main(String[] args) throws IOException {

        String server = "localhost";
        int port = 12345;

        byte[] data = new byte[0];
        DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName(server), port);
        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.send(dp);

        byte[] buffer = new byte[1496];
        dp = new DatagramPacket(buffer, buffer.length);
        datagramSocket.receive(dp);
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(dp.getData()));
        String time = dis.readUTF();
        System.out.println(time);
    }
}
