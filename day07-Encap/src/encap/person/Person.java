package encap.person;

/**
 *일반적인 사람의 정보를 저장하는 클래스
 *-----------------------------
 *캡슐화를 적용하여 멤버변수의 필드를 
 * 
 * @author PC38215
 *
 */
public class Person {
	//1.멤버 변수 선언부
	private String id;
	private String name;
	private int age;
	
	//2.생성자 선언부
	//(1)기본 생성자: 생성자 선언부를 완전히 생략하면 자동으로 기본생성자 선언이 들어간다.
	Person(){
		
	}
	
	
	//(2)매개변수를 받는 생성자가 선언되고
	//   기본생성자 선언이 누락되는 경우는 자동으로 기본 생성자를 만들어 주지 않는다.
	Person(String id){
		this();
		this.id = id;
	}
	
	Person(String id, String name){
		this(id);
		this.name = name;
	}
	
	Person(String id, String name, int age){
		this(id, name);
		this.age = age;
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	//3.메소드 선언부
	//toString 재정의
	@Override
	public String toString() {
		return String.format("아이디: %s, 이름: %s, 나이: %d", id, name, age);
	}
	
}
