package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaService {

	@Autowired
	JpaRepo repo;
	
	public JpaPojo inserData(JpaPojo bodydata) {
		
	return 	 repo.save(bodydata);
	}
	

	public Optional<JpaPojo> showData(JpaPojo bodydata) {
		
		return 	repo.findById(bodydata.getEmpid());
		}



	public String toDelete(JpaPojo bodydata) {

		repo.deleteById(bodydata.getEmpid());
		return "Deleted";
		
	}



}
