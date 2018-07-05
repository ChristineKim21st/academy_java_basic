package control.loop;

/**
 * 1~100사이의 홀수의 합을
 * for 반복문과 continue의 조합으로 구해보는 클래스
 * @author PC38215
 *
 */
public class SumOfOdds2 {

	public static void main(String[] args) {
		//1.선언
		int sum; 
		int idx;
		
		for(sum = 0, idx=1; idx <= 100; idx++) {
			if((idx % 2)==0) {
				//idx가 짝수
				continue;
			}
			sum += idx;
		}
		System.out.printf("1~100 사이 홀수의 합: %d%n", sum);
	}

}
