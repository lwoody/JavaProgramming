package day_5_26;

public class StackThread{
	public static void main(String[] args){
		
		PushPop p = new PushPop();
		p.start();
	
	}
}

class PushPop{
	MyStack stack = new MyStack(10);
	
	synchronized void push(int i){
		if(this.stack.isFull()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.stack.push(i);
		System.out.println("push()<=="+i);
		notifyAll();
	}
	
	synchronized int pop(){
		if(this.stack.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int i = this.stack.pop();
		System.out.println("pop()<=="+i);
		notifyAll();
		return i;
	}
	
	//클래스 내부에 스레드들 시작해주는 메소드를 아예 만듬 -> 메인 메소드 안에 객체생성해서 함수 불러주면 동작함
	void start(){
		PushPop p = new PushPop();
		Pop pop= new Pop(p);
		Push push= new Push(p);
		
		Thread t1 = new Thread(pop);
		Thread t2 = new Thread(push);
		
		t1.start();
		t2.start();
	}
}

class Pop implements Runnable{
	
	PushPop p;
	
	public Pop(PushPop p){
		this.p = p;
	}

	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			int k = p.pop();
		}
	}

}

class Push implements Runnable{
	
	PushPop p;
	
	public Push(PushPop p){
		this.p = p;
	}	

	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			p.push(i);
		}
	}
	
}

class MyStack {
	int[] array;
	int top=0;
	
	public MyStack(int num){
		if(num<0){
			this.array = new int[10];
		}
		this.array = new int[num];
	}
	
	boolean isEmpty(){
		return top!=0 ? false:true;
	}
	
	boolean isFull(){
		return top==this.array.length ? true:false;
	}
	
	int top(){
		if(top!=0){
			int item=this.array[top-1];
			return item;
		}
		else{
			System.out.println("스택이 비었습니다.");
			return -1;
		}
	}
	
	int pop(){
		if(top!=0){
			int item=this.array[top-1];
			this.array[top-1]=0;
			top--;
			return item;
		}
		else{
			System.out.println("스택이 비었습니다.");
			return -1;
		}
	}
	
	void push(int item){
		if(top!=this.array.length){
			this.array[top]=item;
			top++;
		}
		else{
			System.out.println("스택이 가득찼습니다.");
		}
	}
	

	
}
