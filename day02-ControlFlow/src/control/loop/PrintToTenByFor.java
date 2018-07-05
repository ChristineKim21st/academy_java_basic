package control.loop;

/**
 * 1~10까지 출력하는 클래스
 * for 구문 구조를 사용하여 출력
 * @author PC38215
 *
 */
public class PrintToTenByFor {

	public static void main(String[] args) {
		//for(선언식; 조건식; 증감식)
		for(int idx=1; idx<=10; idx++) {
			System.out.printf("idx=%2d%n", idx);
		}
		
		System.out.println("====================================");
		
		final int FROM = 1; //final --> 변경되지 않는 상수, 이름이 대문자이다.
		final int TO = 10;
		
		for(int idx = FROM; idx <= TO; idx++) {
			System.out.printf("idx=%2d%n", idx);			
		}
		
		System.out.println("==========10에서 1로 역순 출력============");
		
		for(int idx = TO; idx >= FROM; idx--) {
			System.out.printf("idx=%2d%n", idx);			
		}
		
	}

}
