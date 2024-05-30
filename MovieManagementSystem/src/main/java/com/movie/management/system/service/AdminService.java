package com.movie.management.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.movie.management.system.entities.Admin;
import com.movie.management.system.repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository; // Injecting MovieRepository dependency
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


 // Convert the object to a JSON string
    ObjectMapper objectMapper = new ObjectMapper();
    String jsonMovie;
    // Create a new movie
    public Admin saveMovie(Admin movie) {
        try {
        	System.out.println(movie);
			Admin result = adminRepository.save(movie); 
			  jsonMovie = objectMapper.writeValueAsString(result);
        	kafkaTemplate.send("movie-update-topic",  jsonMovie);
            return result; // Save the new movie to the database
        } catch (Exception e) {
            // Handle error: Log exception or throw custom exception
            throw new RuntimeException("Failed to save movie", e);
        }
    }

   
}
