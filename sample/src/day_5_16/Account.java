package day_5_16;

public class Account {

	private String accNo;
	private int balance;
	static int count = 1;

	public Account() {
		this("2017_00" + count, 5000);
	}

	public Account(int balance) {
		this("2017_00" + count, balance);
	}

	public Account(String no, int balance) {
		this.accNo = no;
		this.balance = balance;
		count++;
	}

	public void save(int amount) {
		System.out.printf("save : %d to account %s%n", amount, this.accNo);
		setBalance(getBalance() + amount);
	}

	public int withdraw(int amount) {

		if (getBalance() > amount) {
			int balance = getBalance() - amount;
			setBalance(balance);
			System.out.printf("withdraw : %d%n", amount);
			return amount;
		} else {
			System.out.println("Withdraw refusal : exceed amount");
			return 0;
		}

	}

	public String getAccNo() {

		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public int getBalance() {

		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
