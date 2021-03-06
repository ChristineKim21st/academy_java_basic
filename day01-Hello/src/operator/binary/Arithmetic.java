package operator.binary;

import java.util.Scanner;

/**
 * 이항연산자 중 산술연산자(+ - * / %)를
 * 테스트하는 클래스 이다
 * 
 * printf를 써서 포맷팅하여 테스트한다.
 * 
 * 두 정수를 입력을 받아서 입력받은 값으로
 * 사칙연산과 나머지 연산을 수행한다.
 * @author PC38215
 *
 */
public class Arithmetic {

	public static void main(String[] args) {
		//키보드 입력을 쉽게 해주는 스캐너를 사용한다
		//1.선언
		//정수를 저장할 변수 선언
		int input1;
		int input2;
		
		//키보드 입력을 받는 스캐너 변수 선언
		//스캐너 변수 선언: ctrl+shif+o (자동입포트)
		Scanner scan;
		
		//2.초기화
		//스캐너변수 초기화
		scan = new Scanner(System.in);
		
		//스캐너를 사용하여 정수 값을 입력
		System.out.println("정수 두 개를 입력: ");
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d%n", input1, input2, input1+input2);
		System.out.printf("%d - %d = %d%n", input1, input2, input1-input2);
		System.out.printf("%d * %d = %d%n", input1, input2, input1*input2);
		System.out.printf("%d / %d = %d%n", input1, input2, input1/input2);
		System.out.printf("%d %% %d = %d%n", input1, input2, input1%input2);
		
		scan.close();
		
	}

}
