package com.example.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import oracle.sql.CLOB;
import oracle.sql.DATE;

@Entity
public class Imb_main {
	String  FLOW_CODE           ;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String  FLOW_NUM            ;
	String  EMPNO_APP           ;
	String  EMPNO               ;
	String  DEPT_NO             ;
	String  STATUS              ;
	
	String  WORK_AREA_ID        ;
	String  SUBJECT             ;

	String  ATTACH              ;
	String  FLOOR               ;
	String  IP                  ;
	String  MARK                ;
	String  TOP                 ;

	String  SUBJECT_E           ;
	
	
	@Column(name="DESCRIPTION", columnDefinition="CLOB NOT NULL") 
	@Lob 
	String DESCRIPTION	;
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public String getFLOW_CODE() {
		return FLOW_CODE;
	}
	public void setFLOW_CODE(String fLOW_CODE) {
		FLOW_CODE = fLOW_CODE;
	}
	public String getFLOW_NUM() {
		return FLOW_NUM;
	}
	public void setFLOW_NUM(String fLOW_NUM) {
		FLOW_NUM = fLOW_NUM;
	}
	public String getEMPNO_APP() {
		return EMPNO_APP;
	}
	public void setEMPNO_APP(String eMPNO_APP) {
		EMPNO_APP = eMPNO_APP;
	}
	public String getEMPNO() {
		return EMPNO;
	}
	public void setEMPNO(String eMPNO) {
		EMPNO = eMPNO;
	}
	public String getDEPT_NO() {
		return DEPT_NO;
	}
	public void setDEPT_NO(String dEPT_NO) {
		DEPT_NO = dEPT_NO;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getWORK_AREA_ID() {
		return WORK_AREA_ID;
	}
	public void setWORK_AREA_ID(String wORK_AREA_ID) {
		WORK_AREA_ID = wORK_AREA_ID;
	}
	public String getSUBJECT() {
		return SUBJECT;
	}
	public void setSUBJECT(String sUBJECT) {
		SUBJECT = sUBJECT;
	}

	public String getATTACH() {
		return ATTACH;
	}
	public void setATTACH(String aTTACH) {
		ATTACH = aTTACH;
	}
	public String getFLOOR() {
		return FLOOR;
	}
	public void setFLOOR(String fLOOR) {
		FLOOR = fLOOR;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getMARK() {
		return MARK;
	}
	public void setMARK(String mARK) {
		MARK = mARK;
	}
	public String getTOP() {
		return TOP;
	}
	public void setTOP(String tOP) {
		TOP = tOP;
	}

	public String getSUBJECT_E() {
		return SUBJECT_E;
	}
	public void setSUBJECT_E(String sUBJECT_E) {
		SUBJECT_E = sUBJECT_E;
	}


}
