package day_5_10;

import java.util.Arrays;

public class Page218 {

	public static void main(String[] args) {
		
		int[][] n = {{1},{3,2,6,4},{1,3,4}};
		String[] names = {"lee","kim","park"};
		int[][] score = {{99,88,100},{99,80,70},{83,77,99}};
		
		for(int[] list:n){
			System.out.println(Arrays.toString(list));
		}
		
		for(int i=0;i<n.length;i++){
			System.out.println();
			for(int j=0;j<n[i].length;j++){
				System.out.print(n[i][j]+" ");
			}
		}
		
		System.out.println("\n=====================\n");
		
		int subject1_total=0;
		int subject2_total=0;
		int subject3_total=0;
		int[] subject_total = new int[score[0].length];
		int[] person_total = new int[score.length];
		
		for(int i=0;i<score.length;i++){
			
			for(int j=0;j<score[i].length;j++){
				person_total[i]+=score[i][j];
				subject_total[j]+=score[i][j];
			}
			
			System.out.printf("%s : %d %4.1f\n",names[i],person_total[i],person_total[i]/3.);
		}
		
		System.out.println("\n°ú¸ñº° ÃÑÁ¡ ¹× Æò±Õ");
		for(int i=0;i<score[0].length;i++){
			System.out.printf("%d°ú¸ñ ÃÑÁ¡: %d Æò±Õ : %4.1f\n",i+1,subject_total[i],subject_total[i]/(float)score[0].length);
		}
		
		
	}

}
