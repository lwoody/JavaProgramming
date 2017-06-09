package p075_join_noArgsQ;

//GirlFriend.java

class GirlFriend extends Thread {
	public void run() {
		
		for(int i=0;i<5;i++){
			System.out.print(i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("지금 지하철타러 가는중");
			
		}
		
	}
}