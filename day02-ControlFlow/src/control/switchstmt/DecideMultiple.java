package control.switchstmt;

import java.util.Scanner;

/**
 *입력된 자연수가 3의 배수인지
 *판별하는 클래스
 *
 * 배수 판단에 switch 구문을 활용
 * @author PC38215
 *
 */
public class DecideMultiple {

	public static void main(String[] args) {
		//1.선언
		int input; 
		//스캐너 선언
		Scanner scan;
		
		//2.초기화
		//스캐너 변수 초기화
		scan = new Scanner(System.in);
		
		System.out.println("자연수를 입력하세요");
		input = scan.nextInt();
		
		//3.사용 : input 변수의 값이 3의 배수인지 판단
		//		  사용
		switch (input % 3) {
		case 0:
			System.out.printf("입력 값 %d는 3의 배수입니다.%n", input);
			break;
		case 1:
			System.out.printf("입력 값 %d는 3의 배수가 아닙니다.%n", input);
			break;
		case 2:
			System.out.printf("입력 값 %d는 3의 배수가 아닙니다.%n", input);
			break;
//		default:
	//		break;
		} //end switch
		scan.close();
	}//end main

}//end class
