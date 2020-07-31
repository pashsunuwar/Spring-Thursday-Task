package com.example.demo.Controller;



import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Sale;
import com.example.demo.Services.SalesService;


@CrossOrigin
@RestController
public class MyController {
	
	//constructor method
	SalesService service;
	public MyController(SalesService service) {
		this.service=service;
	}
	//show all
	@GetMapping("/showall")
	public List<Sale> showall() {
		return service.viewallRecords();
	}
	
	//create record 
	@PostMapping("/create/")
	public Sale addRecord(@RequestBody Sale sale) {
		return service.addRecord(sale);
	}
	
	@PostMapping("/create/{pid}/{name}/{quantity}/{price}")
	public String savedRecord(@PathVariable("pid")int pid, 
			@PathVariable("name") String name, 
			@PathVariable("quantity")int quantity,
			@PathVariable("price") double price) {
		
		service.createrecord(pid, name, quantity, price);
		return "record added";
	}
	
//	//create record hardcoded
//	@PostMapping("/create/chai")
//	public String createhardcodedRecord(@RequestBody Sale tea) {
//		service.storehardcodedsale();
//		return "You did it! here have some chai";
//	}
	
	//delete record by id
	@DeleteMapping("/deleterecord/{id}")
	public String deleterecord(@PathVariable("id")int id) {
		String msg=service.deleteRecord(id);
		return msg;
	}
	
}
