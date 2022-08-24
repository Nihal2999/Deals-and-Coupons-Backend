package com.cg.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.DealsAlreadyExistsException;
import com.cg.exception.DealsIdNotFound;
import com.cg.exception.NameNotFoundException;
import com.cg.model.Deals;

import com.cg.service.DealsService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/d2")
public class DealsServiceController {
	@Autowired
	private DealsService dealServ;

	@Autowired
	public DealsServiceController(DealsService dealServ) {
		this.dealServ = dealServ;
	}
	
	//get all deals
	@GetMapping("/getdeals")
	public ResponseEntity<List<Deals>> getAllDeals(){
        return new ResponseEntity<List<Deals>>((List<Deals>)dealServ.getAllDeals(),HttpStatus.OK);
    }
	
	//get deal by deal id
	@GetMapping("/getdealid/{id}")
	public ResponseEntity < Deals > getDealsDataById(@PathVariable int id) throws DealsIdNotFound {
		return ResponseEntity.ok().body(dealServ.getDealsDataById(id));
	}
	
	//get deal by deal name	
	@GetMapping("/getdeals/{dname}")
	public ResponseEntity < Deals > getDealsDataByname(@PathVariable String dname) throws NameNotFoundException {
		return ResponseEntity.ok().body(dealServ.getDealsDataByname(dname));
	}
	
}
