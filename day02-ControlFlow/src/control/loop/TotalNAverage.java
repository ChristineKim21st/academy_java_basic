package control.loop;

import java.util.Scanner;

/**
 * 
 * @author PC38215
 *
 */
public class TotalNAverage {

	public static void main(String[] args) {
		//1.선언, 2.초기화
		int total = 0, score = 0, count = 0;
		double average;
		//스캐너 선언, 초기화
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0을 입력하면 종료) : ");
		score = scan.nextInt();
		
		//3.사용
		while(score != 0) {
			
			total += score;
			count++;
			
			System.out.println("점수를 입력하세요(0을 입력하면 종료) : ");
			score = scan.nextInt();
		}
			
		if(count == 0)	{
				System.out.println("입력된 값이 없습니다.");
		}else {
			average = (double)total / count;
			System.out.printf("총점: %d%n", total);
			System.out.printf("평균: %5.2%f%n", average);
		}
	scan.close();
	}

}
