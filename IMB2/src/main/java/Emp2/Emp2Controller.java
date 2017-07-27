package Emp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.services.Imb_mainService;

@RestController
public class Emp2Controller {
	
	
	Emp2Service emp2Service;
	
	@Autowired
	public void setEmp2Service(Emp2Service emp2Service) {
		this.emp2Service = emp2Service;
	}

	//getAll
	@RequestMapping(value = "/getAllEmp", method = RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView modelAndView = new ModelAndView();
		for(Emp2 e:emp2Service.getAll()){
			System.out.println(e.dept2.getDname());
		}
		modelAndView.addObject("emp2",emp2Service.getAll());
		modelAndView.setViewName("emp2");
		
		return modelAndView;
	}
}
