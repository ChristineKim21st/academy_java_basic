package encap.shop;

/**
 * 물건을 판매하는 매장을 나타내는 클래스
 * 매장에는 물건 판매를 위하여 최소 1명의
 * 매니저는 있어야 한다.
 * -->멤버변수로 선언
 * @author PC38215
 *
 */
public class Shop {
	//1.멤버변수 선언부 : 매장을 관리할 매니저 최소 1명
	private Manager manager;
	
	//2.생성자 선언부
	Shop(){
		manager = new Manager();
	}
	
	/**
	 * 내가 직접 매니저가 되는 것이 아니라
	 * 매니저를 밖에서 고용
	 * @param manager
	 */
	Shop(Manager manager){
		this.manager = manager;
	}
	
	
	
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	//3.메소드 선언부
	/**
	 * 매장에 신규 제품이 들어왔을 경우
	 * 매니저에게 부탁하여 신규 제품을 창고에 등록해 달라고 부탁함
	 * @param product
	 */
	public void add(Product product) {
		manager.add(product);
	}
	
	/**
	 * 매장에서 판매하는 제품 정보의 수정이 필요할 때
	 * 매니저에게 제품 정보를 수정할 것을 부탁함
	 * @param product
	 */
	public void set(Product product) {
		manager.set(product);
	}
	
	/**
	 * 매장에서 더 이상 판매다지 않는 제품의 
	 * 폐기를 매니저에게 부탁함
	 * @param product
	 */
	public void remove(Product product) {
		manager.remove(product);
	}
	
	/**
	 * 매장에 찾아온 고객에게 판매할 물건을
	 * 창고에서 가져다 달라고 매니저에게 부탁함
	 * @param product
	 * @return
	 */
	public Product get(Product product) {
		return manager.get(product);
	}
	
	/**
	 * 매장에서 판매될 모든 제품의 정보를
	 * 매니저에게 부탁함
	 * @param product
	 * @return
	 */
	public Product[] getAllProducts() {
		return manager.getAllProducts();
	}
}
