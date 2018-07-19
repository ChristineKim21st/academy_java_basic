package calc;

/**
 * static영역과 non-static영역 사이의
 * 초기화 시점에 따른 호출 방향을 테스트하는 클래스
 * @author PC38215
 *
 */
public class Calculator {
	//add
	public int add(int x, int y) {
		return x + y;
	}
	//substract
	public int substract(int x, int y) {
		return x - y;
	}
	
	//divide
	public int divide(int x, int y) {
		return x / y;
	}
	
	//modular
	public int modular(int x, int y) {
		return x % y;
	}
	
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static double substract(double x, double y) {
		return x - y;
	}
}
