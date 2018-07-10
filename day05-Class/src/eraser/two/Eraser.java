package eraser.two;

/**
 * 칠판 지우개를 정의하는 클래스
 * -----------------------------------
 * 칠판 지우개의 속성을 정의하기 위하여
 * 가로 :width	:double
 * 세로 :height	:double
 * 높이 :depth	:double
 * 겹   :layer	:int
 * 네 개의 멤버 변수를 선언
 * -----------------------------------
 * 기본 생성자 : 매개변수를 받지 않는 생성자
 * 매개변수를 받는 생성자 두개를 정의
 * 매개변수를 받는 생성자는 네개의 필드 모두에 대해서
 * 매개변수를 받도록 정의한다
 * -----------------------------------
 * 칠판 지우개의 상태를 출력: print()	:void
 * 지우개의 한 겹을 제거 : peal()		:void
 * @author PC38215
 *
 */
public class Eraser {
	//1.멤버변수 선언부
	double weidth;
	double height;
	double depth;
	int layer;
	
	//2.생성자 선언부
	/**
	 * 매개변수를 받지 않는 기본생성자 선언
	 */
	Eraser(){ }
	
	/**
	 * width필드만 초기화 하는 생성자
	 * @param weidth
	 */
	Eraser(double weidth){
		this.weidth = weidth; 
	}
	
	/**
	 * width, height필드만 초기화 하는 생성자
	 * @param weidth: 지우개 가로 길이
	 * @param height: 지우개 세로 길이
	 */
	Eraser(double weidth, double height){
		this(weidth);
		this.height = height;
	}
	

	/**
	 * width, height, depth필드만 초기화 하는 생성자
	 * @param weidth
	 * @param height
	 * @param depth
	 */
	Eraser(double weidth, double height, double depth){
		this(weidth, height);
		this.depth = depth;
	}
	
	
	/**
	 * 네개의 매개변수를 받는 생성자 선언
	 * @param newWeidth: 지우개의 가로
	 * @param newHeight: 지우개의 세로
	 * @param newDepth: 지우개의 높이
	 * @param newLayer: 지우개의 겹
	 */
	Eraser(double weidth, double height, double depth, int layer){
		//this()선언은 생성자 첫번째 줄에서 단 1번만 사용 할 수 있다.
		this(weidth, height, depth);
		this.layer = layer;
	}
	//3.메소드 선언부
	/**
	 * 칠판 지우개의 상태를 출력해주는 메소드
	 */
	public void print() {
		System.out.printf("지우개의 가로: %f, 세로: %f, 높이: %f, 겹: %d%n", weidth, height, depth, layer);
	
	}
	
	/**
	 * 칠판 지우개의 한 겹을 제거해주는 메소드
	 */
	public void peal() {
		//남아 있는 겹의 수가 -값이 될 수는 없으므로
		//if 구문을 사용하여 값을 체크
		if((layer - 1) >= 0) {
			layer -= 1;
		}
	}
}
