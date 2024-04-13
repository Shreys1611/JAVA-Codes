package AppWeek8.AppQ2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AirlineReservationSystem {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.println("1. List Flights");
                System.out.println("2. Make a Reservation");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        listFlights(connection);
                        break;
                    case 2:
                        makeReservation(connection, scanner);
                        break;
                    case 3:
                        connection.close();
                        System.out.println("Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void listFlights(Connection connection) throws SQLException {
        String query = "SELECT * FROM Flights";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        
        System.out.println("Flights:");
        while (resultSet.next()) {
            System.out.println("Flight ID: " + resultSet.getInt("FlightID"));
            System.out.println("Flight Number: " + resultSet.getString("FlightNumber"));
            System.out.println("Departure City: " + resultSet.getString("DepartureCity"));
            System.out.println("Arrival City: " + resultSet.getString("ArrivalCity"));
            System.out.println("Departure Date: " + resultSet.getDate("DepartureDate"));
            System.out.println("Available Seats: " + resultSet.getInt("AvailableSeats"));
            System.out.println();
        }
        statement.close();
    }

    private static void makeReservation(Connection connection, Scanner scanner) throws SQLException {
        // Implement reservation logic here
        // Prompt the user for flight and passenger details
        // Update the Reservations and Flights tables accordingly
    }
}
