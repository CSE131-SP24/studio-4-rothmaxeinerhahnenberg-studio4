package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;


public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0, 16);
		StdDraw.setYscale(0, 16);
		
		StdDraw.clear();
		StdDraw.setPenColor(200, 220, 255);
		StdDraw.filledRectangle(0, 0, 16, 16);
		StdDraw.setPenColor(236, 88, 0);
		StdDraw.filledRectangle(11, 2, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
		StdDraw.setPenColor(50, 200, 200);
		StdDraw.filledCircle(3, 3, 3);
		StdDraw.setPenColor(100, 100, 200);
		StdDraw.filledCircle(15, 15, 10);
		StdDraw.setPenColor(255, 140, 0);
		StdDraw.filledRectangle(0, 0, 7, 2);
		StdDraw.filledRectangle(0, 0, 2, 10);
		
	}
}