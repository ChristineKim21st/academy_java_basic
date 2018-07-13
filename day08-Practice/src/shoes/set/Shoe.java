package shoes.set;


public class Shoe {
	//1.멤버변수 선언
	//신발 제품코드
	private String shoeCode;
	
	//신발 제품 명
	private String shoeName;
	
	//신발의 사이즈(240, 250 등)
	private int size;
	
	//가격
	private int price;
	
	//신발의 타입(운동화, 샌들, 구두, 슬리퍼)
	private String type;
	
	//재고수량
	private int quantity;
	
	//2.생성자 선언부
	Shoe() {
		
	}
	
	Shoe(String shoeCode){
		this.shoeCode = shoeCode;
	}
	
	Shoe(String shoeCode, String shoeName){
		this(shoeCode);
		this.shoeName = shoeName;
	}
	
	Shoe(String shoeCode, String shoeName, int size){
		this(shoeCode, shoeName);
		this.size = size;
	}
	
	Shoe(String shoeCode, String shoeName, int size, int price){
		this(shoeCode, shoeName, size);
		this.price = price;
	}
	
	Shoe(String shoeCode, String shoeName, int size, int price, String type){
		this(shoeCode, shoeName, size, price);
		this.type = type;
	}

	Shoe(String shoeCode, String shoeName, int size, int price, String type, int quantity){
		this(shoeCode, shoeName, size, price, type);
		this.quantity = quantity;
	}
	
	//3.접근자, 수정자
	public String getShoeCode() {
		return shoeCode;
	}

	public void setShoeCode(String shoeCode) {
		this.shoeCode = shoeCode;
	}

	public String getShoeName() {
		return shoeName;
	}

	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shoeCode == null) ? 0 : shoeCode.hashCode());
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
		Shoe other = (Shoe) obj;
		if (shoeCode == null) {
			if (other.shoeCode != null)
				return false;
		} else if (!shoeCode.equals(other.shoeCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
