
public class Stock {
	private static int stockNum;
	private String stockName;
	private double openingPrice;
	private double closingPrice;
	private double gain;

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getOpeningPrice() {
		return openingPrice;
	}

	public void setOpeningPrice(double openingPrice) {
		this.openingPrice = openingPrice;
	}

	public double getClosingPrice() {
		return closingPrice;
	}

	public void setClosingPrice(double closingPrice) {
		this.closingPrice = closingPrice;
	}

	public static int getStockNum() {
		return stockNum;
	}

	public static void setStockNum(int stockNum) {
		Stock.stockNum = stockNum;
	}

	public String toString() {
		return "Stock [name=" + stockName + ", opening=" + openingPrice + ", closing=" + closingPrice
				+ "]";
	}

	public double getGain() {
		return gain;
	}

	public void setGain(double openingPrice, double closingPrice) {
		this.gain = (closingPrice - openingPrice) / openingPrice;
	}

}
