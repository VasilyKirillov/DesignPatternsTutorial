
package structural.adapter;


public class EmployeeAdapter implements Employee{
    
    private EmployeeLdap instance;

    public EmployeeAdapter(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
         return instance.getGivenName();
         
    }

    @Override
    public String getLastName() {
         return instance.getSurname();
    }

    @Override
    public String getEmail() {
         return instance.getMail();
    }
    
    // none adapter method
    @Override
    public String toString() {
        return "EmployeeDB{" + "id=" + getId() + ", firstName=" + getFirstName() + ", lastname=" + getLastName() + ", email=" + getEmail() + '}';
    }
    
}
