package operator.binary;

import java.util.Scanner;

/**
 * 입력된 점수가 0~100사이의 유효한 값인지 
 * 판단하는 클래스
 * 
 * 논리연산자 &&을 테스트
 * Scnanner를 사용하여 간단히 키보드 입력으로 처리한다.
 * @author PC38215
 *
 */
public class ScoreInput {

	public static void main(String[] args) {
		//1.선언
		//스캐너 선언(ctrl+shif+o)
		Scanner scan;
		
		//변수
		int score;
		
		//2.초기화
		scan = new Scanner(System.in);
		//변수초기화: 스키너를 통해서 입력
		System.out.println("점수를 입력: ");	
		score = scan.nextInt();
		
		//3.사용
		//0 <=score <=100
		if(score >= 0 && score <=100) {
			System.out.printf("%d 은(는) 유효한 점수 입니다.",	score);
		}else {
			System.out.printf("%d 은(는) 유효한 점수가 아닙니다.%n",	score);
			/*---------------------------
			 * 테스트 진행시 주의점
			 *---------------------------
			 *1.올바른 데이터만으로 테스트하는 것
			 *2.경계값 테스트를 반드시 진행
			 *3.잘못된 결과를 발생시킬 것으로 예상되는 값으로 반드시 진행 
			 *
			 */
		}
		
	}

}
