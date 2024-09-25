package main.java.com.saltAuth.service;

import main.java.com.saltAuth.model.User;
import main.java.com.saltAuth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register new user with salted password hash
    public User registerUser(String username, String password) {
        String salt = BCrypt.gensalt();  // Generate the salt
        String passwordHash = BCrypt.hashpw(password, salt);  // Hash the password with salt

        // Create new User entity
        User user = new User(username, passwordHash, salt);
        
        // Save user in the repository
        return userRepository.save(user);
    }

    // Authenticate user during login
    public boolean loginUser(String username, String password) {
        // Find user by username
        User user = userRepository.findByUsername(username);
        if (user != null) {
            // Check if the provided password matches the hashed password in the DB
            return BCrypt.checkpw(password, user.getPasswordHash());
        }
        return false;  // User not found or password didn't match
    }
}
