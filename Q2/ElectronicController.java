package com.prodapt.SpringBootBasics.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.SpringBootBasics.entity.Customer;
import com.prodapt.SpringBootBasics.entity.Electronic;
import com.prodapt.SpringBootBasics.repository.CustomerRepository;
import com.prodapt.SpringBootBasics.repository.ElectronicRepository;

@RestController
@CrossOrigin

public class ElectronicController {
	@RequestMapping("/Hello")
	 public String Hello() {
		return "hello";
	}
	
	
	@Autowired
	private ElectronicRepository orderRepository;
	
	 @GetMapping("/getorders")
     public List<Electronic> getAllorders(){
         return orderRepository.findAll();
     }      

     // create employee rest api
     @PostMapping("/addorders")
     public Electronic createorder(@RequestBody Electronic orders) {
         return orderRepository.save(orders);
     }
     
     // delete customer 
     @DeleteMapping("/deleteorders/{id}")
     public void deleteorder(@PathVariable("id") int id) {
     	   orderRepository.deleteById(id);
          
     }
     
     @PutMapping("/updateorders")  
     private Electronic update(@RequestBody Electronic update)   
     {   
    	 return orderRepository.save(update);  
    	 }   

}
