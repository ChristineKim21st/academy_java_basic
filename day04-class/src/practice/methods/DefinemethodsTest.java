package practice.methods;

public class DefinemethodsTest {

	public static void main(String[] args) {
		//1.선언
		DefineMethods methods;
		
		//2.초기화
		methods = new DefineMethods();
	
		//1.
		methods.printTenTimes(10);
		System.out.println("=============================");
		
		//2.
		methods.printSomebodysMessage("김소민", "청년취업아카데미입니다");
		System.out.printf("%n=============================%n");
		
		//3.
		methods.printMessage("청년취업아카데미입니다.");
		System.out.printf("%n=============================%n");
	
		//4.메세지 리턴
		String message = methods.returnOriginalMessage("안녕하세요");
		System.out.printf("%s", message);
		System.out.printf("%n=============================%n");
		
		//5.
		int input = methods.addTen(10);
		System.out.printf("%d", input);
		System.out.printf("%n=============================%n");
		
		//6.
		int input2 = methods.subtractTen(40);
		System.out.printf("%d", input2);
		System.out.printf("%n=============================%n");
		
		//7.
		double input3 = methods.makeDouble(50.0);
		System.out.printf("%.2f", input3);
		System.out.printf("%n=============================%n");
		
		//8.
		double input4 = methods.subtractFivePointFive(10.0);
		System.out.printf("%.2f", input4);
		System.out.printf("%n=============================%n");
	
		//9.
		String name = methods.makeFullName("소민", "김");
		System.out.printf("%s", name);
		System.out.printf("%n=============================%n");
		
		//10.
		int inputOf10 = methods.add(10, 5);
		System.out.printf("%d", inputOf10);
		System.out.printf("%n=============================%n");

		//11.
		double inputOf11 = methods.add(10.1, 12.5);
		System.out.printf("%.2f", inputOf11);
		System.out.printf("%n=============================%n");
		
		//12.
		methods.printMsgManyTimes("청취아 ", 3);
		System.out.printf("%n=============================%n");
		
		//13.
		methods.arithmetic(50, 5, "+");
		System.out.printf("%n=============================%n");
		
		//14.
		double inputOf14 = methods.arithmetic(77.77, 11.1, "/");
		System.out.printf("%.2f", inputOf14);
		System.out.printf("%n=============================%n");
		
		//15.
		boolean inputOf15 = methods.isEven(10);
		System.out.printf("%s", inputOf15);
		System.out.printf("%n=============================%n");

		/*
		 *=========================두번째 장================================
		*/
		
		//1.
		int inputOf001 = methods.absolute(-4);
		System.out.printf("%d", inputOf001);
		System.out.printf("%n=============================%n");
		
		//2.
		methods.findMultiple(4);
		System.out.printf("%n=============================%n");
		
		//3.
		String inputOf003 = methods.decideSign(5);
		System.out.printf("%s", inputOf003);
		System.out.printf("%n=============================%n");
		
		//4.
		methods.repeatedMessage("4번 반복합니다  ", 4);
		System.out.printf("%n=============================%n");
		
		//5.
		double inputOf005 = methods.calcCircleArea(5);
		System.out.printf("%.2f", inputOf005);
		System.out.printf("%n=============================%n");
		
		//6.
		int[] numbers = methods.makeMultipleNums(4);
		for(int number : numbers) {
			System.out.printf("%d%n", number);
		}
		System.out.printf("%n=============================%n");
	}

}
