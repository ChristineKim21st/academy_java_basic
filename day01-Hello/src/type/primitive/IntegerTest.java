package type.primitive;

/**
 * 정수형 타입 중 가장 대표 타입인 int
 * 타입을 테스트 하는 클래스이다
 * @author PC38215
 *
 */
public class IntegerTest {

	public static void main(String[] args) {
		//1.선언, 2.초기화
		//한줄에 변수를 선언하여 초기화 하는것을
		//여러번 나열하는 것이 가능함
		int num1 =5, num2 =28;
		//한줄에 여러변수를 동시에 선언하는 것이 가능함
		int num3, num4, num5;

		//num3, num4, num5에 대해서는 초기화
		//num1, num2 에 대해서는 사용
		num3 = num1 * num2;
		num4 = num2 / num1;
		num5 = 25 /num1;
		
		//3.사용: 변수값을 출력
		System.out.println("5*28 = " + num3);
		System.out.println("28 / 5 =" + num4);
		System.out.println("25 / 5 = "+num5);
	}

}
