package AppWeek8.AppQ5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecords {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String tableName = "your_table_name"; // Replace with the actual table name
            String insertQuery = "INSERT INTO " + tableName + " (column1, column2, column3) VALUES (?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                // Set values for the INSERT statement
                preparedStatement.setString(1, "Value1");
                preparedStatement.setInt(2, 42);
                preparedStatement.setString(3, "Value3");

                // Execute the INSERT statement
                int rowsInserted = preparedStatement.executeUpdate();

                if (rowsInserted > 0) {
                    System.out.println("Record inserted successfully.");
                } else {
                    System.out.println("Record insertion failed.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
