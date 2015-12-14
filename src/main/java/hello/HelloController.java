package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        
	return "Greetings from Spring Boot!";
	
    }
    @RequestMapping("/test")
	public String test()
	{
		Date NewDate = new Date();	
		
		String resp = ("Key date:"+NewDate.toString());
		return resp;
	}

}


