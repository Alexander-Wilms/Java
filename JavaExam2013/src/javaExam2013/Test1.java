package javaExam2013;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Test1 {

	public static void main(String[] args) {
		Circuit myCircuit = new Circuit("Meine Schaltung");
		
		Resistor R1 = new Resistor("R1", 100);
		Resistor R2 = new Resistor("R2", 200);
		Resistor R3 = new Resistor("R3", 300);
		
		myCircuit.addPart(R1);
		myCircuit.addPart(R2);
		myCircuit.addPart(R3);
		
		Writer out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		myCircuit.dumpParts(out);
		
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
