package cgg.springboot.seurity.db.springsecuritydbexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.springboot.seurity.db.springsecuritydbexample.entities.User1;



public interface UserRepo  extends JpaRepository<User1,Integer>{
    User1 findByUsername(String username);
}
