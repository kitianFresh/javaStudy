import java.io.*;
import java.net.*;
public class TcpClient {
	public static void main(String args[]) throws Exception{
		Socket s = new Socket("127.0.0.1",6666);
	
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("hello,server");
		dos.close();
		s.close();

		
	}
}