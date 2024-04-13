package AppWeek8.AppQ4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveTableContents {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String tableName = "your_table_name"; // Replace with the actual table name
            String query = "SELECT * FROM " + tableName;

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    int columnCount = resultSet.getMetaData().getColumnCount();

                    // Print column headers
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(resultSet.getMetaData().getColumnName(i) + "\t");
                    }
                    System.out.println();

                    // Print table data
                    while (resultSet.next()) {
                        for (int i = 1; i <= columnCount; i++) {
                            System.out.print(resultSet.getString(i) + "\t");
                        }
                        System.out.println();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
