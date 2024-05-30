package com.movie.management.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.movie.management.system.entities.Admin;
import com.movie.management.system.service.AdminService;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "http://localhost:8080/", maxAge = 3600) // Allow requests from http://example.com with a max age of 1 hour
public class AdminController {

    @Autowired
    private AdminService adminService; // Creates an object of MovieService class with reference variable


    // Create a new movie
    @PostMapping
    public ResponseEntity<Admin> saveMovie(@RequestBody Admin movie) {
        try {
            Admin savedMovie = adminService.saveMovie(movie); // Calls the saveMovie() method of MovieService to save a new movie
            return new ResponseEntity<>(savedMovie, HttpStatus.CREATED); // Returns a ResponseEntity with the saved movie and status CREATED (201)
        } catch (Exception e) {
        	System.out.println(e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Returns a ResponseEntity with status INTERNAL_SERVER_ERROR (500) if an exception occurs
        }
    }
    
}
