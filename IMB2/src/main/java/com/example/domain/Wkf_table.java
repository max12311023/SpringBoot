package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wkf_table {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String DBF_NO;
	String DBF_NAME;
	
	public String getDBF_NO() {
		return DBF_NO;
	}
	public void setDBF_NO(String dBF_NO) {
		DBF_NO = dBF_NO;
	}
	public String getDBF_NAME() {
		return DBF_NAME;
	}
	public void setDBF_NAME(String dBF_NAME) {
		DBF_NAME = dBF_NAME;
	}
	

}
