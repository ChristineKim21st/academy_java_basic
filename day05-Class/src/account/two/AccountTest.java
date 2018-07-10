package account.two;

/**
 * 계좌(Account) 클래스의 인스턴스(객체, 실체)를 생성하고
 * 입금기능, 현재 계좌 상태등을 출력해보며
 * 테스트하는 클래스
 * 
 * @author PC38215
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		//1.선언: 계좌의  객체 참조 변수
		Account myAccount;
		Account yourAccount;
		
		//2.초기화
		//기본생성자로 초기화
		myAccount = new Account();
		//매개변수를 받는 생성자로 초기화
		//1번 계좌에 10000원의 초기입금 금액 넣음
		yourAccount = new Account(1, 10000);
		
		//3.사용
		//(0)초기상태 출력
		myAccount.print();
		yourAccount.print();
		
		
		//(1)입금 1000원
		myAccount.deposit(1000);
		yourAccount.deposit(1000);
		
		//(2)상태출력
		myAccount.print();
		yourAccount.print();
		
		//(3)입금 5000원
		myAccount.deposit(5000);
		yourAccount.deposit(5000);
		
		//(4)상태출력
		myAccount.print();
	}

}
