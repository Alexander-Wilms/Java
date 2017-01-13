package gnuplotFourierSeries;

import com.panayotis.gnuplot.JavaPlot;

public class gnuplotFourierSeries {

	public static void main(String[] args) {
		JavaPlot myJavaPlot = new JavaPlot(false);

		myJavaPlot.set("samples", "10000");

		myJavaPlot.set("xrange", "[-1:1]");

		myJavaPlot.set("key", "off");

		String plotCommand = "0";

		int f = 1;

		int iterations = 100;

		for(int k = 1; k<iterations+1; k++) {
			plotCommand += "+4/pi*(sin(2*pi*(2*" + k + "-1)*" + f + "*x))/(2*" + k + "-1)";
		}
		
		myJavaPlot.addPlot(plotCommand);
		
		myJavaPlot.plot();
	}
}
