package com.sherry.meelo.users.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sherry.meelo.users.model.User;

public interface UserRepository extends MongoRepository<User, String> {

  public User findByFirstName(String firstName);
  public List<User> findByLastName(String lastName);

}