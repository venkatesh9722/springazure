package com.example.azuresql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.azuresql.Entity.Electronics;

public interface ElectronicsRepo extends JpaRepository<Electronics, Integer>{

}
