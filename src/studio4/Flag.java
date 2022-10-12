package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.GREEN);
		double[] x = {0, 0.5, 1};
		double[] y = {0, 0.6, 0};
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledEllipse(0.25, 0.1, 0.05, 0.025);
		StdDraw.filledEllipse(0.5, 0.1, 0.05, 0.025);
		StdDraw.filledEllipse(0.75, 0.1, 0.05, 0.025);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.line(0.78, 0.85, 0.78, 0.75);
		StdDraw.line(0.78, 0.75, 0.85, 0.75);
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.02);
		StdDraw.circle(0.8, 0.8, 0.1);
		StdDraw.line(0.73, 0.73, 0.87, 0.87);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0, 1, 0.3);
		StdDraw.line(0.06, 0.66, 0.06, 0.5);
	}
}  