package com.movie.management.system.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movie.management.system.entities.Admin;

public interface AdminRepository extends MongoRepository<Admin, String> {

}
