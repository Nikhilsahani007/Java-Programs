import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Change database name if needed
        String user = "root"; // Your MySQL username
        String password = "yourpassword"; // Your MySQL password

        try {
            // Load the JDBC Driver (not required in JDBC 4.0+ but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("✅ Connected to MySQL successfully!");
            }

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ Database connection error: " + e.getMessage());
        }
    }
}
