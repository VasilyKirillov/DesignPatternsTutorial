package structural.bridge;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BridgeEverydayDemo {
    
    private static final Logger LOGGER = Logger.getLogger(BridgeEverydayDemo.class.getName());
    
    public static void main(String[] args){
        try {
            DriverManager.registerDriver(new  org.apache.derby.jdbc.EmbeddedDriver());
            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
            Connection connection = DriverManager.getConnection(dbUrl);
            Statement statement = connection.createStatement();
            
            //client is an abstraction and can work with any database that has a driver
            statement.execute("CREATE TABLE address (ID INT, StreetName VARCHAR(30),City VARCHAR(30))");
            System.out.println("table created");
            
            
            
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "SQLException", ex);
        }
        
    }
}
