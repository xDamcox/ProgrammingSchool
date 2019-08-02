package pl.xdamcox.progschool.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static final String DB_URL = "jdbc:mysql://localhost:3306/programming_school";
    public static final String DB_PROPERTIES = "?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "coderslab";

    public static Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL + DB_PROPERTIES, DB_USER, DB_PASSWORD);
        return connection;
    }
}
