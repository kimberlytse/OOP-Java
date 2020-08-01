
//Kimberly Tse
//updated
import java.util.Date;
import java.text.SimpleDateFormat;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public void Date() {
	}

	public Account() {
		setId(000);
		balance = 0.00;
		setAnnualInterestRate(0.000);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		dateCreated = new Date(System.currentTimeMillis());
	}

	public void setAccount(int id, double balance, double annualInterestRate, Date dateCreated) {
		this.setId(id);
		this.balance = balance;
		this.setAnnualInterestRate(annualInterestRate);
		this.dateCreated = dateCreated;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public Date getDataCreated() {
		return dateCreated;
	}

	public double withdrawal(double withdrawal) { // sued
		balance = balance - withdrawal;
		return balance;
	}

	public double deposit(double deposit) { // used
		balance = balance + deposit;
		return balance;
	}

}
