package p075_join_noArgsQ;

//BoyFriend.java
/*---join()�� ��ٸ��� �ִٰ� ������ �Ѿ���� join()�� ������ 
������ ���� �ٽ� ������ �������� �ǵ��� ����   
join()�� �ð��� ���� ������ ���� �������̰� 
join()�� �ð��� �ָ� �� �ð��� ������ �ڵ����� join()�� ����ȴ�. */

class BoyFriend extends Thread {
	public void run() {
		//	����ǽ� 
		System.out.println("����Ʈ������ ������ ����.");
		GirlFriend gf = new GirlFriend();
		gf.start();
		try {
			gf.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���� ��ȭ���� ����.");
	}

	public static void main(String[] args) {
		BoyFriend bf1 = new BoyFriend();
		bf1.start();
	}
}
/************************
����Ʈ������ ������ ����.
0���� ����öŸ�� ���� ��~~~���� ��ٷ�~~
1���� ����öŸ�� ���� ��~~~���� ��ٷ�~~
2���� ����öŸ�� ���� ��~~~���� ��ٷ�~~
3���� ����öŸ�� ���� ��~~~���� ��ٷ�~~
4���� ����öŸ�� ���� ��~~~���� ��ٷ�~~
���� ��ȭ���� ����.

***************************/
