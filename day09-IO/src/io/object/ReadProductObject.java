package io.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * adidas.obj파일을 읽어서 객체를 생성하고
 * 표준 출력으로 생성된 객체의 내용을 확인
 * ----------------------------------
 * --입력--
 * 1. node stream(파일: FileInputStream)
 * 2. filter stream(객체입력: ObjectInputStream)
 * 3. read 작업: filter stream
 * 
 * --출력--
 * 4. 표준출력(콘솔: sysout)
 * 
 * --정리--
 * 5.입력 filter stream닫기
 * @author PC38215
 *
 */
public class ReadProductObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//1.input node stream
		FileInputStream fis = new FileInputStream("adidas.obj");
		
		//2. input filter stream
		ObjectInputStream in = new ObjectInputStream(fis);
		
		//3.read작업
		Product adidas = (Product)in.readObject();
		
		//4.객체 표준 출력
		System.out.println(adidas);
		
		//5.입력 filter stream
		in.close();
	}

}
