package source.com.bo;

import source.com.Order;
import source.com.exception.BOException;

public interface OrderBOI {

	boolean placeOrder(Order order) throws BOException;
	
	boolean cancelOrder(int id) throws BOException;
	
	boolean deleteOrder(int id) throws BOException;
	
}
