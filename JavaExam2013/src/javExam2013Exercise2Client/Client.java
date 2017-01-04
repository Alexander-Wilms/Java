package javExam2013Exercise2Client;

import java.net.*; import java.io.*;
public class Client {
	public static void main (String[] args)
			throws IOException, UnknownHostException {
		Socket socket = new Socket("localhost",1234);
		PrintWriter Ausgabe= new PrintWriter(socket.getOutputStream(),true);

		InputStreamReader PortLeser = new InputStreamReader(socket.getInputStream());
		BufferedReader Eingabe = new BufferedReader(PortLeser);

		System.out.println("Client running");

		Ausgabe.println("LISTPARTS");

		String inputLine = "";

		while(inputLine != null){
			inputLine = Eingabe.readLine();

			if(inputLine != null)
				System.out.println(inputLine);

			if(inputLine == "bye") {
				socket.close();
				break;
			}

		}
	}
}