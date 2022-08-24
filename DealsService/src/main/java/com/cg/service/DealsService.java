package com.cg.service;

import java.util.List;



import com.cg.exception.DealsAlreadyExistsException;
import com.cg.exception.DealsIdNotFound;
import com.cg.exception.NameNotFoundException;
import com.cg.model.Deals;

public interface DealsService {

  public Deals addDeals(Deals deal)throws DealsAlreadyExistsException;
	public List<Deals> getAllDeals() ;
	public Deals getDealsDataByname(String dname)throws NameNotFoundException ;
	public Deals getDealsDataById(int dealno)throws DealsIdNotFound;
	public Deals updateDeals(Deals deals);
	public void deleteDealBydealno(int dealno);
}