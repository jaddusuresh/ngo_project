package com.Suresh.jnitngomanagement.controller;

import com.Suresh.jnitngomanagement.Model.Donar;
import com.Suresh.jnitngomanagement.repository.DonarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DonorController {
    @Autowired
    private DonarRepository donarRepository;

    @PostMapping("/donor")
    Donar newDonar(@RequestBody Donar newDonar) {
        return donarRepository.save(newDonar);
    }

    @GetMapping("/list")
    List<Donar> getAllUsers() {

        return donarRepository.findAll();
    }
}
