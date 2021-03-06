package io.object;

/**
 * 객체 출력을 지원하기 위해서는 객체 직렬화가 필요함
 * java.io.Serializable 인터페이스를 구현하도록 되어있음
 * 
 * java.io.Serializable 인터페이스는 객체 직렬화를 지원하는
 * 인터페이스로 구현해야 할 메소드를 가지고 있지 않다.
 */
import java.io.Serializable;

public class Product implements Serializable{
	
	// 1. 멤버 변수 선언부
	/** 제품 코드 */
	private String prodCode;
	/** 제품 명 */
	private String prodName;
	/** 제품 가격 */
	private int price;
	/** 재고 수량 */
	private int quantity;
	
	// 2. 생성자 선언부
	public Product() {
		
	}

	public Product(String prodCode) {
		this.prodCode = prodCode;
	}
	

	public Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode);
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	

	public String getProdCode() {
		return this.prodCode;
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	
	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// 3. 메소드 선언부
	/**
	 * 제품 정보를 출력
	 */
	public void print() {
		System.out.printf("제품 정보 [제품코드 : %s, 제품명 : %s"
				         + ", 가격 %d: , 재고수량 : %d]%n"
				         , prodCode, prodName, price, quantity);
	}
	

	public int discount(double percentage) {
		int price = this.price;
		
		if (percentage > 0) {
			price = price - (int)(this.price * (percentage / 100));
		}
		
		return price;
	}

	/**
	 * 제품을 출고(판매)하고 재고 수량을 감소시킨다.	 
	 * @param amount
	 */
	public void sell(int amount) {
		// 재고 수량이 출고하려는 수량보다 크거나 같을때만
		// 출고함.
		if (this.quantity >= amount) {
			this.quantity -= amount;
		}
	}
	
	/**
	 * 제품이 입고되어 재고 수량을 증가시킨다.
	 * @param amount
	 */
	public void buy(int amount) {
		// 입고된 만큼 재고수량 증가 후 저장반영
		this.quantity += amount;		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prodCode == null) ? 0 : prodCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (prodCode == null) {
			if (other.prodCode != null)
				return false;
		} else if (!prodCode.equals(other.prodCode))
			return false;
		return true;
	}


	// Object 클래스에서 나도 모르는 사이 상속받은
	// toString() 메소드를 재정의 해보자.
	// 1. 메소드 헤더가 동일 : 리턴타입 메소드이름 (매개변수 목록)
	@Override
	public String toString() {
		String strProduct = String.format(
				"제품 정보 [제품코드 : %s, 제품명 : %s"
		                 + ", 가격 %,d: , 재고수량 : %d]%n"
		         , prodCode, prodName, price, quantity);
		return strProduct;
	}

//	// Product 의 객체들은 prodCode 가 같으면 
//	// 동일 객체로 판단
//	@Override
//	public boolean equals(Object obj) {
//		// 1. 동일 비교 결과 저장 변수 선언
//		// 2. 초기화 : 기본 false 설정
//		boolean isEqual = false;
//		
//		// 3. 사용 : 동일한 객체인지 판단
//		// (1) 비교 대상인 obj 가 Product 타입인지 검사
//		if (obj instanceof Product) {
//			// (2) 비교 하려하는 this 객체와
//			//     비교 대상인 obj 간 각각의 필드가 동일한지
//			//     비교
//			Product product = (Product)obj;
//			//     prodCode 만 같으면 같은 객체로 인정
//			if (this.prodCode.equals(product.prodCode)) {
//				isEqual = true;
//			}
//		}
//		
//		return isEqual;
//	}
//
//	@Override
//	public int hashCode() {
//		// 입력이 동일하면 출력도 동일함 보장하는 수학적 알고리즘
//		// 출력이 다르면 입력이 다르다는 결론을 보장하는 함수
//		
//		// 1. 비교하려는 필드가 참조형이면 그 클래스의
//		//    hashCode() 를 호출
//		// 2. 비교하려는 필드가 기본형이면 참조형으로 바꾸는
//		//    포장 클래스 객체로 변환 후에 hashCode() 를 호출
//		// 3. 1, 2 의 결과를 모두 ^ (XOR) 연산을 통과시킨다.
//		
//		return this.prodCode.hashCode();
//	}
	
	
	
	
	
	
	
	
	

}
