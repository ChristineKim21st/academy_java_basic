package jdbc.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

/**
 * SCOTT 계정의 EMP 테이블을 조회
 * 
 * 1. 드라이버 로드 
 * 2. 커넥션 맺기
 * 3. 쿼리 준비
 * 4. 쿼리 실행
 * 5. 결과 처리
 * 6. 자원 해제
 * ------------------------------------
 * @author PC38209
 *
 */
public class StatementTest {

 private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
 private static final String USER = "SCOTT";
 private static final String PASSWORD = "TIGER";

 public static void main(String[] args) throws SQLException {

	  // 1. 드라이버 로드 : 방법 1 : 드라이버 인스턴스 생성
	  new OracleDriver();
	  
	  // 2. 커넥션 맺기
	  Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	  
	  // 3. 쿼리 준비 : empno의 값을 변경해가면서 1명의 정보를 조회
	  System.out.println("조회할 직원의 사번을 숫자 4자리로 입력하세요");
	  Scanner scan = new Scanner(System.in);
	  int eno = scan.nextInt();
	  
	  String sql = "SELECT e.EMPNO"
	    + "         ,e.ENAME"
	    + "     FROM emp e"
	    + "	   WHERE e.EMPNO = "+ eno;
	  
	  Statement stmt = conn.createStatement();
	  
	  // 4. 쿼리 실행
	  ResultSet result = stmt.executeQuery(sql);
	  
	  // 5. 결과 처리 : 반복수행 (DQL 실행 결과는 보통 여러 행이기 때문)
	  
	  ResultSetMetaData meta =result.getMetaData();
	  String empnoCol = meta.getColumnName(1);
	  String enameCol = meta.getColumnName(2);
	  System.out.printf("%6s |%7s%n", empnoCol, enameCol);
	  
	  while (result.next()) {
	   int empno = result.getInt(1);
	   String ename = result.getString(2);
	   System.out.printf("%6d %7s%n", empno, ename);
	  }
	  
	  // 6. 자원 해제
	  //    순서 : 오픈한 반대 순서
	  //         result => stmt => conn
	  if (result != null) 
	   result.close();
	  
	  if (stmt != null)
	   stmt.close();
	  
	  if (conn != null)
	   conn.close();
	  
	  
 }

}
 