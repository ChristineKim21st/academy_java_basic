package io.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 표준 입력인 키보드 입력을 받아서
 * 표준 출력인 모니터로 출력하는 클래스
 * ---------------------------------
 * 1. node steam(키보드 : System.in : InputStream)
 * 2. filer stream (strem --> reader : InputStreamReader)
 *    1바이트 인풋스트림을 2바이트 문자로 변경
 *    (키보드는 사실 문자 입력이므로)
 * 3. filter stream(reader --> reader : BufferedReader)
 * 	  2바이트 문자 1개를 1줄 단위로 읽어서 스트링으로 만들수 있는
 * 	  편리한 메소드를 사용한다. 
 * 4. 3에서 만들어진 filter stream객체를 사용하여
 * 	  read() 작업 진행
 * 
 * 5. 읽은 내용을 표준 출력(모니터 = System.out)
 * 
 * 6.마지막 filter stream닫기(자원 해재)
 * @author PC38215
 *
 */
public class KeyboardInput2 {

	public static void main(String[] args) {
		//1.입력 노드 스트림(표준입력: 키보드)
		InputStream in = System.in;
		
		//2.노드 스트림을 포장할 필터 스트림
		InputStreamReader ir = new InputStreamReader(in);
		
		//3. 2의 필터 스트림을 편리한 사용을 위해서
		//   한번더 포장할 필터 스트림
		BufferedReader br  = new BufferedReader(ir);
		
		System.out.println("값을 입력하세요...(crtl + z입력시 중단)");
		
		//4. 3의 필터 스트림의 메소드를 사용하여 
		//   키보드 입력을 읽어 들인다.
		String readDate = null;
		try {
			while((readDate = br.readLine()) != null) {
				//5. null이 아니면 읽은 데이터가 있으므로 출력
				System.out.println("읽은 데이터 : "+ readDate);
				

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//6. 자원 해제
			// 예외 발생 여부와 관계가 없이
			// 항상 안정적으로 해제가 이루어 져야 하므로
			// 자원 해제 관련 구문은 fianlly에서 진행한다
			try {
				if(br != null);
				br.close();
			} catch (IOException e) {
				System.err.println("자원 반납 실패!"+ e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
