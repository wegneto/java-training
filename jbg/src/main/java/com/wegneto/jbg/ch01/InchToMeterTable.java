package com.wegneto.jbg.ch01;

public class InchToMeterTable {

	public static void main(String args[]) {
		double inches, meters;
		int counter = 0;

		for (inches = 1; inches <= 100; inches++) {
			meters = inches / 30.37; // convert to liters
			System.out.println(inches + " inches is " + meters + " meters.");
			counter++;
			// every 12th line, print a blank line
			if (counter == 12) {
				System.out.println();
				counter = 0; // reset the line counter
			}
		}
	}

}
