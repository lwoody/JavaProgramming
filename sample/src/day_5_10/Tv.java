package day_5_10;

import java.util.Scanner;

class Television {

	int channel;
	String color;
	boolean power;
	String title="news";

	Television(String color, boolean power) {
		this.channel = 10;
		this.color = color;
		this.power = power;
	}

	void power() {
		power = !power;
		return;
	}

	void channelUp() {
		channel++;
		titleChange();
		return;
	}

	void channelDown() {
		channel--;
		titleChange();
		return;
	}

	void channelChange(int n) {
		channel = n;
		titleChange();
		return;
	}
	
	void titleChange(){
		
		if(channel==5) this.title = "show";
		else if(channel==11) this.title = "movie";
		else if(channel==9) this.title ="music";
		
		return;
	}
	
	void display(){
		System.out.printf("%nchannel : %d%ntitle : %s%ncolor : %s%n",channel,this.title,color);
	}

}

public class Tv {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		Television tv1 = new Television("red",false);
		Television tv2 = new Television("red",false);
		
		String power = sc.nextLine();
		if(power.equals("on")){
			tv1.power();
		}
		else{
			return;
		}
		
		int channelNum = sc.nextInt();
		tv1.channelChange(channelNum);
		tv1.display();
		tv2.display();
		
		sc.close();
		
		
		// other package method call
		day_5_11.Page252 t = new day_5_11.Page252();
		
		System.out.println(t.msg("lee"));

	}

}
