package control.loop;

/**
 * 1에서 100사이의 홀수의 합을 구하는 클래스
 * while구문을 활용
 * @author PC38215
 *
 */
public class SumOfOdd {

	public static void main(String[] args) {
		//1.선언, 2.초기화
		//1~100까지 증가시킬 값을 저장하는 변수 선언
		int number = 1;
		int sum = 0;
		
		//3.사용
		while(number <= 100) {
			sum += number;
			number += 2;
		}
		
		System.out.printf("1에서 100사이의 홀수의 합은 %d%n", sum);
	}

}
