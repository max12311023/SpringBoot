package com.example.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.domain.Imb_main;
import com.example.repositories.Imb_mainRepository;



@Service
public class Imb_mainServicelmpl implements Imb_mainService{
	private Imb_mainRepository imb_mainrepository;
	private final String FETCH_SQL_BY_ID = "select fc_get_emp_info(empno_app,'1') as EMPNO  from Imb_main where flow_num = ?";
	private final String GET_ALL = "select decode(TOP,'1','[置頂]','')||SUBJECT SUBJECT,FLOW_NUM,'' as DATAVIEW_ROW_STATUS ,fc_get_emp_info(empno_app,'1') as EMPNO from imb_main where  mark ='3' AND status='Z' AND (((start_show_time > sysdate-7) AND (end_date_time >= sysdate))  OR top is not null)  order by req_date desc";
	@Autowired
    private JdbcTemplate jdbcTemplate;


	@Autowired
	public void setImb_mainRepository(Imb_mainRepository imb_mainrepository) {
		this.imb_mainrepository = imb_mainrepository;
	}

	@Override
	public Iterable<Imb_main> listAllImb_main() {
		// TODO Auto-generated method stub
		return imb_mainrepository.findImb_mainAll();
	}

	@Override
	public Imb_main getImb_mainById(String id) {
		
		return imb_mainrepository.findOne(id);
	}

	@Override
	public Imb_main saveImb_main(Imb_main imb_main) {
		// TODO Auto-generated method stub
		return imb_mainrepository.save(imb_main);
	}


	@Override
	public void deleteImb_main(String id) {
		Imb_main i =new Imb_main();
		i.setFLOW_CODE(id);
		imb_mainrepository.delete(i);
		
	}

	@Override
	public Imb_main getEmp(String id) {
		
		// TODO Auto-generated method stub
		
		return (Imb_main) jdbcTemplate.queryForObject(FETCH_SQL_BY_ID, new Object[] { id }, new Imb_mainMapper());
	}

	@Override
	public List<Imb_main> getAll() {
		
		// TODO Auto-generated method stub
		//BeanPropertyRowMapper 自動對應 但查詢欄位要與類別同名
		return jdbcTemplate.query(GET_ALL, new BeanPropertyRowMapper<Imb_main>(Imb_main.class));
	}

	

}
//手動綁訂類別
class Imb_mainMapper implements RowMapper {

	@Override
	public Imb_main mapRow(ResultSet rs, int rowNum) throws SQLException {
		Imb_main i = new Imb_main();	
		i.setEMPNO(rs.getString("EMPNO"));		
		return i;
	}

}
