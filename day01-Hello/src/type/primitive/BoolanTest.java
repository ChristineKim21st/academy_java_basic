package type.primitive;
//package 밑에 enter한번 치고 /**치고 enter >>
/**
 * 자바의 유일한 논리형 값: boolean
 * 저장될 수 있는 값: true / false
 * boolean값을 테스트해보는 클레스이다.
 * @author PC38215
 *
 */
public class BoolanTest {
	//이곳에 변수가 선언이 되면 인스턴스(맴버)변수
	//맴버 변수는 기본값을 적용 받는다 ex)boolean변수의 기본값은 false
	//지역 변수는 적용 받지 않는다
	public static void main(String[] args) {
		//1.선언: 타입 변수이름; 
		//메소드 내부에서 선언이 이루어졌으므로 "지역변수"
		boolean flag;
		//ctrl+alt+방향키 >> 한 줄 통채로 복사+붙여넣기

		//2.초기화: true라는 값을 할당
		flag = true;
		//3.사용: flag변수의 값을 출력
		//sysout >> ctrl + spacebar
		System.out.println("boolean flag ="+flag);
		//실행 >> ctrl + f11
		
	}

}
