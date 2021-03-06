//package book.dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import book.exception.DuplicateException;
//import book.exception.NotFoundException;
//import book.vo.Book;
//
//public class JdbcBookShelf implements BookShelf {
//	// DB 커넥션을 위한 정보
//	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
//	private static final String USER = "SCOTT";
//	private static final String PASSWORD = "TIGER";
//	private static final String DRIVER = "oracle.jdbc.OracleDriver";
//
//	// 2. 생성자 선언
//	public JdbcBookShelf() { 
//	}
//		
//	@Override
//	public int insert(Book book) throws DuplicateException {
//		//추가하고자 할 때 추가하려는 책이 이미 있는지 확인
//		// isExists의 return값이 true  : 같은 객체가 존재함
//		// isExists의 return값이 false : 같은 객체가 없음
//		if(isExists(book)) {
//			//isExists(book) : true(이미 존재함) --> 중복 Exception
//			throw new DuplicateException("추가", book);
//		}
//		
//		// 0. 필요 객체 선언
//		int insertCnt = 0;
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		
//		try {
//			// 1. 드라이버 로드
//			Class.forName(DRIVER);
//			
//			// 2. 커넥션 맺기
//			conn = DriverManager.getConnection(URL, USER, PASSWORD);
//			
//			// 3. 쿼리 준비
//			/*table : book
//			bookid      VARCHAR2(5) 
//			title       VARCHAR2(200)   NOT NULL
//			author      VARCHAR2(50)    NOT NULL
//			price       NUMBER(10)
//			isbn        VARCHAR2(13)
//			publish     VARCHAR2(30)
//			regdate     DATE    DEFAULT sysdate
//			moddate     DATE*/
//			String sql = " INSERT INTO book(bookid, title, author"
//					   + ", price, isbn, publish)"
//			           + " VALUES (?, ?, ?, ?, ?, ?)";
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, book.getBookId());
//			pstmt.setString(2, book.getTitle());
//			pstmt.setString(3, book.getAuthor());
//			pstmt.setInt(4, book.getPrice());
//			pstmt.setString(5, book.getIsbn());
//			pstmt.setString(6, book.getPublish());					
//			
//			// 4. 쿼리 실행
//			insertCnt = pstmt.executeUpdate();
//			
//			// 5. 결과 처리
//			//   ==> 쿼리 실행 전 중복 여부 검사하므로 특별한
//			//       결과 처리가 필요 없음
//			
//		//클래스 명이 잘못되어 클래스를 찾을 수가 없을 때
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		
//	    //SQL문에 문법적인 오류가 있을 때 ex)변수는 6개 인데 ?는 4개...
//		} catch (SQLException e) {
//			e.printStackTrace();
//		
//		//그 외 기타 등등 가장 큰 예외	
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		} finally {
//			// 6. 자원 해제
//			try {
//				if (pstmt != null) {
//					pstmt.close();					
//				}
//				if (conn != null) {
//					conn.close();
//				}
//				
//			} catch (SQLException e) {
//				System.err.println("자원 반납 오류!");
//				e.printStackTrace();
//				
//			}
//		}
//		
//		return insertCnt;
//	}
//	
//
//	@Override
//	public Book select(Book book) throws NotFoundException {
//		// 조회하려는 제품 존재여부 검사 : isExists()
//		if (!isExists(book)) {
//			throw new NotFoundException("조회", book);
//		}
//		
//		// 0. 필요 객체 선언
//		Book found = null;
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet result = null;
//		
//		try {
//			// 1. 드라이버 로드
//			Class.forName(DRIVER);
//			
//			// 2. 커넥션 맺기
//			conn = DriverManager.getConnection(URL, USER, PASSWORD);
//			
//			/*table : book
//			bookid      VARCHAR2(5) 
//			title       VARCHAR2(200)   NOT NULL
//			author      VARCHAR2(50)    NOT NULL
//			price       NUMBER(10)
//			isbn        VARCHAR2(13)
//			publish     VARCHAR2(30)
//			regdate     DATE    DEFAULT sysdate
//			moddate     DATE*/
//			// 3. 쿼리 준비
//			String sql = "SELECT  b.bookid"  
//						+ "      ,b.title"  
//						+ "      ,b.author" 
//						+ "      ,b.price" 
//						+ "      ,b.isbn" 
//						+ "      ,b.publish" 
//						+ "  FROM book b" 
//						+ " WHERE b.bookid = ?";
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, book.getBookId());
//			
//			// 4. 쿼리 실행
//			result = pstmt.executeQuery();
//			
///*			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, book.getBookId());
//			pstmt.setString(2, book.getTitle());
//			pstmt.setString(3, book.getAuthor());
//			pstmt.setInt(4, book.getPrice());
//			pstmt.setString(5, book.getIsbn());
//			pstmt.setString(6, book.getPublish());*/
//			// 5. 결과 처리
//			while (result.next()) {
//				String bookId = result.getString(1);
//				String title = result.getString(2);
//				String author = result.getString(3);
//				int price = result.getInt(4);
//				String isbn = result.getString(5);
//				String publish = result.getString(6);
//				
//				found = new Book(bookId, title, author, price, isbn, publish);
//			}
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			
//		} finally {
//			// 6. 자원 해제
//			try {
//				if (result != null) {
//					result.close();
//				}
//				if (pstmt != null) {
//					pstmt.close();					
//				}
//				if (conn != null) {
//					conn.close();
//				}
//				
//			} catch (SQLException e) {
//				System.err.println("자원 반납 오류!");
//				e.printStackTrace();
//			}
//		}
//		
//		return found;
//	}
//
//	@Override
//	public int update(Book book) throws NotFoundException {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int delete(Book book) throws NotFoundException {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public List<Book> select() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//	//---------------------------------
//	// 지원 메소드 : 등록, 수정, 삭제, 조회할 대상 제품의
//	//               존재여부를 확인하는 메소드
//	private boolean isExists(Book book) {
//		boolean isExist = false;
//		
//		// 0. 필요객체 선언
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet result = null;		
//
//		try {
//			// 1. 드라이버 로드
//			Class.forName(DRIVER);
//			
//			// 2. 커넥션
//			conn = DriverManager.getConnection(URL, USER, PASSWORD);
//			
//			// 3. 쿼리 준비
//			String sql = "SELECT p.prodcode" 
//			           + "  FROM product p" 
//					   + " WHERE p.prodcode = ?";
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, book.getBookId());
//			
//			// 4. 쿼리 실행
//			result = pstmt.executeQuery();
//			
//			// 5. 결과 처리
//			while (result.next()) {
//				// 조회 결과가 있다는 뜻은 동일 제품 코드가 등록되었음
//				isExist = true;
//			}
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			
//		} finally {
//			// 6. 자원 해제
//			try {
//				if (result != null) {
//					result.close();
//				}
//				if (pstmt != null) {
//					pstmt.close();					
//				}
//				if (conn != null) {
//					conn.close();
//				}
//				
//			} catch (SQLException e) {
//				System.err.println("자원 반납 오류!");
//				e.printStackTrace();
//				
//			}
//		}
//		
//		return isExist;
//	}
//
//}
