package type.primitive;

/**
 * 1byte 에 해당하는 범위만큼
 * 정수를 저장하는 타입인
 * byte 타입을 테스트하는 클래스 이다.
 * 
 * 1byte = 8bit
 * @author PC38215
 *
 */
public class ByteTest {

	public static void main(String[] args) {
		//1.선언
		byte buffer;
		
		//2.초기화
		buffer = 0;
		
		//3.사용
		for (int i = 0; i < 257; i++) {
			System.out.print(buffer++);
			System.out.println(" , ");
		}
/**
 * 저장 할 수 있는 값의 범위를 넘어서는 값을
 * 직접 할당하는 것은 불가능
 * 예) buffer =128; //오류코드		
 */
	}

}
