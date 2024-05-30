package com.movie.management.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.movie.management.system.entities.Admin;
import com.movie.management.system.service.AdminService;
import com.movie.management.system.service.UserService;


@RestController
@RequestMapping("/user/api/movies")
@CrossOrigin(origins = "http://localhost:8080/", maxAge = 3600) // Allow requests from http://example.com with a max age of 1 hour
public class UserController {

    @Autowired
    private UserService userService; // Creates an object of MovieService class with reference variable


    // Get all movies
    @GetMapping
    public ResponseEntity<List<Admin>> getAllMovies() {
        try {
            List<Admin> movies = userService.getAllMovies(); // Calls the getAllMovies() method of MovieService to retrieve all movies
            return new ResponseEntity<>(movies, HttpStatus.OK); // Returns a ResponseEntity with the movies and status OK (200)
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Returns a ResponseEntity with status INTERNAL_SERVER_ERROR (500) if an exception occurs
        }
    }
    
}
