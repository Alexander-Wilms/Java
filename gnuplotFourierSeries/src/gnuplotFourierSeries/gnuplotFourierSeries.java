package gnuplotFourierSeries;

import java.util.Scanner;

import com.panayotis.gnuplot.JavaPlot;

public class gnuplotFourierSeries {

	public static void main(String[] args) {
		JavaPlot myJavaPlot = new JavaPlot(false);

		myJavaPlot.set("samples", "10000");

		myJavaPlot.set("xrange", "[-10:10]");

		myJavaPlot.set("key", "off");
		
		String plotCommand = "1/2 - 1/pi * (";

		int omega = 1;

		int iterations;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("How many iteration?");
		
		iterations = myScanner.nextInt();
		
		myScanner.close();

		for(int k = 1; k<iterations+1; k++) {
			// 
			plotCommand += "+4/pi*(sin((2*" + k + "-1)*" + omega + "*x))/(2*" + k + "-1)";
			// sawtooth
			plotCommand += "+2/pi*((-1)**(" + k + "+1))/(" + k + ")*sin(" + k + "*x)";
			// inverse sawtooth
			//plotCommand += "+(-1)**" + k + "*sin(" + omega + "*" + k +"*x)/" + k;
		}
		
		plotCommand += ")";
		
		System.out.println(plotCommand);
		
		myJavaPlot.addPlot(plotCommand);
		
		myJavaPlot.plot();
	}
}
