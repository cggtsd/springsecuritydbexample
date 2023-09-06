package cgg.springboot.seurity.db.springsecuritydbexample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cgg.springboot.seurity.db.springsecuritydbexample.dao.UserRepo;
import cgg.springboot.seurity.db.springsecuritydbexample.entities.CustomUserDetails;
import cgg.springboot.seurity.db.springsecuritydbexample.entities.User1;

@Service
public class CustomUserDetailsService  implements UserDetailsService{

    @Autowired
    private UserRepo userRepo;
   
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User1 user=userRepo.findByUsername(username);

        if(user==null){
            throw new UsernameNotFoundException("No User");
        }

        return new CustomUserDetails(user);

    }
    
}
