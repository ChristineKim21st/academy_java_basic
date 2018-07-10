package product;

/**
 * prodCode		:String
 * prodName		:String
 * price		:int
 * quantity		:int
 * feild-------------------------------------------
 * 필드를 1개씩 늘려서 총 5개를 중복정의 (이 때 this를 사용)
 * 출력메소드: print()		:void
 * 할인행사지원:discount(double percentage) int타입 price return
 * --------------------------------------------
 * sell(int ammount) -->quantity를 변경
 * buy(int ammount)	 -->quantity증가 변경
 * 수량이 0이하면 판매 못하도록
 * @author PC38215
 *
 */
public class Product {
	
	//1.맴버 변수 선언부
	/**제품코드*/
	String prodCode;
	/**제품이름*/
	String prodName;
	/**제품가격*/
	int price;
	/**재고개수*/
	int quantity;
	
	//2.생성자 선언부
	Product(){
		
	}
	
	Product(String prodCode){
		this.prodCode = prodCode;
	}
	
	Product(String prodCode, String prodName){
		this(prodCode);
		this.prodName = prodName;
	}
	
	Product(String prodCode, String prodName, int price){
		this(prodCode, prodName);
		this.price = price;
	}
	
	Product(String prodCode, String prodName, int price, int quantity){
		this(prodCode, prodName, price);
		this.quantity = quantity;
	}
	
	public void print() {
		System.out.printf("제품 정보 [제품코드: %s, 제품이름: %s, 제품가격: %d, 재고수량: %d]%n", 
				prodCode, prodName, price, quantity);
	}
	
	public int discount(double percentage) {
		//퍼센트가 0보다 클 때만 계산
		int price = this.price;
		
		if(percentage > 0) {
			price = (int)(price - this.price * (percentage / 100));
		}
		
		return price;
	}
	
	public void sell(int ammount) {
		//재고 수량이 출고하려는 수량보다 크거나 같을 때만 출고함
		if(this.quantity >= ammount) {
			quantity -= ammount;
		}
	}
	
	public void buy(int ammount) {
		quantity += ammount;
	}
}
