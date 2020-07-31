package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Sale;

@Repository
public interface SalesRepo extends JpaRepository<Sale, Integer>{

}
