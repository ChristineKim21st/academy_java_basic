package array.basic;

/**
 * 직원들의 급여정보(기본형 int타입)을
 * 저장하는 배열을 테스트하는 클래스이다.
 * 
 * 
 * @author PC38215
 *
 */
public class ArraySalaries {

	public static void main(String[] args) {
		//1.선언: 배열 참조 변수 선언
		int[] salaries;
		
		//2.초기화: 배열 참조 변수는 기본형이 아닌 변수이므로
		//		   초기화를 위해 new를 사용해야만 한다.
		salaries = new int[10];
		
		//3.사용: 
		//값을 넣기 전에 출력
		System.out.printf("====배열에 값을 넣기 전 출력====%n");
		System.out.printf("salaries[0]=%d%n", salaries[0]);
		System.out.printf("salaries[1]=%d%n", salaries[1]);
		System.out.printf("salaries[2]=%d%n", salaries[2]);
		System.out.printf("salaries[3]=%d%n", salaries[3]);
		System.out.printf("salaries[4]=%d%n", salaries[4]);
		System.out.printf("salaries[5]=%d%n", salaries[5]);
		System.out.printf("salaries[6]=%d%n", salaries[6]);
		System.out.printf("salaries[7]=%d%n", salaries[7]);
		System.out.printf("salaries[8]=%d%n", salaries[8]);
		System.out.printf("salaries[9]=%d%n", salaries[9]);
		//각 배열의 칸에 값을 할당
		salaries[0] = 10;
		salaries[1] = 55;
		salaries[2] = 86;
		salaries[3] = 23;
		salaries[4] = 98;
		salaries[5] = 34;
		salaries[6] = 50;
		salaries[7] = 76;
		salaries[8] = 11;
		salaries[9] = 8;
		/*new가 초기화 할 때 기본값인 0을 할당했다.
		salaries[0]=0
		salaries[1]=0
		salaries[2]=0
		salaries[3]=0
		salaries[4]=0
		salaries[5]=0
		salaries[6]=0
		salaries[7]=0
		salaries[8]=0
		salaries[9]=0*/
		
		//배열에값을 넣은 후 출력
		System.out.printf("%n====배열에 값을 넣은 후 출력====%n");
		System.out.printf("salaries[0]=%d%n", salaries[0]);
		System.out.printf("salaries[1]=%d%n", salaries[1]);
		System.out.printf("salaries[2]=%d%n", salaries[2]);
		System.out.printf("salaries[3]=%d%n", salaries[3]);
		System.out.printf("salaries[4]=%d%n", salaries[4]);
		System.out.printf("salaries[5]=%d%n", salaries[5]);
		System.out.printf("salaries[6]=%d%n", salaries[6]);
		System.out.printf("salaries[7]=%d%n", salaries[7]);
		System.out.printf("salaries[8]=%d%n", salaries[8]);
		System.out.printf("salaries[9]=%d%n", salaries[9]);
		
		//==================================================
		//for 반복 구조와 배열의 조합1
		System.out.printf("%n=========salaries의 길이: %d%n", salaries.length);
		for(int idx=0; idx <salaries.length; idx++) {
			System.out.printf("salaries[%d]=%d%n", idx, salaries[idx]);
			
		}
	}

}
