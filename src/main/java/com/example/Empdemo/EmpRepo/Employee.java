package com.example.Empdemo.EmpRepo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="employee")

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
        private Integer id;
    
    @Column(name="name")
    private String Name;
   

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	public Integer getId()
	{
		return id;
	}

	@Column(name="address")
    private String Address;
    
   
}


