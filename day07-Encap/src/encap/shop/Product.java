package encap.shop;

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
	private String prodCode;
	/**제품이름*/
	private String prodName;
	/**제품가격*/
	private int price;
	/**재고개수*/
	private int quantity;
	
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
	
	/**-------------------------------------------------------
	* 멤버변수 필드의 가시성을 private으로 선언하면
	* 다른 모든 클래스에서 접근이 불가능해진다
	* 따라서 숨겨진 필드에 접근 할 수 있는 전용 메소드 쌓을 
	* 정의해야한다
	* ======================================================
	* 접근자 메소드:getter
	* get으로 시작한다
	* get뒤에 오는 이름은 접근하려는 멤버변수 명의
	* 첫 글자만 대문자화 한다
	* 메소드 매개가 없다.
	* 매소드 리턴타입을 접근하려는 멤버변수 타입과 맞춘다
	* 멤벼변수의 타입이 boolean이면
	* get이 아니라 is 형태로 정의
	* getXxx() 형태로 정의
	* ------------------------------------------------------
	* 수정자 메소드:setter
	* set으로 시작한다
	* set뒤에 오는 이름은 수정하려는 멤버변수 명의
	* 첫 글자만 대문자화 한다
	* 매소드 매개 변수는 수정하려는 멤버변수의 타입과 맞추고
	* 보통 같은 이름으로 설정한다.
	* 수정만 하기 때문에 리턴타입은 void이다.
	* 보통 안쪽의 로직은 this.멤버변수 = 매개변수 로 작성.
	*/
	
	/**prodCode의 접근자 */
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

	public void print() {
		System.out.printf("제품 정보 [제품코드: %s, 제품이름: %s, 제품가격: %,3d, 재고수량: %d]%n", 
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
	
	
	//Object 클래스에서 나도 모르는 사이 상속받은
	//toString()메소드를 재정의 해보자
	//1.메소드 헤더가 동일: 리턴타입 메소드이름(매개변수)
	@Override
	public String  toString() {
		String strProduct = String.format("제품 정보 [제품코드: %s, 제품이름: %s, 제품가격: %,3d, 재고수량: %d]%n", 
				prodCode, prodName, price, quantity);
		return strProduct;
	}

	
}
