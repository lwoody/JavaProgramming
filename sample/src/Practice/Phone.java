package Practice;

class PhoneInfo {
	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString(){
		return name;
	}
	
	public void equals(){
		
	}
	
	
}

class PhoneManager {
	PhoneInfo[] storage = new PhoneInfo[100];

	public void readData() {
		// Ű����� ���� name , phoneNumber ������ �Է¹޾�
		// PhoneInfo ��ü�� ���� storage �� ��� �մϴ�.
		// �ڵ� �ۼ�

	}

	public void view() {
		System.out.println("==  ��ü  ������  ����   == ");
		// �ڵ��ۼ��ϼ���
	}

	public void searchName() {
		// �˻� �� �̸��� Ű����� ���� �Է¹޾�
		// �˻� ����� ����մϴ�.

	}

	public void searchNumber() {
		// �˻� �� ��ȭ��ȣ�� Ű����� ���� �Է¹޾�
		// �˻� ����� ����մϴ�.

	}
}

public class Phone {

}
