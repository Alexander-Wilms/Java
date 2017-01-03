package gnuplotViaJavaPlot;

import com.panayotis.gnuplot.JavaPlot;

public class gnuplotViaJavaPlot {

	public static void main(String[] args) {
		JavaPlot myJavaPlot = new JavaPlot(true);
		
		myJavaPlot.set("isosamples", "20");
		
		myJavaPlot.addPlot("x**2*sin(y)");
		
		myJavaPlot.plot();
	}

}
