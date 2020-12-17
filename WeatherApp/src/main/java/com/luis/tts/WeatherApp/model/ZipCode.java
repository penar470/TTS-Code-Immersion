package com.luis.tts.WeatherApp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class ZipCode {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String zipcode;

    @CreationTimestamp
    private Date createdAt;
    
    public ZipCode(String zipcode, Date createdAt) {
        this.zipcode = zipcode;
        this.createdAt = createdAt;
    }
    
    public ZipCode() {
    	
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZipCode() {
		return this.zipcode;
	}

	public void setZipCode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
}
