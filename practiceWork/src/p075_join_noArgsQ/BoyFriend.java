package p075_join_noArgsQ;

//BoyFriend.java
/*---join()이 기다리고 있다가 수행이 넘어오면 join()의 내용을 
수행한 다음 다시 원래의 수행으로 되돌아 간다   
join()에 시간을 주지 않으면 무한 대기상태이고 
join()에 시간을 주면 그 시간이 지나면 자동으로 join()이 수행된다. */

class BoyFriend extends Thread {
	public void run() {
		//	여기실습 
		System.out.println("스마트폰으로 뉴스를 본다.");
		GirlFriend gf = new GirlFriend();
		gf.start();
		try {
			gf.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("같이 영화보러 들어간다.");
	}

	public static void main(String[] args) {
		BoyFriend bf1 = new BoyFriend();
		bf1.start();
	}
}
/************************
스마트폰으로 뉴스를 본다.
0지금 지하철타고 가는 중~~~오빠 기다려~~
1지금 지하철타고 가는 중~~~오빠 기다려~~
2지금 지하철타고 가는 중~~~오빠 기다려~~
3지금 지하철타고 가는 중~~~오빠 기다려~~
4지금 지하철타고 가는 중~~~오빠 기다려~~
같이 영화보러 들어간다.

***************************/
