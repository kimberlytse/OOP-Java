//Kimberly Tse
//Test 2
public class TestStock {
	public static void main(String[] args) {
		StockMarket company1 = new StockMarket();
		StockMarket company2 = new StockMarket();

		company1.setStockName("Microsoft");
		company2.setStockName("Apple");

		company1.setInitialStockValue(10.54);
		company2.setInitialStockValue(12.27);

		company1.setFinalStockValue(11.41);
		company2.setFinalStockValue(12.88);

		System.out.println(company1.getStockName() + " started with " + company1.getInitialStockValue()
				+ " closed with " + company1.getFinalStockValue());

		System.out.println(company2.getStockName() + " started with " + company2.getInitialStockValue()
				+ " closed with " + company2.getFinalStockValue());

		System.out.println("The company of " + company1.getStockName() + " has a stock value average of "
				+ company1.getStockAverge());

		System.out.println("The company of " + company2.getStockName() + " has a stock value average of "
				+ company2.getStockAverge());
	}
}
