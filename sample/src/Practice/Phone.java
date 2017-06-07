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
		// 키보드로 부터 name , phoneNumber 정보를 입력받아
		// PhoneInfo 객체를 생성 storage 에 등록 합니다.
		// 코드 작성

	}

	public void view() {
		System.out.println("==  전체  데이터  보기   == ");
		// 코드작성하세요
	}

	public void searchName() {
		// 검색 할 이름을 키보드로 부터 입력받아
		// 검색 결과를 출력합니다.

	}

	public void searchNumber() {
		// 검색 할 전화번호를 키보드로 부터 입력받아
		// 검색 결과를 출력합니다.

	}
}

public class Phone {

}
