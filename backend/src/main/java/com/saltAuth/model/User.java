package main.java.com.saltAuth.model;

import javax.persistence.*;

@Entity
@Table(name = "users")  // This will define the name of the table in the database
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)  // Ensure the username is unique and not null
    private String username;

    @Column(nullable = false)  // Ensure the password hash is not null
    private String passwordHash;

    @Column(nullable = false)  // Ensure the salt is not null
    private String salt;

    // Default constructor for JPA
    public User() {
    }

    // Constructor to initialize User object
    public User(String username, String passwordHash, String salt) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}


