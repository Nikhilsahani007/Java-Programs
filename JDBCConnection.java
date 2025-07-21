import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static void main(String[] args) {
        // Database URL, Username, and Password
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";  // Change if needed
        String password = "yourpassword";  // Change your MySQL password

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Connected to the database successfully!");
            }

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }
}
