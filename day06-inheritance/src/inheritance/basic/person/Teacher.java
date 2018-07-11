package inheritance.basic.person;

public class Teacher extends Person {
	//1.멤버변수 선언부
	String subject;
	
	//2.생성자 선언부
	Teacher(String subject){
		this.subject = subject;
	}
	
	Teacher(String id, String name, int age, String subject){
//		this.id = id;
//		this.name = name;
//		this.age = age;
		super(id, name, age);
		//부모 클래스의 생성자의 초기화 기능을 빌려오는
		//super() 키워드는 생성자 정의 첫줄에 1번만 사용 할 수 있다.
		this.subject = subject;
	}

	//3.메소드 선언부
	@Override
	public String toString() {
		String teacherStr = String.format(", 과목: %s", this.subject);
		return "교사 정보["+super.toString()+teacherStr+"]";
	}
	
	
}
