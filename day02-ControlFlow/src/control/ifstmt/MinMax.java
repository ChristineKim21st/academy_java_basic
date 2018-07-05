package control.ifstmt;

import java.util.Scanner;

/**
 * 두 정수를 입력받아
 * 둘 중 큰 값, 작은 값을 가려내는 클래스
 * @author PC38215
 *
 */
public class MinMax {

	public static void main(String[] args) {
		//1.선언
		
		//스캐너로 입력받을 변수 선언
		int x, y;
		
		//큰값, 작은 값 저장할 변수 선언
		int min, max;
		
		//스캐너 변수 선언
		Scanner scan;
		
		//2.초기화
		//스캐너 변수 초기화
		scan = new Scanner(System.in);
		System.out.println("두 정수를 입력(space bar)로 분리 입력");
		
		//스캐너로 입력 받은 값 x, y 변수 초기화
		x = scan.nextInt();
		y = scan.nextInt();
		
		//3.사용 : if-else로직 전개
		if(x<y) {
			min = x;
			max = y;
		}else {
			min = y;
			max = x;
		}
		//출력
		System.out.printf("입력된 두 정수는: %d, %d%n", x, y);
		System.out.printf("작은 값: %d%n", min);
		System.out.printf("큰 값: %d%n", max);
		scan.close();
	}

}
