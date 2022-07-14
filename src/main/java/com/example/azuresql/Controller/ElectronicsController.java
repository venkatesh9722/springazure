package com.example.azuresql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.azuresql.Entity.Electronics;
import com.example.azuresql.Service.ElectronicsService;

@RestController
public class ElectronicsController {

	@Autowired
	private ElectronicsService service;
	
	@PostMapping("/addelectronic")
	public Electronics addElec(@RequestBody Electronics elec)
	{
		return service.saveElec(elec);
	}
	@PostMapping("/addelectronics")
	public List<Electronics> addElecs(@RequestBody List<Electronics> elecs){
		return service.saveElecs(elecs);
	}
	@GetMapping("/electronics")
	public List<Electronics> findAllElecs(){
		return service.getElecs();
	}
}
