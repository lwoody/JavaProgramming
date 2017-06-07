package Practice;

public class StackTest{
	public static void main(String[] args){
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		for(int i=1;i<=7;i++){
			stack.push(i);
		}
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : "+stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : "+stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : "+stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for(int i=1;i<=10;i++){
			int num=stack.pop();
			if(num!=-1){
				System.out.println(num);
			}
		}
		
		
		
		
	}
}

class MyStack{
	int[] array;
	int top=0;
	
	public MyStack(int num){
		if(num<0){
			this.array = new int[10];
		}
		this.array = new int[num];
	}
	
	void push(int item){
		if(top!=this.array.length){
			this.array[top]=item;
			top++;
		}
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
			return -1;
		}
	}
}
