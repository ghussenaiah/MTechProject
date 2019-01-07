package services;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import business.AcNotFoundException;

public class DepositPointCutMethod extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class c) {
		
		
		
		String name=m.getName();
		
		if(name.equals("deposit"))
			return true;
		else
			
		return false;
	}

}
