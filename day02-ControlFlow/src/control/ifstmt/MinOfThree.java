package control.ifstmt;

import java.util.Scanner;

/**
 *세 정수를 입력 받아서
 *그 중 가장 작은 정수를 판별하는 클래스이다.
 *
 * 가장 작은 정수를 판별할 때 중첩 if-else를 사용한다.
 * @author PC38215
 *
 */
public class MinOfThree {

	public static void main(String[] args) {
		//1.선언
		int num1;
		int num2;
		int num3;
		
		//가장 작은 값을 저장 할 변수
		int min;
		
		//스캐너 선언
		Scanner scan;
		
		//2.초기화
		//스캐너 변수 초기화
		scan = new Scanner(System.in);
		
		//스캐너를 사용하여 num1, num2, num3 변수 초기화(입력)
		System.out.println("세 정수를 입력(스페이스바로 분리해서 입력)");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		//3.사용
		if(num1 < num2) {
			if(num1<num3) {
				min = num1;
			}else {
				min = num3;
			}
		}else {
			if(num2<num3) {
				min = num2;
			}else {
				min = num3;
			}
		}
		System.out.printf("입력된 세 값 %d, %d, %d 중 가장 작은 값 : %d%n", num1, num2, num3, min);
		scan.close();
	}

}