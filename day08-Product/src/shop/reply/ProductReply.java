package shop.reply;

import shop.Product;

/**
 * 매니저가 1건의 제품정보를 가지고
 * @author PC38215
 *
 */
public class ProductReply implements Reply {

	@Override
	public void reply(Object object) {
		Product product = (Product)object;
		product.print();
	}

}
