package com.cjc.main.model.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.auditDetails;
import com.cjc.main.model.Repository.HomeRepository;
import com.cjc.main.model.servicei.HomeService;

@Service
public class HomeServiceimpl implements HomeService
{
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(auditDetails aud) 
	{
		auditDetails details=hr.save(aud);
	
	}

	@Override
	public Iterable displayAllData() 
	{
		return hr.findAll();
		 
	}

	@Override
	public auditDetails displaysingleData(int auditId) 
	{
	return	hr.findAllByauditId(auditId);

	}

	@Override
	public String deleteData(int auditId) 
	{
	hr.deleteById(auditId);
		return "data Delete";
	}

	

}
