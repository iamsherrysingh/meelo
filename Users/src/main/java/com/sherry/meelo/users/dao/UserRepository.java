package com.sherry.meelo.users.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sherry.meelo.users.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

  public User findByUserName(String userName);

}