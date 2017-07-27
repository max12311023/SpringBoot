package Emp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.services.Imb_mainService;

@RestController
public class Dept2Controller {
	
	
	Dept2Service Dept2Service;
	
	@Autowired
	public void setDept2Service(Dept2Service Dept2Service) {
		this.Dept2Service = Dept2Service;
	}

	//getAll
	@RequestMapping(value = "/getAllDept", method = RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("dept2",Dept2Service.findByPrimaryKey(10));
		modelAndView.setViewName("dept2");
		
		return modelAndView;
	}
}
