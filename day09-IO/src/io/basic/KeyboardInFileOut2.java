package io.basic;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 표준 이력인 키보드 입력을 받아서
 * 입력된 내용을 파일로 출력하는 클래스
 * -----------------------------
 * -- 입력 --
 * 1. node stream (키보드: System.in : InputStream)
 * 2. filter stream (stream -> reader :InputStreamReader)
 * 3. filter stream(reader -> reader : BufferedReader)
 * 4. 3의 filter stream을 통하여 1줄 당뉘의
 *    String입력으로 처리하는 메소드 reaLine()을 사용
 *    
 * -- 출력 --
 * 5. node stream(파일 - 문자저장 파일: writer : FileWriter)
 * 6. filter Stream(writer -> writer : Printwriter)
 * 7. 6의 filter stream을 통하여 출력
 *    1줄 단위 출력을 지원하는 메소드 println()을 사용
 *    
 * -- 출력 --
 * 8. 입력에서 마지막으로 사용된 filter stream 닫기
 * 9. 출력에서 마지막으로 사용된   filter stream 닫기
 * 
 * @author PC38215
 *
 */
public class KeyboardInFileOut2 {

	public static void main(String[] args) {
		//1.Input node stream: System.in
		InputStream in = System.in;
		
		//2.node stream -> filter stream :inputStream _> reader
		InputStreamReader ir = new InputStreamReader(in);
		
		//3.filter -> filter : 1줄 단위 입력
		BufferedReader br = new BufferedReader(ir);
		
		//===================입력 객체에 대한 선언
		//5. output node writer
//		FileWriter fw = new FileWriter("out.txt");
		
		//6.node -> filter : 1줄 단위 출력
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter("out.txt"));
			//===================출력 객체에 대한 선언, 초기화 끝
			String input = null;
			while((input = br.readLine()) != null) {
				//7. 출력 filter stream 에 쓰기
				//   파일 쓰기
				pw.println(input);
				//화면에도 같이 출력(확인을 위한 목적)
				System.out.println(input);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//8. 입력 filter stream 닫기
			try {
				if(br != null) {
					br.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//9. 출력 filter stream 닫기
			if(pw != null)	{
				pw.close();
			}
		}
		
	}

}
