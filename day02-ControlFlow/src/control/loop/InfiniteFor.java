package control.loop;

/**
 * for 반복구조에서 선언식, 조건식, 증감식이 
 * 생략된 구문을 무한반복을 테스트해보는 클래스
 * 
 * @author PC38215
 *
 */
public class InfiniteFor {

	public static void main(String[] args) {
		//조건식이 빠진 for반복문
		//조건식이 생략되면 항상 true로 간주 => 무한루프
		for (int idx = 0; ; idx++) {
			System.out.printf("idx=%d%n", idx);
		}
	}

}
