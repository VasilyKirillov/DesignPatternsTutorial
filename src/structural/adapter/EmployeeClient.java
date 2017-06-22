package structural.adapter;

import java.util.ArrayList;
import java.util.List;

class EmployeeClient {
    public List<Employee> getEmployeeList() {
        
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1331", "Walt", "Disney", "walt@disney.com");
        employees.add(employeeFromDB);
        
        EmployeeLdap howard = new EmployeeLdap("777", "Howard", "Hues", "govard.hues@mail.com");
        employees.add(new EmployeeAdapter(howard));
        
        
        EmployeeCSV marilyn = new EmployeeCSV("1926,Marilyn,Monroe,marilyn.monroe@gmail.com");
        employees.add(new EmployeeAdapterCSV(marilyn));
        return employees;
    }
}
