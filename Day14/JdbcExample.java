package com.demo.jdbc_Day14;
import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school"; // your DB URL
        String user = "root"; // your MySQL username
        String password = "1234"; // your MySQL password

        try {
            // Step 1: Load the JDBC driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Step 3: Create a Statement object
            Statement stmt = conn.createStatement();

            // Step 4: Insert data
            String insertQuery = "INSERT INTO students(name, age) VALUES('Alice', 22)";
            stmt.executeUpdate(insertQuery);
            System.out.println("Inserted student.");

            // Step 5: Read data
            String selectQuery = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(selectQuery);
            System.out.println("Students:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
            }

            // Step 6: Update data
            String updateQuery = "UPDATE students SET age = 23 WHERE name = 'Alice'";
            stmt.executeUpdate(updateQuery);
            System.out.println("Updated student age.");

            // Step 7: Delete data
            String deleteQuery = "DELETE FROM students WHERE name = 'Alice'";
            stmt.executeUpdate(deleteQuery);
            System.out.println("Deleted student.");

            // Step 8: Close connection
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

