package com.example.demo;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	@RequestMapping(method = RequestMethod.GET, value="/helloAction/sayHello.do")
	public String method1(ModelMap model) {
		
		model.addAttribute("greetingKey", "Hello World, 世界你好!");
		return "welcome/front-view"; //Internal Resource View (內部資源視圖)
	}
	@RequestMapping(method = RequestMethod.GET, value="/helloAction/sayHello1.do")
	public String method2(ModelMap model, @RequestParam("ename") String ename) {
		System.out.println("RequestMapping-sayHello2被呼叫: ename="+ename);
		model.addAttribute("greetingKey", ename);
		return "welcome/front-view"; //Internal Resource View (內部資源視圖)
	}
	
	


}