
import java.sql.*;
import javax.swing.JOptionPane;

public class Javaconnect {
    Connection conn;
    public static Connection connectdb() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/superone";
            String username = "root";
            String password = null;
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
