package source.com.bo;

import java.sql.SQLException;

import source.com.Order;
import source.com.dao.OrderDAO;
import source.com.exception.BOException;

public class OrderBOImple implements OrderBOI {
	
	private OrderDAO dao;

	public OrderDAO getDao() {
		return dao;
	}


	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}


	@Override
	public boolean placeOrder(Order order) throws BOException {
		
		try {
			int result=dao.create(order);
			
			if(result==0)
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new BOException(e);
		}
		
		return true;
	}


	@Override
	public boolean cancelOrder(int id) throws BOException {
		
		try {
			Order order=dao.read(id);
			     order.setStatus("Canceled"); 
			int result=dao.update(order);
			
			if(result==0)
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new BOException(e);
		}
		
		
		return true;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		
		
		try {

 
			int result=dao.delete(id);
			
			if(result==0)
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new BOException(e);
		}
		
		return false;
	}

}
