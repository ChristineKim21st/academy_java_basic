package operator.binary;

/**
 * 관계연산자: 대소비교, 등가비교 연산자를 테스트
 * 대소비교: >, <, >=, <=
 * 등가비교: ==, !=
 * 
 * 관계 연산의 결과는 boolean 타입으로 얻어짐
 * @author PC38215
 *
 */
public class RelationalTest {

	public static void main(String[] args) {
		//1.선언, 2.초기화
		int a = 1;
		int b = -5;
		
		//3.사용
		System.out.printf("(%d == %d) : %b%n", a, b, (a==b));
		System.out.printf("(%d != %d) : %b%n", a, b, (a!=b));
		System.out.printf("(%d > %d) : %b%n", a, b, (a>b));
		System.out.printf("(%d < %d) : %b%n", a, b, (a<b));
		System.out.printf("(%d >= %d) : %b%n", a, b, (a>=b));
		System.out.printf("(%d <= %d) : %b%n", a, b, (a<=b));
		
		/*-------------------------------------
		 * printf() 메소드에서 사용하는 포맷 스트링의 종류
		 * ------------------------------------
		 * %d: decimal 의 약자, 정수표기
		 * %f: 실수표기, float의 약자
		 * %b: boolean값 표기, boolean의 약자
		 * %s: 문자열표기, String의 약자
		 * %x: 16진수 표기, hexa의 약자
		 * %%: %기호 자체 출력
		 * %n: new line, 엔터키
		 * -------------------------------------
		 */
		
		//alt + 방향키: 한줄 라인 이동
		//세로 편집 모드 진입: alt + shift + a
	}

}
