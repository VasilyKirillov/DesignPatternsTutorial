package structural.adapter;

public class EmployeeDB implements Employee {

    private String id;
    private String firstName;
    private String lastname;
    private String email;

    public EmployeeDB(String id, String firstName, String lastname, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
    }

    public EmployeeDB() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastname;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EmployeeDB{" + "id=" + getId() + ", firstName=" + getFirstName() + ", lastname=" + getLastName() + ", email=" + getEmail() + '}';
    }

}
