package io.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 이미지 파일로 입력을 받아서
 * 이미지 파일로 출력하는 클래스 (Stream으로만 작업하는 클래스)
 * ====================================================
 * --입력--
 * 1. node stream(FileInputStream0
 * 2. read 작업 : node stream메소드로 작업 : read()
 * 
 * --출력--
 * 3.node stream(FileOutputStream)
 * 4.write 작업 : node stream 메소드로 작업: write();
 * 
 * --정리--
 * 5. 입력 node stream 닫기
 * 6. 출력 node stream 닫기
 * 
 * @author PC38215
 *
 */
public class ImageCopy2 {

	public static void main(String[] args){
		//1.input node stream(FileInputStream)
		FileInputStream in = null;
		
		//2. read작업: read()메소드 사용
		//노드 스트림의 read()를 실행할때
		//byte[]을 매개변수로 받는 메소드를 사용
		//(1)byte 배열 :buffer 선언
		byte[] buffer = new byte[2048];
		//(2)노드 스트림의 read(), 메소드는 읽어들인 바이트 수를 정수로 리턴
		//	 읽은 데이터가 없으명 -1을 리턴
		int readSize = 0;
		int repeat=0;
		try {
			in = new FileInputStream("2.png");
			FileOutputStream out = new FileOutputStream("2-copied.png");
			//(3) read()
			try {
				while((readSize = in.read(buffer)) != -1) {
					//4.write() 작업 : node stream  메소드로 쓰기
					try {
						out.write(buffer);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//화면에 작업 내용 출력
					System.out.printf("읽은 바이트: %d \t, 반복 횟수 :%d%n", readSize, ++repeat);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("이미지 파일 복사가 완료 되었습니다");
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//=================입력 node stream선언, 초기화 끝
		
		//3.output node stream (FileOutputStream)
		
		
		
		
		
		

	}

}
