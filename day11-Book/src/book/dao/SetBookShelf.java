package book.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public class SetBookShelf implements BookShelf {
	// 1. 멤버 변수 : 제품을 저장할 자료구조로 set 선택
	private Set<Book> books;
	
	//2.생성자
	//(1)기본생성자
	public SetBookShelf() {
		books = new HashSet<Book>();
	}
	
	//(2)매개변수가 있는 생성자
	public SetBookShelf(Set<Book> books) {
		super();
		this.books = books;
	}//생성자 end
	
	//접근자
	public Set<Book> getBooks() {
		return books;
	}
	
	//수정자
	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	//3.메소드
	//set이라는 api의 add는 추가를 시도해보고 나서
	//동일한 객체가 있으면 false
	@Override
	public int insert(Book book) throws DuplicateException {
		boolean success = books.add(book);
		return success ? 1 : 0;
	}

	@Override
	public Book select(Book book) throws NotFoundException {
		return findProduct(book);
	}

	@Override
	public int update(Book book) throws NotFoundException {
		// Set 은 수정기능의 api 가 없으므로 
		// 기존 것 remove 후 add
		boolean rmSuccess = books.remove(book);
		boolean addSuccess = false;
		if (rmSuccess) {
			books.add(book);
			addSuccess = true;
		}
		
		return addSuccess ? 1 : 0 ;
	}

	@Override
	public int delete(Book book) throws NotFoundException {
		boolean success = books.remove(book);
		return success ? 1 : 0;
	}

	@Override
	public List<Book> select() {
		List<Book> books = new ArrayList<Book>();
		
		for (Book book : this.books) {
			books.add(book);
		}
		
		return books;
	}

	
	//------------------------------------
	private Book findProduct(Book book) {
		Book found = null;
		
		for (Book aBook: books) {
			if (aBook.equals(book)) {
				found = aBook;
				break;
			}
		}
		
		return found;
	}
}
