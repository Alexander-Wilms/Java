import java.awt.Component;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ConwaysGameOfLife {

	static final int size = 500;
	
	static boolean[][] data, dataOfNextStep;

	static Component comp;
	
	static int[][] neighbors = {
			{-1, -1}, 	// links unten
			{0,-1},		// unten
			{1,-1},		// rechts unten
			{1,0},		// rechts
			{1,1},		// rechts oben
			{0,1},		// oben
			{-1,1},		// links oben
			{-1,0}};	// links
	
	static boolean[][] glider = {
			{false,false,true},
			{true,false,true},
			{false,true,true}};
	
	static boolean[][] blinker = {
			{false,true,false},
			{false,true,false},
			{false,true,false}};

	static Random rand;
	
	static int a, b, c, d;
	
	public static void main(String[] args) {
		rand = new Random();
		rand.setSeed(System.currentTimeMillis());

		// http://stackoverflow.com/questions/363681/generating-random-integers-in-a-specific-range	
		a = ThreadLocalRandom.current().nextInt(0, size);
		b = ThreadLocalRandom.current().nextInt(0, size);
		c = ThreadLocalRandom.current().nextInt(0, size);
		d = ThreadLocalRandom.current().nextInt(0, size);
		
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		comp = new Display(size);
		jf.add(comp );
		jf.pack();
		jf.setVisible(true);

		run();
	}

	private static void run() {
		data = new boolean[size][size];
		dataOfNextStep = new boolean[size][size];

		for(int i = 0; i <size; i++) {
			for(int j = 0; j < size; j++) {
				data[i][j] = false;
				dataOfNextStep[i][j] = false;
			}
		}

		for(int i = 0; i < 1000; i++)
			initRand();
		
		//initPattern(glider,3,3);
		
		while(true) {			
			computeNextStep();
			
			// http://stackoverflow.com/questions/1686425/copy-a-2d-array-in-java
			for(int i = 0; i < size; i++)
			    data[i] = dataOfNextStep[i].clone();
			
			for(int i = 0; i <size; i++) {
				for(int j = 0; j < size; j++) {
					dataOfNextStep[i][j] = false;
				}
			}

			((Display) comp).setdata(data);

			comp.repaint();
		}
	}

	private static void initRand() {
		System.out.println(min(a,b));
		System.out.println(max(a,b));
		System.out.println(min(c,d));
		System.out.println(max(c,d));
		
		for(int i = min(a,b); i < max(a,b); i++) {
			
			for(int j = min(c,d); j < max(c,d); j++) {
				
				if(rand.nextBoolean()) {
					data[i][j] = true;
				}
			}
		}
	}
	
	private static int min(int a, int b) {
		return a < b? a : b;
	}
	
	private static int max(int a, int b) {
		return a > b? a : b;
	}
	
	private static void initPattern(boolean[][] glider2, int width, int height) {
		int x = size/2-width/2, y = size/2-height/2;
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				data[x+i][y+j] = glider2[i][j];
				System.out.println(data[x+i][y+j]);
			}
		}
	}
	
	private static void printData() {
		for(int i = 0; i <size; i++) {
			for(int j = 0; j <size; j++) {
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}
	
	private static void computeNextStep() {
		int liveNeighbors = 0;
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				liveNeighbors = 0;
				
				//printData();
				
				for(int k = 0; k < 8; k++) {
					if(0 <= i+neighbors[k][0] && i+neighbors[k][0] < size && 0 <= j+neighbors[k][1] && j+neighbors[k][1] < size) {
						//System.out.println("Testing " + (i+neighbors[k][1]) + ", " + (j+neighbors[k][0]));
						if(data[i+neighbors[k][0]][j+neighbors[k][1]] == true) {
							//System.out.println("Someone lives here");
							liveNeighbors++;
						}
					}
				}
				
				//System.out.println(i + " " + j +": " + liveNeighbors + "alive neighbors");
				
				if(data[i][j] == true) {
					// live cell
					if(liveNeighbors < 2)
						dataOfNextStep[i][j] = false;
					else if(liveNeighbors == 2 || liveNeighbors == 3)
						dataOfNextStep[i][j] = true;
					else if(liveNeighbors > 3)
						dataOfNextStep[i][j] = false;
				} else if(data[i][j] == false){
					// dead cell
					if(liveNeighbors == 3)
						dataOfNextStep[i][j] = true;
				}
			}
		}
	}
}
