package structural.facade.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    private DbSingleton instance = null;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(30), City VARCHAR(30))");
            statement.close();
            connection.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO Address(ID, StreetName,City) VALUES (1,'22b BakerStreet', 'London')");
            statement.close();
            connection.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddress() {
        List<Address> addresses = new ArrayList<>();
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM Address");

            while (results.next()) {
                addresses.add(new Address(results.getString(1), results.getString(2), results.getString(3)));
            }
            results.close();
            statement.close();
            connection.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return addresses;
    }

    class Address {
        String id;
        String streetName;
        String city;
        public Address(String id, String streetName, String city) {
            this.id = id;
            this.streetName = streetName;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{" + "id=" + id + ", streetName=" + streetName + ", city=" + city + '}';
        }
    }
}
