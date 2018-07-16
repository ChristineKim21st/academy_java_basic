package exception.scope;

public class ExceptionScopTest {

	public static void main(String[] args) {
		//1.선언
		EceptionScope demo;
		
		//2.초기화
		demo = new EceptionScope();
		
		//3.사용
		System.out.println("== main 메소드가 시작되었습니다. ==");
		
		demo.level1();
		
		System.out.println("== main 메소드가 종료되었습니다. ==");
		
	}

}
