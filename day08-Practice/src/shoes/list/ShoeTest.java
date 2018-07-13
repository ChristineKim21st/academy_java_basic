package shoes.list;

import java.util.ArrayList;
import java.util.List;



/**
 *신발 제품코드
 *private String shoeCode;
 *
 *신발 제품 명
 *private String shoeName;
 *
 *신발의 사이즈(240, 250 등)
 *private int size;
 *
 *가격
 *private int price;
 *
 *신발의 타입(운동화, 샌들, 구두, 슬리퍼)
 *private String type;
 *
 *재고수량
 *private int quantity; 
 * @author PC38215
 *
 */
public class ShoeTest {
	
	public static void main(String[] args) {
		//1.선언
		List<Shoe> shoeList = new ArrayList<Shoe>();
		
		//2.초기화
		Shoe reebok = new Shoe("SH001", "로얄 샌들 스타일", 250, 59000, "샌들", 10);
		Shoe adidas = new Shoe("SH002", "nizza", 270, 69000, "운동화", 5);
		Shoe puma = new Shoe("SH003", "플랫폼 샌들", 230, 79000, "샌들", 25);
		Shoe fila = new Shoe("SH004", "볼란태98", 265, 69000, "운동화", 20);
		
		//3.사용
		shoeList.add(reebok);
		shoeList.add(adidas);
		shoeList.add(puma);
		shoeList.add(fila);
		
		//3. 각 자료구조별 shoes 를 foreach 로 출력
		System.out.println("===================전체출력======================");
		for(Shoe shoe : shoeList) {
			System.out.println(shoe);
		}
		
		//4.SH003 번 코드로 등록된 신발의 정보 1개를 출력
		System.out.println("================SH003만 출력 =====================");
		for(Shoe shoe : shoeList) {
			if(shoe.getShoeCode().equals("SH003")) {
			System.out.println(shoe);
			}
		}
		
		//5.SH003 번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
		for(Shoe shoe : shoeList) {
			if(shoe.getShoeCode().equals("SH003")) {
				shoe.setQuantity(0);
				//6.변경된 재고 확인 출력
				System.out.println(shoe);
			}
		}
		
		//7.SH003 번 코드로 등록된 신발 정보를 삭제
		for(int idx=0; idx < shoeList.size(); idx++) {
			if(shoeList.get(idx).getShoeCode().equals("SH003")) {
				shoeList.remove(idx);
			}
		}
		
		//8.전체출력
		System.out.println("===================전체출력======================");
		for(Shoe shoe : shoeList) {
			System.out.println(shoe);
		}
	}

}
