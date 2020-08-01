import java.util.Scanner;

public class QuarterlySalesStats {
	public static void enterSalesFigs(double[][] companyInfo) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < companyInfo.length; i++) {
			for (int j = 0; j < companyInfo[i].length; j++) {
				System.out.printf("Enter division %d's sales figure for quarter %d: ", i + 1, j + 1);
				companyInfo[i][j] = input.nextDouble();
			}
		}
		System.out.println();
		input.close();
	}

	public static void listSalesFigs(double[][] companyInfo) {
		System.out.println("=== Quarterly Sales Figures ===\n");
		System.out.println("-----------\nLISTING\n-----------\n");
		for (int i = 0; i < companyInfo.length; i++) {
			System.out.printf("Division: %d\n-----------\n", i + 1);
			for (int j = 0; j < companyInfo[i].length; j++) {
				System.out.printf("Quarter %d: %.2f\n", j + 1, companyInfo[i][j]);
			}
			System.out.println();
		}
	}

	public static void statsFigs(double[][] companyInfo) {
		System.out.println("-----------\nSTATS\n-----------\n");
		double div1Sum = 0;
		double div2Sum = 0;
		double div3Sum = 0;
		double div4Sum = 0;
		for (int i = 0; i < companyInfo.length; i++) {
			for (int j = 0; j < companyInfo[i].length; j++) {
				switch (j) {
				case 0:
					div1Sum += companyInfo[i][j];
					break;
				case 1:
					div2Sum += companyInfo[i][j];
					break;
				case 2:
					div3Sum += companyInfo[i][j];
					break;
				case 3:
					div4Sum += companyInfo[i][j];
					break;
				}
			}
		}
		double div1Avg = div1Sum / 4;
		double div2Avg = div2Sum / 4;
		double div3Avg = div3Sum / 4;
		double div4Avg = div4Sum / 4;

	}

	public static void main(String[] args) {
		int numDivisions = 6;
		int numQuarters = 4;

		double[][] companyInfo = new double[numDivisions][numQuarters];
		enterSalesFigs(companyInfo);
		listSalesFigs(companyInfo);
		statsFigs(companyInfo);

	}
}
