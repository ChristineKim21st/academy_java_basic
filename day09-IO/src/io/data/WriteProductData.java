package io.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 객체 생성 후 객쳉듸 데이터 필드 (멤버변수)를 출력
 * -- 입력 --
 * 1.Product 객체 생성
 * 
 * -- 출력 --
 * 2. node stream(파일에 출력: FileOutputStream)
 * 3. filter stream(data 단위 출력: DateOutputStream)
 * 4. write작업 : filter stream으 ㅣ메소드로 출력
 * 
 * -- 정리 --
 * 5.출력 filter stream 닫기
 * 
 * 
 * @author PC38215
 *
 */
public class WriteProductData {

	public static void main(String[] args) throws IOException {
		Product adidas = new Product("S001", "슈퍼스타", 87200, 5);
		
		FileOutputStream fos = new FileOutputStream("adidas.data");
		
		DataOutputStream out = new DataOutputStream(fos);
		
		out.writeUTF(adidas.getProdCode());
		out.writeUTF(adidas.getProdName());
		out.writeInt(adidas.getPrice());
		out.writeInt(adidas.getQuantity());
		
		System.out.println("adidas.data 파일이 생성되었습니다");
		
		out.close();
	}

}
