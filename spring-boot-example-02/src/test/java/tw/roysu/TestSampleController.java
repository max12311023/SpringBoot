package tw.roysu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PeopleController.class)
@WebAppConfiguration
public class TestSampleController {

    @Autowired
    private PeopleController peopleController;

    @Test
    public void testAdd() {
        assertEquals("{\"status\": \"success\"}", peopleController.addBean("Roy", 25));
    }

    @Test
    public void testClean() {
        assertEquals("{\"status\": \"success\"}", peopleController.cleanList());
    }

}
