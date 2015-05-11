import java.io.*;
import java.net.*;
public class TcpServer {
	public static void main(String args[]) throws Exception {
		ServerSocket ss = new ServerSocket(6666);
		Socket s = null;
		while(true){
			s = ss.accept();
			System.out.println("A client connect");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
			s.close();
		}
	}
}