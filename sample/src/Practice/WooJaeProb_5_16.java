package Practice;

class BookMgr {

	Book[] bookList;
	int currentNum = 0;

	public BookMgr(int numOfList) {
		this.bookList = new Book[numOfList];
	}

	public void printBooklist() {
		for (Book data : this.bookList) {
			if (data != null) {
				System.out.println(data.getTitle());
			}
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		for (Book data : this.bookList) {
			if (data != null) {
				sum += data.getPrice();
			}
		}
		System.out.println("전체 책 가격의 합 : " + sum);
	}

	public void add(Book book) {
		if (this.currentNum != this.bookList.length) {
			this.bookList[this.currentNum] = book;
			this.currentNum++;
		} else {
			System.out.println("no room exist");
		}
	}

	public void remove(String title) {
		for (int i = 0; i < this.bookList.length; i++) {
			if (this.bookList[i] != null && this.bookList[i].getTitle().equals(title)) {
				this.remove(i + 1);
			}
		}
	}

	public void remove(int pointer) {
		if (this.bookList[pointer - 1] != null) {
			this.bookList[pointer - 1] = null;
			for (int i = pointer; i < this.currentNum; i++) {
				this.bookList[i - 1] = this.bookList[i];
				this.bookList[i] = null;
			}
			this.currentNum--;
		} else {
			System.out.println("no book exist");
		}
	}

}

class Book {

	private String title;
	private int price;

	public Book(String title, int price) {
		this.setTitle(title);
		this.setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class WooJaeProb_5_16 {

	public static void main(String[] args) {
		// 10권 저장 가능한 매니저
		BookMgr manager = new BookMgr(10);

		// 메모리 낭비됨
		// Book b1 = new Book("Java Program", 1000);
		// Book b2 = new Book("Jsp Program", 1000);
		// Book b3 = new Book("SQL Fundamentals", 1000);
		// Book b4 = new Book("JDBC Program", 1000);
		// Book b5 = new Book("EJB Program", 1000);

		Book[] list = { new Book("Java Program", 1000), new Book("Jsp Program", 1000),
				new Book("SQL Fundamentals", 1000), new Book("JDBC Program", 1000), new Book("EJB Program", 1000) };

		for (int i = 0; i < list.length; i++) {
			manager.currentNum++;
			manager.bookList[i] = list[i];
		}

		System.out.println("=== 책 목록 ===");
		manager.printBooklist();

		System.out.println("\n=== 책 가격의 총합 ===");
		manager.printTotalPrice();

		System.out.println("\n=== 추가 후 책 목록 ===");
		manager.add(new Book("llll", 2000));
		manager.add(new Book("cccc", 2000));
		manager.add(new Book("kkkk", 2000));
		manager.add(new Book("nnnn", 2000));
		manager.add(new Book("mmmm", 2000));
		manager.remove(5);
		manager.remove("llll");
		manager.printBooklist();
		System.out.println(manager.currentNum);

	}

}
