package array.multi;

import java.util.Scanner;

/**
 * 3명의 양궁선수가 맞힌 과녁의 점수를 각각 차시(9차시까지) 별로 배열에 입력하고
 * 
 * "전체 합산 점수"가 "가장 높은 선수(합산 점수)"의 
 * 
 * "인덱스"와 "점수"를 출력
 * @author PC38215
 *
 */
public class ArcheryScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] scores = new int[3][9];
		int[] sum = new int[3];
		int max = 0;
		
		System.out.println("======양궁 선수 점수를 입력하세요======");
		
		//각 선수별로 과녁 점수를 입력받아 배열에 저장		
		for(int idx = 0; idx < scores.length; idx++) {
			System.out.printf("%d번째 선수의 9차까지 점수를 입력하세요: ", idx+1);
			for(int idx2 = 0; idx2 <scores[idx].length; idx2++) {
				scores[idx][idx2] = scan.nextInt();
				sum[idx] += scores[idx][idx2];	
			}
			if(sum[idx] > max) {
				max = sum[idx];
			}
		}
		
		System.out.println("===============우승선수==============");
		for(int idx = 0; idx < scores.length; idx++) {
			if(sum[idx] == max) {
				System.out.printf("우승선수는:합산점수 %d점의 %d선수입니다", max, idx+1);
			}
		}
		
		scan.close();
	}

}
//2 2 2 2 2 2 2 2 2