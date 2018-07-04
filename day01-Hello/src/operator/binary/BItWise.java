package operator.binary;

/**
 * 비트연산을 수행하는 이항연산자를 테스트하는 클래스
 * &, |, ^
 * @author PC38215
 *
 */
public class BItWise {

	public static void main(String[] args) {
		int a = 0x1f05;
		int b = 0x31a1;
		
		System.out.printf("%x & %x = %x%n", a, b, a&b);
		System.out.printf("%x | %x = %x%n", a, b, a|b);
		System.out.printf("%x ^ %x = %x%n", a, b, a^b);
		System.out.printf("~%x =  %x%n", a, ~a);
	}

}
