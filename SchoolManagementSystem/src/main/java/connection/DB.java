/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DB {
    
    
      private static Connection connection;

      private static DB getobj(){
      DB obj = new DB();
      return obj;
      }
    // Single method to get DB connection
    public static Connection getConnection() {
        if (connection == null) {
            synchronized (DB.class) {
                if (connection == null) {
                    try {
                        // JDBC URL, username, password
                        String url = "jdbc:mysql://localhost:3306/School_Management_System"; // Change to your DB details
                        String user = "root"; // Database username
                        String password = ""; // Database password

                        // Establish the connection
                        connection = DriverManager.getConnection(url, user, password);
                    } catch (SQLException e) {
                        e.printStackTrace();  // Print any error if connection fails
                    }
                }
            }
        }
        return connection;
    }

    public Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
