package structural.adapter;

import java.util.List;

/**
 * Adapter Design Pattern Demonstration
 * @author Vasilii_Kirillov
 */
public class AdapterDemo {
    
    public static void main(String[] args){
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        
        System.out.println(employees);
    }
}
