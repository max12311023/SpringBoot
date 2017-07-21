package com.example.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Im_attach {
	String FLOW_NUM;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String FILE_ID;
	String FILE_NAME;
	
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "FILE_DATA")
	byte[] FILE_DATA;

	public String getFLOW_NUM() {
		return FLOW_NUM;
	}

	public void setFLOW_NUM(String fLOW_NUM) {
		FLOW_NUM = fLOW_NUM;
	}

	public String getFILE_ID() {
		return FILE_ID;
	}

	public void setFILE_ID(String fILE_ID) {
		FILE_ID = fILE_ID;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public void setFILE_NAME(String fILE_NAME) {
		FILE_NAME = fILE_NAME;
	}

	public byte[] getFILE_DATA() {
		return FILE_DATA;
	}

	public void setFILE_DATA(byte[] fILE_DATA) {
		FILE_DATA = fILE_DATA;
	}
}
