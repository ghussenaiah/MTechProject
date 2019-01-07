

package com.javatpoint;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
@Controller  
//controller means no need to extend any other class or no implementation of any other interfaces
public class HelloWorldController {  
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() {  
    	
        String message = "HELLO SPRING MVC HOW R U"; 
      /*  ModelAndView mm=new ModelAndView("hellopage");
        mm.addObject("message","Hello David");
        return mm;*/
        
        return new ModelAndView("hellopage", "message", message);  
    }  
}  