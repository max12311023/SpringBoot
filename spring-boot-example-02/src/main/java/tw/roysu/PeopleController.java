package tw.roysu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PeopleController {
    
    private List<People> peopleList = new ArrayList<>();
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    Object[] listBean() {
        return peopleList.toArray();
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    ResponseObj addBean(
            @RequestParam(value="name", defaultValue="Roy") String name,
            @RequestParam(value="age", defaultValue="25") int age) {
        People people = new People(name, age);
        peopleList.add(people);
        return new ResponseObj("success");
    }
    
    @RequestMapping(value = "/clean", method = RequestMethod.GET)
    @ResponseBody
    ResponseObj cleanList() {
        peopleList = new ArrayList<>();
        return new ResponseObj("success");
    }

}
