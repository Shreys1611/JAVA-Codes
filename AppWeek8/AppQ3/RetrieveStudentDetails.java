package AppWeek8.AppQ3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveStudentDetails {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "SELECT * FROM Students";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    System.out.println("Student Details:");
                    while (resultSet.next()) {
                        int studentId = resultSet.getInt("StudentID");
                        String firstName = resultSet.getString("FirstName");
                        String lastName = resultSet.getString("LastName");
                        int age = resultSet.getInt("Age");
                        String email = resultSet.getString("Email");
                        
                        System.out.println("Student ID: " + studentId);
                        System.out.println("Name: " + firstName + " " + lastName);
                        System.out.println("Age: " + age);
                        System.out.println("Email: " + email);
                        System.out.println();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
