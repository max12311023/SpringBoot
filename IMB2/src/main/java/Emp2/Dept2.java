package Emp2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dept2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer deptno;
	private String dname;
	private String loc;
	
//	 @OneToMany(mappedBy = "dept2")
//	 public List<Emp2> emp2s;
//	
//	public List<Emp2> getEmp2s() {
//		return emp2s;
//	}
//	public void setEmp2s(List<Emp2> emp2s) {
//		this.emp2s = emp2s;
//	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
