package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

import business.Bank;

public class Afetr_Returning_Advice implements AfterReturningAdvice{

	
	


	@Override
	public void afterReturning(Object ret, Method m, Object[] param, Object o) throws Throwable {
		//Method m, Object[] param, Object o this arguments are performing some intraceptions on code 
		//org.logicalcobwebs.logging.Log
		
		Log l=(Log) LogFactory.getLog(Bank.class);
				
		
				l.info("deposit method..................service-----------------"+ret);
	}
}
