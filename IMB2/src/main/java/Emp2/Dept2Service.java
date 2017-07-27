package Emp2;

import com.example.domain.Im_attach;
import com.example.domain.Imb_main;


public interface Dept2Service {
	
	
	  Dept2 findByPrimaryKey(Integer deptno);
      Iterable<Dept2> getAll();
}
