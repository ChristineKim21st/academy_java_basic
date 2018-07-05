package control.loop;

/**
 * 화씨 온도를 섭씨온도로 변환하는 클래스
 * c = 5/9(f-32)를 이용
 * 
 * 
 * 화씨온도 변수: fah
 * 섭씨온도 변수: cel
 * @author PC38215
 *
 */
public class F2CTable {

	public static void main(String[] args) {
		double cel;
		double fah;
		
		final int FROM = 0;
		final int TO = 100;
		final int STEP = 10;
		
		for (fah=FROM; fah<=TO; fah+=STEP) {
			cel = 5.0 / 9.0 * (fah - 32);
			System.out.printf("%5.1f F = %5.1f C%n", fah, cel);
		}
		//%5.1f
		//5자리로 자리를 주고 ex)100.0-->5자리
		//소수점(.) 뒤에 1자리까지 출력하는
		//%f 실수형태
		
	}

}
