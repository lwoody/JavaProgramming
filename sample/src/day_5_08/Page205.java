package day_5_08;

public class Page205 {

	public static void main(String[] args) {
		
		String[] s1 = new String[5];
		s1[0] = new String("hello");
		s1[1] = new String("hello2");
		s1[2] = "hello3";
		for(String data:s1){
			if(data==null){
				continue;
			}
			else{
				System.out.println(data.charAt(0));
			}
		}
	}

}
