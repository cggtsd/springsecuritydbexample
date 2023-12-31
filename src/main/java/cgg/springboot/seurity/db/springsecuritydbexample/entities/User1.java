package cgg.springboot.seurity.db.springsecuritydbexample.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
public class User1 {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
    private String username;
    private String password;

    @ManyToMany(cascade = CascadeType.ALL ,fetch=FetchType.EAGER)
    private Role role;


}
