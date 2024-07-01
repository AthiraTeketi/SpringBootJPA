package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {
//	@Autowired
//	JpaRepo repo;
	
	@Autowired
	JpaService js;
	@RequestMapping("/home")
	public String Home() {
		return " HOME";
	}

	@PostMapping("/insert")
	public JpaPojo inserRequest(@RequestBody JpaPojo bodydata)
	{
		JpaPojo data = js.inserData(bodydata);
//		return "inserted";
		return data;	
	}
	
	@GetMapping("/show")
	public Optional<JpaPojo> getRequest(@RequestParam("empid") JpaPojo bodydata ) 
	{
		Optional<JpaPojo> data=js.showData(bodydata);
		
		return data;
		
	}
	@DeleteMapping("/delete")
	public String deleteRequest(@RequestParam("empid") JpaPojo bodydata)
	{
		
		String data = js.toDelete(bodydata);
		return 	data;

		
	}
	
}
	
	


