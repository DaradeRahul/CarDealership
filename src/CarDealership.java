import Impl.Audi;
import Impl.BMW;
import Impl.Scoda;
import Services.CustomerService;
import Services.DealershipService;
import Services.EmployeeService;
import model.Address;
import model.Customer;
import model.Employee;

import java.util.Scanner;

public class CarDealership {
    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        EmployeeService employeeService = new EmployeeService();
        DealershipService dealershipService = new DealershipService();
        int customerId=1, employeeid=1;

        Scanner sc= new Scanner(System.in);
        int option=0;
        do{
            System.out.println("Please select the following option\n"+
                    "1. Add Customer\n"+
                    "2. Add Employee\n"+
                    "3. Buy Car\n"+
                    "4. View All Customers\n"+
                    "5. View All Employees\n"+
                    "6. Delete Customer\n"+
                    "7. Delete Employee\n"+
                    "8. Exit");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Please add details for Customer\n");
                    System.out.println("Name:");
                    String customerName = sc.next();
                    System.out.println("Please provide address details\n");
                    System.out.println("Flat Number:");
                    int flatNumber = sc.nextInt();
                    System.out.println("Building Name:");
                    String buildingName = sc.next();
                    System.out.println("City:");
                    String city = sc.next();
                    System.out.println("State:");
                    String state = sc.next();
                    Address customerAddress = new Address(flatNumber, buildingName, city, state);
                    System.out.println("Contact Number:");
                    long phoneNumber = sc.nextLong();
                    System.out.println("Age:");
                    int age = sc.nextInt();
                    System.out.println("Buying Range:");
                    long carBuyingRange = sc.nextLong();
                    Customer customer = new Customer(customerId++, customerName, customerAddress, phoneNumber, age, carBuyingRange);
                    customerService.addCustomer(customer);
                    break;
                case 2: System.out.println("Please add details for Employee\n");
                    System.out.println("Name:");
                    String name = sc.next();
                    System.out.println("Designation:");
                    String designation = sc.next();
                    System.out.println("Office Location:");
                    String location = sc.next();
                    System.out.println("Phone Number:");
                    long phone=sc.nextLong();
                    Employee employee = new Employee(employeeid++,name,designation,location,phone);
                    employeeService.addEmployee(employee);
                    break;
                case 3:
                    System.out.println("Welcome for buying new Car\nPlease provide few details\n");
                    System.out.println("Customer Number:");
                    customerId=sc.nextInt();
                    System.out.println("Employee Number:");
                    employeeid=sc.nextInt();
                    System.out.println("\nSelect Car for buying\n1. Audi\n2. BMW\n3. Scoda");
                    int selection = sc.nextInt();
                    switch (selection){
                        case 1:
                            dealershipService.buyCar(customerService,employeeService,customerId,employeeid,new Audi("A8",8000000,5));
                            break;
                        case 2: dealershipService.buyCar(customerService,employeeService,customerId,employeeid,new BMW("X5",7000000,4));
                            break;
                        case 3: dealershipService.buyCar(customerService,employeeService,customerId,employeeid,new Scoda("Superb",4000000,7));
                            break;
                        default: System.out.println("Sorry for wrong selection");
                            break;
                    }
                    break;
                case 4:
                    customerService.displayCustomer();
                    break;
                case 5: employeeService.displayEmployee();
                    break;
                case 6: System.out.println("Enter the Id to delete");
                    int custid=sc.nextInt();
                    customerService.deleteCustomer(custid);
                    System.out.println("Customer with id: "+custid+" deleted successfully");
                    break;
                case 7:System.out.println("Enter the Id to delete");
                    int empid=sc.nextInt();
                    employeeService.deleteEmployee(empid);
                    System.out.println("Employee with id: "+empid+" deleted successfully");
                    break;
                case 8: System.out.println("Exiting ...");
                    break;
                default:
                    System.out.println("Wrong Option.. Please select again");
            }
        } while(option!=8);
        sc.close();
    }
}
