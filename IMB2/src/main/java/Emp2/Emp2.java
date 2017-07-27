package Emp2;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Emp2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empno;
	private String ename;
	private String job;
	private Date hiredate;
	private Double sal;
	private Double comm;
	
//	private Integer deptno;
	/**
     * 多對一 生成外鍵sample_id
     */
    @ManyToOne
    @JoinColumn(name="deptno", nullable = false)
    @JsonBackReference
    public Dept2 dept2;

	public Dept2 getDept2() {
		return dept2;
	}
	public void setDept2(Dept2 dept2) {
		this.dept2 = dept2;
	}

    
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
//	public Integer getDeptno() {
//		return deptno;
//	}
//	public void setDeptno(Integer deptno) {
//		this.deptno = deptno;
//	}
}
