import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Animation {

	static boolean[][] data;

	static Component comp;

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		comp = new Display();
		jf.add(comp );
		jf.pack();
		jf.setVisible(true);

		run();
	}

	private static void run() {
		double acceleration = 0.1;

		data = new boolean[100][100];

		for(int i = 0; i <100; i++) {
			for(int j = 0; j < 100; j++) {
				data[i][j] = false;
			}
		}

		double location = 99;
		double velocity = 0;

		double time = 0;

		boolean down = true;

		int x = 0;
		
		while(true) {
			x++;

			if(down) {
				location = (int) (99. - 0.5*acceleration*time*time);
				velocity = acceleration*time;
			} else {
				velocity *= 0.99;
				location = (int) (-0.5*acceleration*time*time+velocity*time);
			}



			if(location < 0) {
				location = 0;
				down = false;
				time=0;
			}

			if(location > 99) {
				location = 99;
				down = true;
			}

			System.out.println(location);
			
			for(int i = 0; i <100; i++) {
				for(int j = 0; j < 100; j++) {
					data[i][j] = false;
				}
			}

			x %= 100;
			// data[x][(int) location] = true;
			data[50][(int) location] = true;

			((Display) comp).setdata(data);

			comp.repaint();

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			time++;

		}
	}
}
