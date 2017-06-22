package structural.facade.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        
        try{
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            int count = statement.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(30), City VARCHAR(30))");
            
            System.out.println("Table created");
            statement.close();
            
            statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO Address(ID, StreetName,City) VALUES (1,'22b BakerStreet', 'London')");
            System.out.println(count + "record(s) created");
            statement.close();
            
            statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM Address");
            
            while(results.next()){
                System.out.println(results.getString(1) + " " + results.getString(2) + " " + results.getString(3));
            }
            results.close();
            statement.close();
            connection.close();
        } catch (SQLException se){
            System.out.println(se.getMessage());
        }
    }
}
