package Emp2;

import com.example.domain.Im_attach;
import com.example.domain.Imb_main;


public interface Emp2Service {


	Emp2 findByPrimaryKey(Integer empno);
	Iterable<Emp2> getAll();
}
