import java.awt.Component;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class ConwaysGameOfLife {

	static final int size = 500;
	
	static int[][] data, dataOfNextStep;

	static Component comp;
	
	static int[][] neighbors = {
			{-1, -1},
			{0,-1},
			{1,-1},
			{1,0},
			{1,1},
			{0,1},
			{-1,1},
			{-1,0}};

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		comp = new Display(size);
		jf.add(comp );
		jf.pack();
		jf.setVisible(true);

		run();
	}

	private static void run() {
		data = new int[size][size];
		dataOfNextStep = new int[size][size];

		for(int i = 0; i <size; i++) {
			for(int j = 0; j < size; j++) {
				data[i][j] = 0;
			}
		}

		Random rand = new Random();	
		
		rand.setSeed(System.currentTimeMillis());

		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(rand.nextBoolean() && rand.nextBoolean() && rand.nextBoolean() && rand.nextBoolean())
					data[i][j] = 1;
			}
		}

		while(true) {
			computeNextStep();
			
			data = dataOfNextStep;

			((Display) comp).setdata(data);

			comp.repaint();

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	private static void computeNextStep() {
		int liveNeighbors = 0;
		
		for(int i = 0; i <size; i++) {
			for(int j = 0; j < size; j++) {
				liveNeighbors = 0;
				
				for(int k = 0; k < 8; k++) {
					if(i+neighbors[k][0] >= 0 && i+neighbors[k][0] < size && j+neighbors[k][1] >= 0 && j+neighbors[k][1] < size)
						if(data[i+neighbors[k][0]][j+neighbors[k][1]] == 1)
							liveNeighbors++;
				}
				
				if(data[i][j] == 1) {
					// live cell
					if(liveNeighbors < 2)
						dataOfNextStep[i][j] = 0;
					else if(liveNeighbors == 2 || liveNeighbors == 3)
						dataOfNextStep[i][j] = 1;
					else if(liveNeighbors > 3)
						dataOfNextStep[i][j] = 0;
				} else {
					// dead cell
					if(liveNeighbors == 3)
						dataOfNextStep[i][j] = 1;
				}
			}
		}
	}
}
