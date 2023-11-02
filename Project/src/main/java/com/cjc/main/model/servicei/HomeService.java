package com.cjc.main.model.servicei;

import com.cjc.main.model.auditDetails;

public interface HomeService
{
	public void saveData( auditDetails aud);
	public Iterable displayAllData();
	public auditDetails displaysingleData(int auditId);
	
	public String deleteData(int auditId);
	
}
