package com.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
