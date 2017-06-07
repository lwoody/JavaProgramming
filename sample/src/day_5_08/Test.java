package day_5_08;

public class Test {

	public static void main(String[] args) {
		
		// 1+(-2)+3+(-4)+... 했을때 몇까지 더해야 100 이상이 되는지?
		
		int i = 0;
		int sum = 0;
		while(sum<100){
			
			i++;
			
			if(i%2==0){
				int j=i*-1;
				sum+=j;
			}
			
			else{
				sum+=i;
			}
		}
		
		System.out.println(i);
		System.out.println(sum);
		
		
		int sum2=0;
		int result=0;
		for(int k=1;true;k++){
			
			int num = k%2==0? k*-1:k;
			sum2+=num;
			if(sum2>=100){ result = k; break;}
			
		}
		
		System.out.println(sum2);
		System.out.println(result);
				
	}

}
