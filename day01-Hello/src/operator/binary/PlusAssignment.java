package operator.binary;

/**
 * 누적대입연산자
 * @author PC38215
 *
 */
public class PlusAssignment {

	public static void main(String[] args) {
		//1.선언, 2.초기화
		int num = 0;
		
		//2.사용
		System.out.println("초기 num의 값: "+ num);
		
		num += 1;
		System.out.println("num += 1 수행 후 num: "+num);

		num = num + 1;
		System.out.println("num = num + 1 수행 후 num: "+num);

		num += num + 1;
		System.out.println("num += num + 1 수행 후 num: "+num);

		num *= num * 1;
		System.out.println("num *= num * 1 수행 후 num: "+num);
		
	}

}
