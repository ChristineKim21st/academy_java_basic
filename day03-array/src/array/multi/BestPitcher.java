package array.multi;

/**
 * 야구 구단의 1~5선발 선수의 방어율을 입력하고 그 중 가장 방어율이 낮은 최고의 투수를 찾는 클래스
 */
import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		
		//각 팀별로 각 투수의 방어를 입력받아 배열에 저장한다
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");
		for(int idx = 0; idx<ERA.length; idx++) {
			System.out.printf("%d번째 팀 1~5선발 투수 방어율:", idx+1);
			for(int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				ERA[idx][idx2] = scan.nextDouble();
				if(ERA[idx][idx2] < min) {
					min = ERA[idx][idx2];
				}	
			}
		}
		
		//각 팀의 선수가 저장된 가장 작은 방어율과 같은지 비교해 출력해주는 중첩 for문 
		for(int idx = 0; idx<ERA.length; idx++) {
			for(int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				if(ERA[idx][idx2] == min) {
					System.out.printf("최고의 투수는:%.2f방어율의 %d팀 %d선수입니다", min, idx+1, idx2+1);
				}
			}
		}

		scan.close();
	}

}
//1.111 2.222 3.333 4.444 5.555
//1.1 2.2 3.3 4.4 5.5 
//1.11 2.22 3.33 4.44 5.55