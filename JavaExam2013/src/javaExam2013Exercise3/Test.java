package javaExam2013Exercise3;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		ResistorDisplay rd = new ResistorDisplay(1000);
		
		JFrame jf = new JFrame();
		
		jf.add(rd);
		
		jf.pack();
		
		jf.setVisible(true);

	}

}
