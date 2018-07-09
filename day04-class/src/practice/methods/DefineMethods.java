package practice.methods;

public class DefineMethods {
//1.
public void printTenTimes(int input){
	for(int idx = 0; idx < 10; idx++){
		System.out.printf("%d%n", input);
		input += 10;
	}
}

//2.
public void printSomebodysMessage(String message, String name){
	System.out.printf("%s의 메시지 : %s", name, message);
}

//3.
public void printMessage(String message){
	System.out.printf("%s%n", message);
}

//4.
public String returnOriginalMessage(String message){
	return message;
}

//5.
public int addTen(int input){
	return input + 10;
}

//6.
public int subtractTen(int input){
	return input - 10;
}

//7.
public double makeDouble(double input){
	return input * 2;
}

//8.
public double subtractFivePointFive(double input){
	return input - 5.5;
}

//9.
public String makeFullName(String name, String surname){
	return surname + name;
}

//10.
public int add(int x, int y){
	return x + y;
}

//11.
public double add(double x, double y){
	return x + y;
}

//12.
public void printMsgManyTimes(String message, int input){
	for(int idx = 0; idx < input; idx++){
		System.out.printf("%d회 메시지 %s", idx+1, message); 
	}
}

//13.
public void arithmetic(int x, int y, String operator){
	double result = 0.0;
	
	if(operator == "+") {result = x + y;}
	else if(operator == "-") {result = x - y;}
	else if(operator == "*") {result = x * y;}
	else{result = x / y;}
	
	System.out.printf("%d %s %d = %f", x, operator, y, result);
}

//14.
public double arithmetic(double x, double y, String operator){
	double result = 0.0;
	
	if(operator == "+") {result = x + y;}
	else if(operator == "-") {result = x - y;}
	else if(operator == "*") {result = x * y;}
	else{result = x / y;}
	
	return result;
}

//15.
public boolean isEven(int input){
	boolean result = false;
	
	if(input % 2 == 0){
		result = true;
	}else{
		result = false;
	}
	
	return result;
}



/*
 *======두번째 장======
*/

//1.
public int absolute(int x){
	int abs = 0;
	
	if(x>0){
		abs = x;
	}else{
		abs = -x;
	}
	
	return abs;
}

//2.
public void findMultiple(int x){
	for(int idx = x; idx <= 100; idx++){
		if(idx % x == 0){
			System.out.printf("%d ", idx);
		} 
	}
}

//3.
public String decideSign(int x){
	String result;
	if(x < 0){
		result="음의 정수";
	}else if(x > 0){
		result="양의 정수";
	}else{
	result="정수 0";
}
return result;
}

	//4.
public void repeatedMessage(String message, int repeat){
	String[] arrays = new String[repeat];
	
	for(int idx = 0; idx < repeat; idx++){
		arrays[idx] = message;
	}

	for(String array : arrays){
		System.out.printf("%s", array);
	}	
}

	//5.
public double calcCircleArea(int r){
	double result = 0.0;
	result = 3.14 * r * r;
	
	return result;
}

	//6.
	public int[] makeMultipleNums(int x){
		int idx = 100 / x;
		int[] numbers = new int[idx];
			
		for(int idx2 = 0; idx2 < numbers.length; idx2++){
			numbers[idx2] = (idx2 + 1) * x;
		}
	
		return numbers;
	}



}
