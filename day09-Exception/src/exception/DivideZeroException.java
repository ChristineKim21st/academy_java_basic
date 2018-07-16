package exception;

/**
 * 0으로 나누려는 시도가 있을 때
 * 발생시킬 예외를 정의하는 클래스 
 * ----------------------------------------
 * 모든 예외 클래스는 일반 클래스와 동일하게 정의 가능하다
 * ----------------------------------------
 * 예외 클래스 "정의"시 주의 점
 * 1.멤버변수, 생성자, 메소드 정의는 동일하다
 * 2.Exception 클래스를 반드시 상속
 * 3.예외 클래스의 이름은 반드시 Exception으로 끝나도록하여
 *   이 클래스가 예외 클래스임을 명시해야한다.
 * ----------------------------------------
 * 예외 객체 "사용"시 주의 점
 * 1.new로 생성하는것은 동일하다
 * 2.new로 생성후
 *   throw(던져서) 발생 시켜야 한다.
 * @author PC38215
 *
 */
public class DivideZeroException extends Exception {
	//1.멤버변수 선언부
	private String reason;
	
	//2.생성자 선언부
	public DivideZeroException(){
		this.reason = "0으로 나누려는 시도가 있습니다";
	}

	public DivideZeroException(String reason){
		this.reason = reason;
	}

	@Override
	public String toString() {
		return this.reason;
	}
	
	
	//3.메소드 선언부
}
