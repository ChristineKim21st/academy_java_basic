package encap.person;

public class Employee extends Person {
	//1.멤버변수 선언부
	private String dept;
	
	//2.생성자 선언부
	Employee(){
		
	}
	
	Employee(String dept){
		this.dept = dept;
	}
	
	Employee(String id, String name, int age, String dept){
//		this.id = id;
//		this.name = name;
//		this.age = age;
		super(id, name, age);
		this.dept = dept;
	}
	
	
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	//3.메소드 선언부
	public String toString() {
		String employeeStr = String.format(", 부서: %s", this.dept);
		return "직원 정보["+super.toString()+employeeStr+"]";
	}
}
