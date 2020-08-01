import java.util.Scanner;
import java.util.Arrays;

public class StockMarket {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many companies do you want to list? ");
		Stock.setStockNum(input.nextInt());

		Stock[] stockCompanies = new Stock[Stock.getStockNum()];
		int highestGainIndex = 0;

		for (int i = 0; i < Stock.getStockNum(); i++) {

			stockCompanies[i] = new Stock();
			System.out.print("Company: ");
			stockCompanies[i].setStockName(input.next());

			System.out.print("Opening price: ");
			stockCompanies[i].setOpeningPrice(input.nextDouble());

			System.out.print("Closing price: ");
			stockCompanies[i].setClosingPrice(input.nextDouble());
			
			stockCompanies[i].setGain(stockCompanies[i].getOpeningPrice(), stockCompanies[i].getClosingPrice());

		}
		for(int i = 0; i < stockCompanies.length - 1; i++) {
			if(stockCompanies[i].getGain() < stockCompanies[i+1].getGain()) {
				highestGainIndex = i + 1;
			}
		}
		
		System.out.println(Arrays.toString(stockCompanies));
		System.out.println("Highest gainer is " + stockCompanies[highestGainIndex]);

		input.close();
	}

}
