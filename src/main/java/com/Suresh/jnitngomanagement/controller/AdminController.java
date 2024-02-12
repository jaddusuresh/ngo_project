package com.Suresh.jnitngomanagement.controller;

import com.Suresh.jnitngomanagement.Model.Admin;
import com.Suresh.jnitngomanagement.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/Admin")
    Admin newAdmin(@RequestBody Admin newAdmin){

        return  adminRepository.save(newAdmin);
    }
    @GetMapping("/Users")
    List<Admin> getAllUsers(){

        return adminRepository.findAll();
    }

}
