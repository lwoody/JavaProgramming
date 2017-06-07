package day_5_16;

import java.util.Arrays;

public class Bank {

	Account[] accounts;
	int currentNum;

	public Bank() {
		this(new Account[70]);
		currentNum=0;
	}

	public Bank(Account... acArray) {
		this.currentNum = acArray.length;
		this.accounts = Arrays.copyOf(acArray, currentNum + 30);
	}

	public void addAccount(Account ac) {

		this.accounts[this.currentNum] = ac;
		this.currentNum++;
	}

	public Account searchAccount(String accNo) {
		for (Account data : this.accounts) {
			if (data != null && data.getAccNo().equals(accNo)) {
				// System.out.printf("Account info[%s,%d]%n", data.getAccNo(),
				// data.getBalance());
				return data;
			}
		}
		return null;
	}

	public void print() {
		int i = 1;
		for (Account data : this.accounts) {
			if (data != null) {
				System.out.printf("Account %d info[%s,%d]%n", i, data.getAccNo(), data.getBalance());
				i++;
			}
		}
	}

}
