package unlikedout.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionConfig {

    private static final String
            url = "jdbc:mysql://localhost:3307/unlikedout",
            user = "unlikedout",
            password = "unlikedout";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

}
