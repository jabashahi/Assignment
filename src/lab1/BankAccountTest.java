package lab1;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("Ram Krishna", 1, 00, 0.10);
		BankAccount ba2 = new BankAccount("Hari Raj", 2, 00, 0.10);
		BankAccount ba3 = new BankAccount("Shayam Lal", 3, 00, 0.10);

		System.out.println(ba1.convToString() + "\n");
		ba1.deposit(500);
		ba1.deposit(-10);
		ba1.deposit(250);
		ba1.withdraw(175);
		ba1.withdraw(100);
		ba1.addInterest(0.10);
		System.out.println(ba1.getname());
		System.out.println(ba1.getaccNo());
		System.out.println(ba1.getInterest());
		System.out.println(ba1.getBalance());
		System.out.println(ba1.convToString() + "\n");
	}

}
