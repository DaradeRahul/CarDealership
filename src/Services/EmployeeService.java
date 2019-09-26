package Services;

import model.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeService {
    public List<Employee> employeeList = new ArrayList<Employee>();

    public void addEmployee(Employee employee){
        this.employeeList.add(employee);
    }

    public void displayEmployee(){
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    public void deleteEmployee(int id){
        Iterator<Employee> iterator = employeeList.iterator();
        while(iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmployeeid() == id) {
                iterator.remove();
            }
        }
    }

    public List<Employee> getAllEmployee(){
        return this.employeeList;
    }
}
