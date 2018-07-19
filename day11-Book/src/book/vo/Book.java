package book.vo;


public class Book {
	//1.변수 선언
	/**책을 관리할 아이디 BK001 등*/
	String bookId;
	
	/**책 제목*/
	String title;

	/**저자명*/
	String author;

	/**가격*/
	int price;

	/**13자리 숫자 도서 ISBN*/
	String isbn;

	/**출판사*/
	String publish;
	
	//2.생성자
	//기본 생성자
	Book(){
		
	}
	
	//매개변수가 있는 생성자
	Book(String bookId){
		this.bookId = bookId;
	}
	
	Book(String bookId, String title){
		this(bookId);
		this.title = title;
	}
	
	Book(String bookId, String title, String author){
		this(bookId, title);
		this.author = author;
	}
	
	Book(String bookId, String title, String author, int price){
		this(bookId, title, author);
		this.price = price;
	}
	
	Book(String bookId, String title, String author, int price, String isbn){
		this(bookId, title, author, price);
		this.isbn = isbn;
	}
	
	Book(String bookId, String title, String author, int price, String isbn, String publish){
		this(bookId, title, author, price, isbn);
		this.publish = publish;
	}
	
	/**
	 * 책아이디 접근자
	 * @return
	 */
	public String getBookId() {
		return bookId;
	}
	
	/**
	 * 책아이디 수정자
	 * @param bookId
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	/**
	 * 책 제목 접근자
	 * @return
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * 책제목 수정자
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * 저자명 접근자
	 * @return
	 */
	public String getAuthor() {
		return author;
	}
	
	
	/**
	 * 저자명 수정자
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * 책가격 접근자
	 * @return
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * 책가격 수정자
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * isbn접근자
	 * @return
	 */
	public String getIsbn() {
		return isbn;
	}
	
	/**
	 * isbn수정자
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * 출판사 접근자
	 * @return
	 */
	public String getPublish() {
		return publish;
	}
	
	/**
	 * 출판사 수정자
	 * @param publish
	 */
	public void setPublish(String publish) {
		this.publish = publish;
	}
	//end 접근자, 수정자 
	
	
	/**
	 * Object클래스에서 상속받은 
	 * toString()메소드: 사람이 이해할 수 있는 언어로 객체를 작성하는 것
	 * hashCode()메소드
	 * equals(Object obj)메소드
	 * ====================재정의=========================
	 */
	@Override
	public String toString() {
		String strProduct = String.format(
				"책 정보 [아이디: %s, 제목: %s, 저자: %s, 가격: %d, ISBN넘버: %s, 출판사: %s]%n"
		         , bookId, title, author, price, isbn, publish);
		return strProduct;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
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
		Book other = (Book) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		return true;
	}
	
	
	
	
}
