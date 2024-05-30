package com.movie.management.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.management.system.entities.Admin;
import com.movie.management.system.repository.UserRepository;


@Service
public class UserService {

	
	@Autowired
    private UserRepository userRepository; // Injecting MovieRepository dependency
    public List<Admin> getAllMovies() {
		try {
			List<Admin> result = userRepository.findAll();
			System.out.println(result);
			return userRepository.findAll();
		} catch (Exception e) {

			throw new RuntimeException("Failed to fetch movies", e);
		}
	}
}
