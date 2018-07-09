package practice.methods;

/**
 * 메소드 작성 실습 클래스
 * 
 * @author PC38215
 *
 */
public class VarietyMethods {
	//리턴타입 메소드 이름(매개변수 리스트)
	
	/*
	 * 화면에 hello, world를 출력하는 메소드
	 */
	public void sayHello() {
		System.out.println("hello, world");
	}
	
	/*
	 * 매개변수로
	 * 유명인의 이름을 입력(name)받고
	 * 그 사람이 한 유명한 문구(maxim)를 입력 받아
	 * 
	 * ㅇㅇㅇ(이)가 말하길 "..."이라고 하였다.
	 * 라는 문장을 출력하는 메소드
	 * maxims를 정의하라.
	 */
	public void maxims(String name, String maxim) {
		System.out.printf("%s(이)가 말하길%n\"%s\"이라고 하였다.", name, maxim);
	}
	
	/*
	 * 어떤 사람의 이름, 생년, 출생월을 매개변수로 입력받아
	 * ㅇㅇㅇ은 XXXX년 XX월 생입니다.
	 * 라는 문장으로 출력하는 메소드
	 * birthYearMonth라는 메소드를
	 * @param name: String
	 * @param year: int
	 * @param month:int
	 */
	public void birthYearMonth(String name, int year, int month) {
		System.out.printf("%s은 %d년 %d월 생입니다.", name, year, month);
	}
	/*
	 * 출력할 단의 숫자를 입력받아
	 * 해당 단의 구구단을 출력하는 메소드
	 * 
	 * 출력의 첫 줄에 X단이라는 제목을 출력
	 * 
	 * printNineNineTable
	 * @param stage:int
	 */
	public void printNineNineTable(int stage) {
		for(int number = 1; number < 10; number++) {
			System.out.printf("%d * %d = %d%n", stage, number, stage*number);
		}
	}
	/*
	 * 출력할 단의 숫자를 가지고 있는 int 배열을 
	 * 매개변수로 입력받아
	 * 입력된 배열의 원소인 각 숫자에 대해 
	 * 구구단을 출력하는 메소드
	 * printNineNineTableArray를 디자인
	 * @param stages :int 배열
	 */
	public void printNineNineTableArray(int[] stages) {
		//배열안에 있는 숫자를 꺼내기 위한 for문
		for(int stage : stages) {
			//1부터 9까지 곱하기 위한 for문
			for(int idx2 = 1; idx2 < 10; idx2++) {
				System.out.printf("%d * %d = %d%n", stage, idx2, stage*idx2);
			}
		}	
	}
	
	/*
	 * 입력된 화씨온도를 섭씨온도로 변환하여
	 * 변환된 섭씨온도를 리턴하는 메소드
	 * 
	 * 변환공식: 5/9*(f -32)
	 * fahToCel을 디자인
	 * @param fah: double :변환할 화씨
	 * @return 변환된 섭씨온도 값
	 */
	public double fahToCel(double fah) {
		return 5.0/9.0*(fah-32.0);
	}
	/*
	 * 키(cm), 몸무게(kg)을 매개변수로 입력받아
	 * BMI 지수를 계산하여 비만도 판정 결과를 리턴하는 메소드
	 * calcBmi를 디자인
	 * @param height: double
	 * @param weight: double
	 * @return 비만도 판정 결과 문자열
	 */
	public String calcBmi(double height, double weight) {
		String result;
		double bmi = (double)weight / ((height/100) * (height/100));
		if(bmi>40.0) {
			result = "병적인 비만";
		}else if(bmi>27.5) {
			result = "비만";
		}else if(bmi>=23.0) {
			result = "과체중";
		}else if(bmi>=18.5) {
			result = "정상";
		}else if(bmi>=15.0) {
			result = "저체중";
		}else {
			result = "병적인 저체중";
			
		}
		return result;
	}
	
	/*
	 * 입력된 두 정수 중에서 작은 수를 찾아 리턴하는 메소드
	 * min을 디자인
	 * @param input1
	 * @param input2
	 * @return: 둘중 작은 정수
	 */
	public int min(int input1, int input2) {
		int minNum=0;
		if(input1 < input2) {
			minNum = input1;
		}else {
			minNum = input2;
		}
		return minNum;
	}
	
	/*
	 * 입력된 두 정수중 큰 수를 찾아 리턴하는 메소드
	 * @param input1
	 * @param input2
	 * @return: 둘 중 큰 정수
	 */
	public int max(int input1, int input2) {
		int maxNum=0;
		if(input1 > input2) {
			maxNum = input1;
		}else {
			maxNum = input2;
		}
		return maxNum;
	}
	
	/*
	 * 정수가 저장된 int배열을 매개변수로 입력받아
	 * 그 배열의 각 원소의 합을 구하여 리턴하는 메소드
	 * sumOfArray를 디자인
	 * @param numbers: int 배열
	 * @return numbers배열의 각 원소의 합
	 */
	public int sumOfArray(int[] numbers) {
		int sum=0;
		
		for(int idx=0; idx<numbers.length; idx++) {
			sum += numbers[idx];
		}
		
		return sum;
	}
	
	/*
	 * 정수가 저장된 int 배열을 매개변수로 입력받아
	 * 그 배열의 각 원소들의 평균을 구하여 리턴하는 메소드
	 * avgOfArray를 디자인
	 * @param numbers
	 * @return numbers 배열의 각 원소의 평균
	 */
	public double avgOfArray(int[] numbers) {
		double avg =0.0;
		int sum = 0;
		int count = 0;
		for(int idx=0; idx<numbers.length; idx++) {
			sum += numbers[idx];
			count++;
		}
		avg = sum / count;
		return avg;
	}
	
	/*
	 * char타입의 연산자와 두 개의 정수를 
	 * 매개변수로 입력받아
	 * 
	 * 입력된 연산자가 '+'일 때 만
	 * 두정수의 합을 구하여 덧셈의 결과를 출력하는 메소드
	 * adder를 디자인
	 * @param op : char
	 * @param x : int
	 * @param y : int
	 * 출력형태 예) 10 + 20 = 30
	 */
	public void adder(int x, char op, int y) {
		if(op == '+') {
			System.out.printf("%3d + %3d = %d", x, y, x+y);
		}else {
			System.out.println("연산자가 '+' 가 아닙니다");
		}
	}
}
