package devider.scope;

/**
 * level1() -> level2() -> level3()
 * 의 순서로 메소드 호출이 일어나는 클래스
 * 
 * level3() 메소드 안에는 0으로 나누는 상황이
 * 발생 할 수 있는 연산을 수행한다.
 * 
 * level3()에서 발생한 예외가 메소드 호출의
 * 반대 순서로 전파되는 것을 확인
 * @author PC38215
 *
 */
public class DiverderScope {
	public void level3(int input) {
		int current = 1;
		
		System.out.println("== level3가 시작되었습니다. ==");
		current = current / input;
		System.out.println("== level3가 종료되었습니다. ==");
	}
		
		public void level2() {
			System.out.println("== level2가 시작되었습니다. ==");
			level3(0);
//			System.out.println("== level2가 종료되었습니다. ==");
	}
			
		public void level1() {
			System.out.println("== level1가 시작되었습니다. ==");
			
			try {
				level2();
			}catch(ArithmeticException e) {
				System.err.println("문제 발생" + e.getMessage());
				System.out.println("== level2가 종료되었습니다. ==");
				
			}
			
			System.out.println("== level1가 종료되었습니다. ==");
			
		}
		
	
}
