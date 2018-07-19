package io.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInput2 {

	public static void main(String[] args){
		//1.input nod stream : file reader
//		FileReader fr = new FileReader("out.txt");
		
		//2.input filter stream: reader -. reader
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("out.txt"));
			String input = null;
			try {
				while((input  = br.readLine()) != null){
					//4., 5.
					System.out.println("파일에서 읽은 데이터:"+ input);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//6.input filter stream닫기
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//3.filter stream 메소드로 읽기 : readLine(	);
//		System.out.println("값을 입력하세요 (crtl+z를 입력하면 중단)");
		
		
	}

}
