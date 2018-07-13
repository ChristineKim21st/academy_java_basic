package shoes.set;

import java.util.HashSet;
import java.util.Set;

import shoes.list.Shoe;

public class ShoeTest {

	public static void main(String[] args) {
		Set<Shoe> shoeSet = new HashSet<Shoe>();
		
		Shoe reebok = new Shoe("SH001", "로얄 샌들 스타일", 250, 59000, "샌들", 10);
		Shoe adidas = new Shoe("SH002", "nizza", 270, 69000, "운동화", 5);
		Shoe puma = new Shoe("SH003", "플랫폼 샌들", 230, 79000, "샌들", 25);
		Shoe fila = new Shoe("SH004", "볼란태98", 265, 69000, "운동화", 20);
		
		shoeSet.add(reebok);
		shoeSet.add(adidas);
		shoeSet.add(puma);
		shoeSet.add(fila);
		
		System.out.println("=================전체 출력=======================");
		for(Shoe shoe : shoeSet) {
			System.out.println(shoe);
		}
		
		System.out.println("================SH003만 출력 =====================");
		for(Shoe shoe : shoeSet) {
			if(shoe.getShoeCode().equals("SH003")) {
			System.out.println(shoe);
			}
		}
		
		//5.SH003 번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
		for(Shoe shoe : shoeSet) {
			if(shoe.getShoeCode().equals("SH003")) {
				shoe.setQuantity(0);
				//6.변경된 재고 확인 출력
				System.out.println(shoe);
			}
		}
		
		//7.SH003 번 코드로 등록된 신발 정보를 삭제
		for(Shoe shoe : shoeSet) {
			if(shoe.getShoeCode().equals("SH003")) {
				shoeSet.remove(shoe);
				break;
			}
		}
				
		//8.전체출력
		System.out.println("===================전체출력======================");
		for(Shoe shoe : shoeSet) {
			System.out.println(shoe);
		}
	}

}
