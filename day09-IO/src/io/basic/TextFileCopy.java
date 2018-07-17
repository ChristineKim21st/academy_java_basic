package io.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 파일 입력을 받아서
 * 파일로 출력하는 클래스
 * ---------------------------------
 * --입력--
 * 1.node stream(문자(reader)파일 : FileReader)
 * 2.filter stream(reader -> reader : BufferReader)
 * 3.filter stream의 메소드 사용: readLine()
 * 
 * --출력--
 * 4.node stream (문자(wirter))파일 : FileWriter)
 * 5.filter stream (writer -> writer : Printwriter)
 * 6.write 작업: 
 * @author PC38215
 *
 */
public class TextFileCopy {

	public static void main(String[] args) throws IOException {
		//1. input node stream
		FileReader fr = new FileReader("out.txt");
		
		//input filter stream (한줄로 감싸기)
		BufferedReader br = new BufferedReader(fr);
		
		//=====================입력 객체 선언 끝
		
		//4.output node stream
		FileWriter fw = new FileWriter("copied.txt");
		
		//5.output filter stream
		PrintWriter pw = new PrintWriter(fw);
		
		//=====================출력 객체 선언, 초기화 끝
		
		//3. read작업
		String input = null;
		
		while((input = br.readLine()) != null) {
			//6. write작업
			pw.println(input);
			//확인을 위한 화면 출력을 같이
			System.out.println("파일에서 읽은 데이터:"+ input);
		}
		System.out.println("파일복사가 완료되었습니다.");
		
		//7.input filter String 닫기
		br.close();
		
		//8.output filter String 닫기
		pw.close();
	}
	

}
