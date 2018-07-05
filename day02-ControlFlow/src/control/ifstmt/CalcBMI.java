package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		//1.선언
		double height;
		double weight;
		double bmi;
		Scanner scan;
		
		//2.초기화
		scan = new Scanner(System.in);
		height = 0.0;
		weight = 0.0;
		
		//3.사용
		System.out.println("몸무게를 입력해주세요:");
		weight = scan.nextDouble();
		System.out.println("키를 입력해주세요:");
		height = (scan.nextDouble())/100;
		bmi = weight / (height * height);
		
		if(bmi>40.0) {
			System.out.println("병적인 비만");
		}else if(bmi>27.5) {
			System.out.println("비만");
		}else if(bmi>23.0) {
			System.out.println("과체중");
		}else if(bmi>18.5) {
			System.out.println("정상");
		}else if(bmi>15.0) {
			System.out.println("저체중");
		}else {
			System.out.println("병적인 저체중");
			
		}
	}

}
