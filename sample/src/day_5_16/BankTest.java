package day_5_16;

public class BankTest {

	public static void main(String[] args) {

		Account[] b1Accounts = new Account[10];
		for (int i = 0; i < b1Accounts.length; i++) {
			b1Accounts[i] = new Account();
		}
		Bank b1 = new Bank(b1Accounts);

		// 0 to 1
		b1.accounts[1].save(b1.accounts[0].withdraw(1000));

		b1.print();
		b1.addAccount(new Account());
		b1.addAccount(new Account());

		b1.print();

		System.out.println("== search 2017_001 ==");
		System.out.println(b1.searchAccount("2017_0012").getAccNo());

		System.out.println("\n== save money to 2017_001 ==");
		Account ac = b1.searchAccount("2017_0012");
		ac.save(100);

	}

}
