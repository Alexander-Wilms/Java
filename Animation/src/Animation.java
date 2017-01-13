import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Animation {

	static int[][] data;
	
	static Component comp;
	
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		comp = new Display();
		jf.add(comp );
		jf.pack();
		jf.setVisible(true);
		
		run();
	}

	private static void run() {
		data = new int[100][100];
		
		for(int i = 0; i <100; i++) {
			for(int j = 0; j < 100; j++) {
				data[i][j] = 0;
			}
		}
		
		int bla = 50;
		
		while(true) {
		
		data[bla][50] = 1;
		
		((Display) comp).setdata(data);
		
		Graphics g = comp.getGraphics();
		comp.repaint();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(bla+1 <100)
			bla++;
		
		}
	}
}
