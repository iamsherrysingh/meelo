package com.sherry.meelo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.sherry.meelo.users.dao.UserRepository;
import com.sherry.meelo.users.model.User;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sherry.meelo"})
public class UsersApplication implements CommandLineRunner{

	@Autowired
	UserRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}
	@Override
	  public void run(String... args) throws Exception {

	    repository.deleteAll();
		
		// save a couple of customers repository.save(new User("Alice", "Smith"));
		repository.save(new User("raman07", "pass01", "Raman Singh", "Etobicoke, ON"));
		repository.save(new User("iamsherrysingh", "pass@123", "Sehajpreet Singh", "Toronto, ON"));
		repository.save(new User("kammu13", "pswd12@", "Gurkarman Singh", "Moga, PB"));
		  
		// fetch all customers System.out.println("Customers found with findAll():");
		System.out.println("Customer found with findAll():");
		System.out.println("-------------------------------");
		repository.findAll().stream().forEach(System.out::println);
		System.out.println();
		  
		// fetch an individual customer
		System.out.println("Customer found with findByUserName('iamsherrysingh'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByUserName("iamsherrysingh"));
		 
	}
}
