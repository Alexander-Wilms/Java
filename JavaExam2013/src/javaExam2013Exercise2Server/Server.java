// http://docs.oracle.com/javase/tutorial/networking/sockets/clientServer.html
package javaExam2013Exercise2Server;

import java.net.*;
import java.util.Scanner;

import javaExam2013Exercise1.Circuit;
import javaExam2013Exercise1.Resistor;

import java.io.*;

class Server {
	public static void main(String[] args) throws IOException {
		Circuit myCircuit = new Circuit("Meine Schaltung");

		Resistor R1 = new Resistor("R1", 100);
		Resistor R2 = new Resistor("R2", 200);
		Resistor R3 = new Resistor("R3", 300);

		myCircuit.addPart(R1);
		myCircuit.addPart(R2);
		myCircuit.addPart(R3);

		Writer out = new BufferedWriter(new OutputStreamWriter(System.out));

		myCircuit.dumpParts(out);

		//out.close();

		ServerSocket myServerSocket = new ServerSocket(1234);

		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);

		while (true) {
			System.out.println("Server listening");
			Socket mySocket = myServerSocket.accept();
			System.out.println("Server accepted connection");

			PrintWriter writer= new PrintWriter(mySocket.getOutputStream(),true);

			InputStreamReader streamreader = new InputStreamReader(mySocket.getInputStream());
			BufferedReader bufferedreader = new BufferedReader(streamreader);
			String inputLine = bufferedreader.readLine();

			inputLine = inputLine.trim();

			System.out.println("Client sent: " + inputLine);

			if (inputLine.equals("LISTPARTS")) {
				writer.println("Server received command LISTPARTS");

				//Ausgabe.write("Ping");
				//Ausgabe.flush();
				
				myCircuit.dumpParts(writer);
				writer.flush();

				writer.println("bye");
			}

			mySocket.close();

			System.out.println("Keep server running? y/n");

			String c = myScanner.nextLine();

			if(c.equals("n")) {
				System.out.println("Server shutting down");
				myServerSocket.close();
				break;
			}
		}
	}
}
