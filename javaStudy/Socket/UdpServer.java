import java.io.*;
import java.net.*;
public class UdpServer {
	public static void main(String args[]) throws Exception{
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		DatagramSocket receiveSocket = new DatagramSocket(8888);
		while(true){
			receiveSocket.receive(dp);
			ByteArrayInputStream bis = new ByteArrayInputStream(buf);
			DataInputStream dis = new DataInputStream(bis);
			long l = dis.readLong();
			System.out.println(l);
		}
	}
}