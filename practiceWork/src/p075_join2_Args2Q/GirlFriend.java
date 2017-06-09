package p075_join2_Args2Q;

//GirlFriend.java

class GirlFriend extends Thread {
	public void run() {
		
		int i=0;
		
		while(true){
			System.out.print(i);
			i++;
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("지금 지하철타러 가는중");
			
		}
		
	}
}