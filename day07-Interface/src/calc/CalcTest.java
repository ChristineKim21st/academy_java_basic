package calc;

import static calc.Calculator.*;

/**
 *산술 연산을 하는 클래스인
 *Calculator를 테스트한다 
 * @author PC38215
 *
 */
public class CalcTest {

	public static void main(String[] args) {
		//1.선언
		//객체서언
		Calculator calc;
		
		//2.초기화
		calc = new Calculator(); //non-static영역의 new를 사용한 명시적 초기화
		
		//3.사용
		//Caculator 클래스의 add()메소드 사용
		//(1) static -> non-static : 다른 클래스
		int addResult = calc.add(100, 200);
		System.out.printf("100+ 200 = %d", addResult);
		
		//(2)static -> non-static: 같은 클래스
		CalcTest cTest = new CalcTest();
		cTest.add(10, 20);
		
		//(3)static -> static 같은 클래스
		//동일 클래스 안의 static영역끼리의 호출: 바로 이름으로 참조
		substract(10, 20);
		
		//(4)static -> static 다른 클래스
		Calculator.substract(20.0, 45.0);
		
	}
	//add메소드 정의 = non-static
	public int add(int x, int y) {
		System.out.printf("%d + %d = %d", x, y, x+y);
		return x + y;
	}
	
	public static int substract(int x, int y) {
		System.out.printf("%d + %d = %d", x, y, x-y);
		return x - y;		
	}

}
