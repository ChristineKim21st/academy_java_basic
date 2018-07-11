package inheritance.abstrct.person;

/**
 * 학생의 정보를 저장할 클래스
 * 사람의 공통 정보를 담는 클래스인 Person을 상속한다.
 * @author PC38215
 *
 */
public class Student extends Person {
	//1.멤버변수 선언부
	String major;
	
	//2.생성자 선언부
	Student() {
		
	}
	
	Student(String major){
		this.major = major;
	}
	
	Student(String id, String name, int age, String major){
		this.id = id;
		this.name = name;
		this.age = age;
		this.major = major;
	}
	//3.메소드 선언부
	@Override
	public String toString() {
		String studentStr = String.format(", 전공: %s", major);
		return "학생정보["+super.toString()+studentStr+"]";
	}

	@Override
	public void print() {
		System.out.println("==학생==");
		System.out.println(this);

	}
}
