package com.example.azuresql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.azuresql.Entity.Electronics;
import com.example.azuresql.Repository.ElectronicsRepo;

@Service
public class ElectronicsService {

	@Autowired
	private ElectronicsRepo electronicsRepo;
	
	public Electronics saveElec(Electronics electronics) {
		return electronicsRepo.save(electronics);
	}
	

	public List<Electronics> saveElecs(List<Electronics> electronics) {
		return electronicsRepo.saveAll(electronics);
	}
	
	public List<Electronics> getElecs()
	{
		return electronicsRepo.findAll();
	}
	
	public Electronics getById(int id)
	{
		return electronicsRepo.findById(id).orElse(null);
	}
}
