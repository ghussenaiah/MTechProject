package test;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Bank;
import services.Afetr_Returning_Advice;
import services.LogAroundService;
import services.LogBeforeService;

public class Client {

	
	public static void main(String[] args) {
		
		
		//ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("sources/test.xml");
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("sources/matcher.xml");
				Bank bproxy=(Bank)cap.getBean("proxy");
		
		/*Bank b=new Bank();
		
		//LogBeforeService lbs=new LogBeforeService();
		
		LogAroundService las=new LogAroundService();
		Afetr_Returning_Advice lbs1=new Afetr_Returning_Advice();
		ProxyFactoryBean pfb=new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(las);*/
	//	pfb.addAdvice(lbs);
		
/*Bank bproxy=(Bank)pfb.getObject();*/
				//this method invoke without calling services
				int amount=bproxy.findBalance("sbi123");
				//this method invoke  calling services			
//int amount=bproxy.deposit("sbi123",5000);
System.out.println(amount);

	}
}
