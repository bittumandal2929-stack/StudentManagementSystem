import java.sql.Connection;
import java.sql.DriverManager;

// Handles the database connection setup
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "ajroot";
    private static final String PASSWORD = "ajmandal64";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
