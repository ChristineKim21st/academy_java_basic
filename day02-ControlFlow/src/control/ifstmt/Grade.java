package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if를 사용하여 다음의 기준으로 
 * 90점 이상 A
 * 80~89 B
 * 60~79 C
 * 40~59 D
 * 나머지 F
 * 
 * 입력된 점수에 대해 학점을 계산하는 클래스를 작성
 * 점수  int score
 * 학점은 char타입을 grade 사용할 것
 * @author PC38215
 *
 */
public class Grade {

	public static void main(String[] args) {
		//1.선언
		//점수, 학점을 저장할 변수 저장
		int score;
		char grade;
		//스캐너 변수 선언
		Scanner scan;
		
		//2.초기화
		//스캐너 초기화
		scan = new Scanner(System.in);
		
		System.out.println("0~100점 사이의 점수를 입력해 주세요:");
		//스캐너로 입력받는 score 초기화
		score = scan.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		}else if(score>=80) {// && score <=89) {
			grade = 'B';
		}else if(score>=60) {//&& score <=79) {
			grade = 'C';
		}else if(score>=40) {// && score <=59) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		
		//3.사용
		//출력
		System.out.printf("%d점의 학점은 %c 입니다", score, grade);
		//스캐너 종료
		scan.close();
	}

}
