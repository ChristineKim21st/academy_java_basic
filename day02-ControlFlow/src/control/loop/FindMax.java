package control.loop;

import java.util.Scanner;

/**
 * 입력된 자연수들 중에서 최댓값을 찾는 클래스
 * 
 * do~while을 활용
 * @author PC38215
 *
 */
public class FindMax {

	public static void main(String[] args) {
		//1.선언
		int input;
		int max;
		//스캐너 선언
		Scanner scan;
		//2.초기화
		max = 0;
		scan = new Scanner(System.in);
		
		
		//3.사용
		do {
			System.out.println("양수를 입력(끝내려면 0을 입력)");
			input = scan.nextInt();
			
			if(input > max) {
				max = input;
			}
		}while(input>0);
	
		System.out.printf("최댓값은 %d 입니다", max);
		scan.close();
	}

}
