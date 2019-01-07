package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.aop.MethodBeforeAdvice;

import business.Bank;

public class LogBeforeService implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] parm, Object o) throws Throwable {
		
		//org.logicalcobwebs.logging.Log
				
		Log l=(Log) LogFactory.getLog(Bank.class);
				
		
				l.info("deposit method..................service");;
		
	}

	
	
	
}
