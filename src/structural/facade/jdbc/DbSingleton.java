package structural.facade.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DbSingleton {

    private static DbSingleton instance;

    private DbSingleton() {
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            instance = new DbSingleton();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
        Connection connection = DriverManager.getConnection(dbUrl);
//        System.out.println("connection: " + connection);
        return connection;
    }
    public static void main(String[] args) throws SQLException {
        new DbSingleton().getConnection();
    }
}
