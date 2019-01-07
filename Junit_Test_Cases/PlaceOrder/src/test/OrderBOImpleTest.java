package test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.MockitoAnnotations;

import source.com.Order;
import source.com.bo.OrderBOImple;
import source.com.dao.OrderDAO;
import source.com.exception.BOException;

public class OrderBOImpleTest {

    @Mock
    OrderDAO dao;
    
    OrderBOImple b;
    
    //create instance for interface class
	
	@Before
	public void setup(){
		  b=new OrderBOImple();
		
		MockitoAnnotations.initMocks(this);
	}
  @Test
  public void placeOrder() throws BOException, SQLException{
	  
	 
	  b.setDao(dao);
	  
	  Order order=new Order();
	  Mockito.when(dao.create(order)).thenReturn(new Integer(1));
	  
	  boolean result= b.placeOrder(order);
	  assertTrue(result);
	  Mockito.verify(dao).create(order);
	   
	 }
  @Test
  public void notplaceOrder() throws BOException, SQLException{
	  
	  OrderBOImple b=new OrderBOImple();
	  b.setDao(dao);
	  
	  Order order=new Order();
	  Mockito.when(dao.create(order)).thenReturn(new Integer(0));
	  
	  boolean result= b.placeOrder(order);
	  assertFalse(result);
	  Mockito.verify(dao).create(order);
	   
	 }

  @Test
  public void cancelOrder() throws BOException, SQLException{
	  
	 
	  b.setDao(dao);
	  
	  Order order=new Order();
	  Mockito.when(dao.read(123)).thenReturn(order);
	  Mockito.when(dao.update(order)).thenReturn(new Integer(1));
	  
	  boolean result= b.cancelOrder(123);
	  assertTrue(result);
	   
	  Mockito.verify(dao).read(123);
	  Mockito.verify(dao).update(order);
	   
	 }
  
  @Test
  public void notcancelOrder() throws BOException, SQLException{
	  
	 
	  b.setDao(dao);
	  
	  Order order=new Order();
	  Mockito.when(dao.read(123)).thenReturn(order);
	  Mockito.when(dao.update(order)).thenReturn(new Integer(0));
	  
	  boolean result= b.cancelOrder(123);
	  assertFalse(result);
	   
	  Mockito.verify(dao).read(123);
	  Mockito.verify(dao).update(order);
	 }

  @Test(expected=BOException.class)
  public void placeOrder_ThrowBOIException() throws BOException, SQLException{
	  
	 
	  b.setDao(dao);
	  
	  Order order=new Order();
	  Mockito.when(dao.create(order)).thenThrow(new SQLException());
	  
	b.placeOrder(order);


	   
	 }
  
  
  @Test(expected=BOException.class)
  public void cancelOrder_Throwsexception() throws BOException, SQLException{
	  
	 
	  b.setDao(dao);
	  Mockito.when(dao.read(123)).thenThrow(new SQLException());
      b.cancelOrder(123);
 }
  @Test(expected=BOException.class)
  public void cancelOrder_Throwexception() throws BOException, SQLException{
	  
	 
	  b.setDao(dao);
	  
	  Order order=new Order();
	  Mockito.when(dao.read(123)).thenReturn(order);
	  Mockito.when(dao.update(order)).thenThrow(new SQLException());
	  
	 b.cancelOrder(123);


	   
	 }
  

}
