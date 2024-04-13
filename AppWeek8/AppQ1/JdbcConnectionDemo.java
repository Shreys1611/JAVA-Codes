package AppWeek8.AppQ1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionDemo {
    public static void main(String[] args) {
        // Database URL, username, and password
        String dbUrl = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        // JDBC connection object
        Connection connection = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            connection = DriverManager.getConnection(dbUrl, username, password);

            if (connection != null) {
                System.out.println("Connected to the database.");
                // You can perform database operations here
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection error.");
            e.printStackTrace();
        } finally {
            // Close the database connection (if open)
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}