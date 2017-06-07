package util;


import java.util.Scanner;

public class Calc {

	public static int addition(int n1, int n2) {
		return n1 + n2;
	}
	
	public static double addition(double n1, double n2){
		return n1+n2;
	}
	
//	public static int addition(int[] a){
//		int sum=0;
//		for(int data : a){
//			sum+=data;
//		}
//		return sum;
//	}
	
	public static int addition(int ... list){
		int sum=0;
		for(int data:list){
			sum+=data;
		}
		return sum;
	}

	public static int subtract(int n1, int n2) {
		return n1 > n2 ? n1 - n2 : n2 - n1;
	}

	public static int divide(int n1, int n2) {
		return n1 > n2 ? n1 / n2 : n2 / n1;
	}

	public static int multiply(int n1, int n2) {
		return n1 * n2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[] arr = {1,2,3};

		System.out.printf("addition : %d %n", Calc.addition(n1, n2));
		System.out.printf("addition : %d %n", Calc.addition(arr));
		System.out.printf("addition : %f %n", Calc.addition(5.5, 7.7));
		System.out.printf("subtract : %d %n", Calc.subtract(n1, n2));
		System.out.printf("divide   : %d %n", Calc.divide(n1, n2));
		System.out.printf("multiply : %d %n", Calc.multiply(n1, n2));

		sc.close();

	}

}