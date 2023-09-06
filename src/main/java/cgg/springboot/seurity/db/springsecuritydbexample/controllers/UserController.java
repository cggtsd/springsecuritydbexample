package cgg.springboot.seurity.db.springsecuritydbexample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cgg.springboot.seurity.db.springsecuritydbexample.entities.User1;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private cgg.springboot.seurity.db.springsecuritydbexample.services.UserService userService;

    //all users
    @GetMapping("/")
    public List<User1> getAllUsers(){
        
        return this.userService.getAllUsers();
    }

    //return single user

    @GetMapping("/{username}")
    public User1 getUser(@PathVariable String username){
   return userService.getUser(username);
    }

    //create user
    @PostMapping("/")
    public User1 addUser(@RequestBody User1 user){
        return userService.addUser(user);
    }
}
