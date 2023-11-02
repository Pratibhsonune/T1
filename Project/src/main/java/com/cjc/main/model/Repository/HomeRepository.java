package com.cjc.main.model.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.auditDetails;

@Repository
public interface HomeRepository extends CrudRepository<auditDetails,Integer>
{
	public auditDetails findAllByauditId(int auditId);
}
