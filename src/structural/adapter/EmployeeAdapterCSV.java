package structural.adapter;


public class EmployeeAdapterCSV implements Employee {

    
    private EmployeeCSV instance;
    
    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmail();
    }
 
    // none adapter method
    @Override
    public String toString() {
        return "EmployeeDB{" + "id=" + getId() + ", firstName=" + getFirstName() + ", lastname=" + getLastName() + ", email=" + getEmail() + '}';
    }
}
