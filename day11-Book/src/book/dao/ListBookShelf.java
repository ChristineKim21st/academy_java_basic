package book.dao;


import java.util.ArrayList;
import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public class ListBookShelf implements BookShelf {
	
	//1. 멤버 변수 선언부
	private List<Book> books;
	
	
	//2.생성자 선언부
	// (1) 기본 생성자
	public ListBookShelf() {
		books = new ArrayList<Book>();
	}
	
	// (2) 매개 변수를 받는 생성자
	public ListBookShelf(List<Book> books) {
		this.books = books;
	}
	
	//접근자
	public List<Book> getBooks() {
		return books;
	}
	
	//수정자
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	//3.메소드
	/**
	 * Book에서 1개의 정보를 신규 추가함
	 */
	@Override
	public int insert(Book book) throws DuplicateException {
		int idx = findProductIdx(book);
		//추가하는 과정에서 추가할 제품이 이미 존재하면 0을 리턴하고
		int insertCnt = 0;
		
		if (idx == -1) {
			books.add(book);
			insertCnt++;
		//동일 데이터가 존재하지 않아 	
		} else {
			throw new DuplicateException("insert", book);
		}
		//추가에 성공하면 1을 리턴함
		return insertCnt;
	}
	
	/**
	 * Book 1개의 정보를 조회함
	 */
	@Override
	public Book select(Book book) throws NotFoundException {
		int selectIdx = findProductIdx(book);
		//(1)조회할 제품정보가 존재하지 않음 -> 초기화 null
		Book found = null;
		
		if (selectIdx > -1) {
			//or (2)찾아올 제품이 존재
			//(3)매개변수 selectIdx로 입력된
			found = books.get(selectIdx); 
			
		} else {
			throw new NotFoundException("select", book);
		}
		//(4)book와 동일한 책 정보를 @return
		return found;
	}
	
	/**
	 * Book 1개의 정보를 수정함
	 */
	@Override
	public int update(Book book) throws NotFoundException {
		int setCnt = 0;
		int setIdx = findProductIdx(book);
		
		//(1)수정하는 과정에서 수정할 제품 인덱스가
		//(2)-1 보다 크게 나와 성공한 경우
		if (setIdx > -1) {
			books.set(setIdx, book);
			setCnt++;
			
		} else {
			throw new NotFoundException("update", book);
		}
		
		//(3)수정 성공을 의미하는 1을 리턴
		return setCnt;
	}
	
	/**
	 * Book 1개의 정보를 삭제함
	 */
	@Override
	public int delete(Book book) throws NotFoundException {
		int rmCnt = 0;
		int rmIdx = findProductIdx(book);
		
		//(1)삭제하는 과정에서 삭제할 인덱스 setIdx가
		//(2)0이면 삭제할 제품 정보가 존재하지 않아서 실패함
		//or(3) 1이면 삭제할 제품 정보가 존재해서 삭제 성공함
		if (rmIdx > -1) {
			books.remove(rmIdx);
			rmCnt++;
			
		} else {
			throw new NotFoundException("delete", book);
		}
		
		//(4)삭제 성공을 의미하는 1을 리턴
		return rmCnt;
	}
	
	/**
	 * 모든 책 정보 조회
	 */
	@Override
	public List<Book> select() {
		return this.books;
	}
	
	//----------------------------------------------
	// 리스트 안에 찾으려는 제품의 인덱스를 구하는 지원 메소드
	private int findProductIdx(Book book) {
		int index = -1;

		for (int idx = 0; idx < books.size(); idx++) {
			if (books.get(idx).equals(book)) {
				index = idx;
				break;
			}
		}
		
		return index;
	}
}
