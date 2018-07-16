package shop.view;

import java.util.List;

import shop.vo.Product;

/**
 * 
 * @author PC38215
 *
 */
public class ListReply implements Reply {

	@Override
	public void reply(Object object) {
		//object로 제품정보 목록이 넘어온다.
		List<Product> products = (List<Product>)object;
		for(Product product : products) {
			product.print();
		}
	}

}
