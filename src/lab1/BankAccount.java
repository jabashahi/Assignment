package lab1;

public class BankAccount {
	private String name;
	private int accNo;
	private double balance;
	private double interest;

	public BankAccount(String n, int a, double amount) {
		name = n;
		accNo = a;
		balance = amount;
		interest = amount;
	}

	public BankAccount(String n, int a, double initialBalance, double initialInterest) {
		name = n;
		accNo = a;
		balance = 0.00;
		balance = initialBalance;
		interest = initialInterest;
	}

	public String convToString() {
		return "Account name: " + this.name + ", Account Number: " + this.accNo + ", add Interest: " + this.interest
				+ ", Available balance: " + "$" + this.balance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.err.println("Can not  deposite negative amounts. please enter a valid amounts.");
		} else {
			this.balance += amount;
			System.out.format("$%.2f has been deposited\n", amount);
		}
	}

	public void withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			System.out.format("$%.2f has been withdrawn\n", amount);
		} else {
			System.err.format("cancelled transaction due to insufficient funds. Check your balance.");
		}
	}

	public void addInterest(double amount) {
		if (this.balance == amount) {
			this.balance *= amount;
			System.out.format("$%.2f has been multiplied\n", amount);
		} else {
			System.err.format("Cancelled transaction.");
		}
	}

	public String getname() {
		return name;
	}

	public int getaccNo() {
		return accNo;
	}

	public double getInterest() {
		return interest;
	}

	public double getBalance() {
		return balance;

	}

}
