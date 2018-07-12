package school;

/**
 * 학교 구성원인 학생, 직원, 교사의 
 * 출결, 수업 기능을 테스트하는 클래스이다.
 * @author PC38215
 *
 */
public class SchoolTest {
	public static void main(String[] args) {
		//1.선언
		Attendance[] attends = new Attendance[3];
		attends[0] = new Student("S001", "홍길동", 18, "도술");
		attends[1] = new Teacher("T001", "허균", 46, "문학");
		attends[2] = new Teacher("E001", "행랑아범", 51, "행랑채");
	
		for(Attendance attendance : attends) {
			System.out.println(attendance.attend());
			//각 구성원은 다시 Person타입이므로
			//Person의 프린트 기능을 쓰고 싶다면 강제 형변환
			//((Person)attendance).print();
			
			if(attendance instanceof Lesson) {
				String lessonStr = ((Lesson)attendance).lesson();
				System.out.println(lessonStr);
			}
			System.out.println("==========================================================");
		}//end for prof
	}//end for method
}
