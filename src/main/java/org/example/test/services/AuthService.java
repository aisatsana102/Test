package org.example.test.services;

import org.example.test.dao.UserDAO;
import org.example.test.models.User;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class AuthService {
    public User registerUser(String username, String password) throws Exception {
        String salt = BCrypt.gensalt();
        String hashedPassword = BCrypt.hashpw(password, salt);

        User newUser = new User(username, hashedPassword, salt);
        UserDAO.createUser(newUser);
        return newUser;
    }

    // Add login verification methods
}