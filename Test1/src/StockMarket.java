//Kimberly Tse
//Test 2
public class StockMarket {
	private String stockName;
	private double initialStockValue;
	private double finalStockValue;

	public StockMarket() {
		this.setStockName(null);
		this.setInitialStockValue(0);
		this.setFinalStockValue(0);

	}

	public StockMarket(String stockName, double initialStockValue, double finalStockValue) {
		this.setStockName(stockName);
		this.setInitialStockValue(initialStockValue);
		this.setFinalStockValue(finalStockValue);
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockMarket) {
		this.stockName = stockMarket;
	}

	public double getInitialStockValue() {
		return initialStockValue;
	}

	public void setInitialStockValue(double initialStockValue) {
		this.initialStockValue = initialStockValue;
	}

	public double getFinalStockValue() {
		return finalStockValue;
	}

	public void setFinalStockValue(double finalStockValue) {
		this.finalStockValue = finalStockValue;
	}

	public double getStockAverge() {
		return (finalStockValue + initialStockValue) / 2;
	}

}
