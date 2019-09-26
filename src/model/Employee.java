package model;

public class Employee {
    private int employeeid;
    private String name;
    private String designation;
    private String location;
    private long phone;
    private Address empAddress;

    public Employee(int employeeid, String name, String designation, String location, long phone) {
        this.employeeid = employeeid;
        this.name = name;
        this.designation = designation;
        this.location = location;
        this.phone = phone;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\n\nEmployee Details\n===============================================\n" +
                "Employee Id:" + employeeid +
                ", Employee Name=:" + name +
                ", Designation:" + designation +
                ", Location:" + location +
                ", Phone:" + phone +
                '\n';
    }
}
