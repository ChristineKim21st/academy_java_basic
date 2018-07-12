package school;

/**
 * 학생의 정보를 저장할 클래스
 * 사람의 공통 정보를 담는 클래스인 Person을 상속한다.
 * @author PC38215
 *
 */
public class Student extends Person implements Lesson{
	//1.멤버변수 선언부
	private String major;
	
	//2.생성자 선언부
	Student() {
		
	}
	
	Student(String major){
		this.major = major;
	}
	
	Student(String id, String name, int age, String major){
		super(id, name, age);
		this.major = major;
	}
	
	
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	//3.메소드 선언부
	@Override
	public String toString() {
		String studentStr = String.format(", 전공: %s", major);
		return "학생정보["+super.toString()+studentStr+"]";
	}

	@Override
	public String attend() {
		String stdStr = String.format("학생 [%s](이)가 등교 하였습니다", this.getId());
		return stdStr;
	}

	@Override
	public String lesson() {
		return String.format("학생 [%s](이)가 과목 [%s]을 수강하고 있습니다.", this.getId(), this.getClass());
	}
}
