package p075_join2_Args2Q;

//BoyFriend.java
/*---join()이 기다리고 있다가 수행이 넘어오면 join()의 내용을 
수행한 다음 다시 원래의 수행으로 되돌아 간다   
join()에 시간을 주지 않으면 무한 대기상태이고 
join()에 시간을 주면 그 시간이 지나면 자동으로 join()이 수행된다. */

class BoyFriend extends Thread {
	public void run() {
		GirlFriend gf1 = new GirlFriend();
		System.out.println("스마트폰으로 뉴스를 본다.");
		gf1.start();
		
		//여기실습
		try {
			gf1.join(10000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		gf1.stop();
		System.out.println("너무 늦었다 나간다");
		System.out.println("이건 뭥미~~");
		
		
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
5지금 지하철타고 가는 중~~~오빠 기다려~~
6지금 지하철타고 가는 중~~~오빠 기다려~~
7지금 지하철타고 가는 중~~~오빠 기다려~~
8지금 지하철타고 가는 중~~~오빠 기다려~~
9지금 지하철타고 가는 중~~~오빠 기다려~~
너무 늦었다~~나 간다~~~~~
늦게 도착한 여친~ 이건 뭥미~~~  

***************************/
