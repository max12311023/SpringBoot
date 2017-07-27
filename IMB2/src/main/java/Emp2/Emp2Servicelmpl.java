package Emp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Im_attach;
import com.example.domain.Imb_main;
import com.example.repositories.Im_attachRepository;
import com.example.repositories.Imb_mainRepository;



@Service
public class Emp2Servicelmpl implements Emp2Service{
	private Emp2Repository emp2repository;

	
	@Autowired
	public void setEmp2Repository(Emp2Repository emp2repository) {
		this.emp2repository = emp2repository;
	}


	@Override
	public Emp2 findByPrimaryKey(Integer empno) {
		// TODO Auto-generated method stub
		return emp2repository.findOne(empno);
	}


	@Override
	public Iterable<Emp2> getAll() {
		// TODO Auto-generated method stub
		return emp2repository.findAll();
	}


	
	

	

}
