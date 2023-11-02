package com.cjc.main.model.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.auditDetails;
import com.cjc.main.model.servicei.HomeService;

@CrossOrigin("*")
@RestController
public class HomeController 
{
	@Autowired
	HomeService hsi;
	
	
	@PostMapping("/saveData")
	public auditDetails saveAudit(@RequestBody auditDetails ad)
	{
		System.out.println("Save New Data");
		hsi.saveData(ad);
		return ad;	
	}
	
	//GetAllData
	@GetMapping("/getAllData")
	public Iterable getAllData()
	{
		System.out.println("Display All Data");
		Iterable list=hsi.displayAllData();
		return list;
	
	}

	@GetMapping("/getSingelData/{auditId}")
	public auditDetails getSingleData(@PathVariable("auditId") int auditId)
	{
		System.out.println("Display Single Data");
		auditDetails a=hsi.displaysingleData(auditId);
		return a;
		
	}
	
	@PostMapping("/addNewData")
	public auditDetails addNewData(@RequestBody auditDetails aa)
	{
		System.out.println("Enter New Data");
		hsi.saveData(aa);
		return aa;
	}
	
	@PutMapping("/update/{auditId}")
	public auditDetails  update(@PathVariable ("auditId") int auditId,@RequestBody auditDetails a)
	{ 
		System.out.println("Update Data"+auditId);
		System.out.println("Recived Data"+a.getAuditId());
	hsi.saveData(a);
	return a;
		
	}
	
	@DeleteMapping("/delete/{auditId}")
	public String delete(@PathVariable("auditId") int auditId)
	{
		System.out.println("Delete data");
		hsi.deleteData(auditId);
		return "Data Delete SuccessFully";
		
	}

	
	
	
	

}
