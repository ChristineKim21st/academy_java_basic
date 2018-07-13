package shoes.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import shoes.list.Shoe;

public class ShoeTest {

	public static void main(String[] args) {
		//1.선언
		Map<String, Shoe> shoeMap = new HashMap<String, Shoe>();
		
		//2.초기화
		Shoe reebok = new Shoe("SH001", "로얄 샌들 스타일", 250, 59000, "샌들", 10);
		Shoe adidas = new Shoe("SH002", "nizza", 270, 69000, "운동화", 5);
		Shoe puma = new Shoe("SH003", "플랫폼 샌들", 230, 79000, "샌들", 25);
		Shoe fila = new Shoe("SH004", "볼란태98", 265, 69000, "운동화", 20);
		
		//3.사용
		shoeMap.put(reebok.getShoeCode(), reebok);
		shoeMap.put(adidas.getShoeCode(), adidas);
		shoeMap.put(puma.getShoeCode(), puma);
		shoeMap.put(fila.getShoeCode(), fila);
	
		Set<String> keySet = shoeMap.keySet();
		
		//3. 각 자료구조별 shoes 를 foreach 로 출력
		for(String key : keySet) {
			System.out.println(shoeMap.get(key));
		}
		
		//4.SH003 번 코드로 등록된 신발의 정보 1개를 출력
		System.out.println("================SH003만 출력 =====================");
		for(String key : keySet) {
			if(shoeMap.get(key).equals(shoeMap.get("SH003"))) {
			System.out.println(shoeMap.get(key));
			}
		}
	
		//5.SH003 번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
		for(String key : keySet) {
			if(shoeMap.get(key).equals(shoeMap.get("SH003"))) {
				shoeMap.get(key).setQuantity(0);
				//6.변경된 재고 확인 출력
				System.out.println(shoeMap.get(key));
			}
		}
		
		//7.SH003 번 코드로 등록된 신발 정보를 삭제
		for(String key : keySet) {
			if(shoeMap.get(key).equals(shoeMap.get("SH003"))) {
				shoeMap.remove(key);
				//지우고 나서 사이즈가 줄어 들어서 break로 반복구문을 빠져나감
				break;
			}
		}
		
		//8.전체출력
		for(String key : keySet) {
			System.out.println(shoeMap.get(key));
		}
	
	}

}
