package Emp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Im_attach;
import com.example.domain.Imb_main;
import com.example.repositories.Im_attachRepository;
import com.example.repositories.Imb_mainRepository;



@Service
public class Dept2Servicelmpl implements Dept2Service{
	private Dept2Repository dept2repository;

	
	@Autowired
	public void setDept2Repository(Dept2Repository dept2repository) {
		this.dept2repository = dept2repository;
	}


	@Override
	public Dept2 findByPrimaryKey(Integer deptno) {
		// TODO Auto-generated method stub
		return dept2repository.findOne(deptno);
	}


	@Override
	public Iterable<Dept2> getAll() {
		// TODO Auto-generated method stub
		return dept2repository.findAll();
	}

	

	

}
