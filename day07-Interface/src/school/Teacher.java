package school;

public class Teacher extends Person implements Lesson {
	//1.멤버변수 선언부
	private String subject;
	
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

	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	//3.메소드 선언부
	@Override
	public String toString() {
		String teacherStr = String.format(", 과목: %s", this.subject);
		return "교사 정보["+super.toString()+teacherStr+"]";
	}

	@Override
	public String attend() {
		String tchStr = String.format("교사 [%s](이)가 출근 하였습니다", this.getId());
		return tchStr;
	}

	@Override
	public String lesson() {
		return String.format("교사 [%s](이)가 담당과목 [%s]을 가르치고 있습니다.", this.getId(), this.getClass());
	}
	
	
}
