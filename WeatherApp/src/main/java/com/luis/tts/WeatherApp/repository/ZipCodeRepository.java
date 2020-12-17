package com.luis.tts.WeatherApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luis.tts.WeatherApp.model.ZipCode;



@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {
   
	public List<ZipCode> findAllByOrderByCreatedAtDesc();
	
	public List<ZipCode> findAll();
}
