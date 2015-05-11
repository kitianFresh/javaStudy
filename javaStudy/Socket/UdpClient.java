import java.io.*;
import java.net.*;
public class UdpClient {
	public static void main(String args[]) throws Exception{
		long l = 10000L;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeLong(l);
		byte[] buf =bos.toByteArray();
		//byte[] buf =(new String("Hello")).getBytes();
		DatagramPacket dp = new DatagramPacket(buf,buf.length,new InetSocketAddress("127.0.0.1",8888));
		DatagramSocket sendSocket = new DatagramSocket(9999);
		sendSocket.send(dp);
		dos.close();
		sendSocket.close();
	}
}