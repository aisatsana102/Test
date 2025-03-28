package org.example.test.dao;

import org.example.test.models.User;
import java.sql.*;

public class UserDAO {
    public static void createUser(User user) throws SQLException {
        String sql = "INSERT INTO users (username, password_hash, salt) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPasswordHash());
            stmt.setString(3, user.getSalt());
            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    user.setId(rs.getInt(1));
                }
            }
        }
    }

    // Add other CRUD methods as needed
}