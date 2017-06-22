
package structural.facade.jdbc;

import java.util.List;
import structural.facade.jdbc.JdbcFacade.Address;

public class FacadeJdbcDemo {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        System.out.println("table created");
        jdbcFacade.insertIntoTable();
        System.out.println("Record inserted");
        
        List<Address> addresses = jdbcFacade.getAddress();
        for (Address address: addresses){
            System.out.println(address);
        }
    }
}
