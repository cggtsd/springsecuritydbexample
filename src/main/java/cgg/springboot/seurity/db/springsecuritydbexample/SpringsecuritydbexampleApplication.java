package cgg.springboot.seurity.db.springsecuritydbexample;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import cgg.springboot.seurity.db.springsecuritydbexample.dao.UserRepo;
import cgg.springboot.seurity.db.springsecuritydbexample.entities.Role;
import cgg.springboot.seurity.db.springsecuritydbexample.entities.User1;

@SpringBootApplication
public class SpringsecuritydbexampleApplication implements CommandLineRunner{

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritydbexampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User1 user =new User1();
		user.setUsername("abc");
		user.setPassword(bCryptPasswordEncoder.encode("abc"));
		user.setRole(new Role(1,"ROLE_NORAML"));

		userRepo.save(user);

		User1 user1 =new User1();
		user1.setUsername("xyz");
		user1.setPassword(bCryptPasswordEncoder.encode("xyz"));
		user1.setRole(new Role(1,"ROLE_ADMIN"));

		userRepo.save(user1);
	}

}
