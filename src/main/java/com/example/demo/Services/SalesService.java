package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Sale;
import com.example.demo.Repository.SalesRepo;

@Service
public class SalesService {
	
	@Autowired
	SalesRepo salesrepo;

//	public void storehardcodedsale() {
//		Sale tea =new Sale(); 
//		
//		tea.setProduct_name("Chai");
////		tea.setDescription("Finest tea from the hills of Ionia. Grown by a family run tea company. "
////				+ "Our teas are picked from mid April when we have our top quality first flush teas throughout the year until November. "
////				+ "The characteristics of our teas are bringht with a refreshing unique flavour.");
//		tea.setQuantity(3);
//		tea.setPrice(2.5);
////		S.getNetamount(S.getPrice() * S.getQuantity());
//		
//		salesrepo.save(tea);
//	}
	

			
	public void createrecord(int pid, String name, int quantity, double price) {
		
		Sale s = new Sale();
		
		s.setPid(pid);
		s.setProduct_name(name);
		s.setQuantity(quantity);
		s.setPrice(price);
		
		salesrepo.save(s);
	}

	public List<Sale> viewallRecords() {
		
		List<Sale> records = salesrepo.findAll();
		return records;
	}
	
	
	public String deleteRecord(int id) {
			String msg= "";
		Optional<Sale> record=salesrepo.findById(id);
		if (record.isPresent()) {
			salesrepo.deleteById(id);
			msg= " Record Deleted ";
		}else {
			msg = " myfriends id " + id + " doesnt exist ";
		}
		return msg;
	}
	
	public Sale addRecord(Sale sale) {
		return salesrepo.save(sale);
	}
	
	
}
