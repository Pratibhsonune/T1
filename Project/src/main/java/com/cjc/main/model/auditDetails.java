package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class auditDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int auditId;
	private String auditName;
	private String auditAddress;
	private long auditMobNo;
	public int getAuditId() {
		return auditId;
	}
	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}
	public String getAuditName() {
		return auditName;
	}
	public void setAuditName(String auditName) {
		this.auditName = auditName;
	}
	public String getAuditAddress() {
		return auditAddress;
	}
	public void setAuditAddress(String auditAddress) {
		this.auditAddress = auditAddress;
	}
	public long getAuditMobNo() {
		return auditMobNo;
	}
	public void setAuditMobNo(long auditMobNo) {
		this.auditMobNo = auditMobNo;
	}
	
	
	

}
