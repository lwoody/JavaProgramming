package day_6_2;

import java.util.Scanner;

public class ConditionFactorTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게 입력 :");
		double weight = sc.nextDouble();
		System.out.print("키 입력 :");
		double height = sc.nextDouble();

		ConditionFactor cf = new ConditionFactor(weight, height);
		System.out.println("결과 :" + cf.result);
	}

}

class ConditionFactor {

	final int stweight = 30;
	double weight;
	double height;
	double bmi;
	String result;

	public ConditionFactor(double weight, double height) {
		this.height = height;
		this.weight = weight;
		this.bmi = weight / Math.pow(height * 0.01, 2);
		if (bmi >= stweight)
			this.result = "비만";
		else if (bmi >= 25.0)
			this.result = "과체중";
		else if (bmi >= 20.0)
			this.result = "보통";
		else
			this.result = "정상";
	}

}
