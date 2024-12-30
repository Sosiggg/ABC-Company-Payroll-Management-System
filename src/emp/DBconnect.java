package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBconnect {
    public static Connection connect() {
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            String jdbcURL = "jdbc:postgresql://localhost:5432/payrollSystem";
            String username = "postgres";
            String password = "admin";

            conn = DriverManager.getConnection(jdbcURL, username, password);
            
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return conn;
        }
    }
}
