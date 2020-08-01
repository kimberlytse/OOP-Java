
//Kimberly Tse
//Compute BMI

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ComputeBMI {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		final float CONVERT_2_KILOS = 0.45359237f;
		final float CONVERT_2_METERS = 0.0254f;

		String askPounds = JOptionPane.showInputDialog("Enter your weight in pounds. ");
		String askHeight = JOptionPane.showInputDialog("Enter your height in inches. ");

		int poundWeight = Integer.parseInt(askPounds);
		int inchHeight = Integer.parseInt(askHeight);

		float kilos = poundWeight * CONVERT_2_KILOS;
		float meters = inchHeight * CONVERT_2_METERS;
		String calcBodyMassIndex = df.format(kilos / (meters * meters));

		JOptionPane.showMessageDialog(null, "Weight is: " + poundWeight + " pounds\nHeight is: " + inchHeight
				+ " inches\nYour BMI is: " + calcBodyMassIndex + "\n Kim is fat :P");

		System.exit(0);
	}

}
