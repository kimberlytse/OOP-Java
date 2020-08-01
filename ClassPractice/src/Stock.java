
public class Stock {
	private String stockName;
	private double opening;
	private double closing;
	
	public Stock() {
		
	}
	public Stock(String stockName, double opening, double closing) {
	
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public double getOpening() {
		return opening;
	}
	public void setOpening(double opening) {
		this.opening = opening;
	}
	public double getClosing() {
		return closing;
	}
	public void setClosing(double closing) {
		this.closing = closing;
	}
}
