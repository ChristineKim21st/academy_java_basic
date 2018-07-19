package book.dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public class MapBookShelf implements BookShelf {
	//1.멤버 변수 선언 : 책정보를 저장할 맵
	//key값은 String 타입의 bookId이다
	Map<String, Book> books;
	
	//2.생성자
	//(1)기본생성자
	public MapBookShelf() {
		super();
		books = new HashMap<>();
	}
	
	//(2)매개변수를 받는 생성자
	public MapBookShelf(Map<String, Book> books) {
		super();
		this.books = books;
	}
	//생성자 end
	
	//접근자
	public Map<String, Book> getBooks() {
		return books;
	}

	//수정자
	public void setBooks(Map<String, Book> books) {
		this.books = books;
	}
	
	//3.메소드
	@Override
	public int insert(Book book) throws DuplicateException {
		int insertCnt = 0;
		// 같은 객체가 있는지 검사
		// isExists의 return값이 true  : 같은 객체가 존재함
		// isExists의 return값이 false : 같은 객체가 없음
		
		//(1)같은 객체가 없어서 추가가 가능하다 -> 
		//   isExists가 false라서 !isExists는 true이므로
		//   if문 안을 실행한다
		if (!isExists(book)) {
			books.put(book.getBookId(), book);
			insertCnt++;
		} else {
			// 같은 객체가 존재함
			throw new DuplicateException("insert", book);
		}	
		
		return insertCnt;
	}
	
	/**
	 * 책 정보 1개를 보여주는 메소드
	 */
	@Override
	public Book select(Book book) throws NotFoundException {
		Book found = null;
		
		// isExists의 return값이 true  : 찾고자 하는 해당 객체가 존재함
		// isExists의 return값이 false : 찾고자 하는 해당 객체가 없음
		if (isExists(book)) {
			//key값인 BookId로 books 중에 해당 value값을 찾아와서 
			//Book타입인 found에 저장 
			found = books.get(book.getBookId());
			
		} else {
			// 조회할 제품이 존재하지 않음
			// ->Exception 나타냄
			throw new NotFoundException("select", book);
		}
		//찾은 해당 value return
		return found;
	}
	
	/**
	 * 해당 Book 1개를 찾아 수정하는 메소드 
	 */
	@Override
	public int update(Book book) throws NotFoundException {
		int updateCnt = 0;
		
		// isExists의 return값이 true  : 수정하고자 하는 해당 객체가 존재함
		// isExists의 return값이 false : 수정하고자 하는 해당 객체가 없음
		if (isExists(book)) {
			books.replace(book.getBookId(), book);
			updateCnt++;
		} else {
			// 수정할 제품이 존재하지 않음
			//Exception
			throw new NotFoundException("update", book);
		}
		
		return updateCnt;
	}

	@Override
	public int delete(Book book) throws NotFoundException {
		int deleteCnt = 0;
		
		if (isExists(book)) {
			books.remove(book.getBookId());
			deleteCnt++;
		} else {
			// 삭제할 제품이 존재하지 않음
			throw new NotFoundException("remove", book);
		}
		
		return deleteCnt;
	}

	@Override
	public List<Book> select() {
		Collection<Book> collection = books.values();
		Book[] bookArray = new Book[collection.size()];
		
		return Arrays.asList(collection.toArray(bookArray));
	}
	
	
	//---------------------------------
	// 제품이 이미 존재하는지 여부 확인해주는 메소드
	// true  : 존재함
	// false : 없음
	private boolean isExists(Book book) {
		return books.containsKey(book.getBookId());
	}

}
