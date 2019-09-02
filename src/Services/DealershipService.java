package Services;

import Impl.Audi;
import Impl.BMW;
import Impl.Scoda;
import Interface.Vehicle;
import model.Customer;
import model.Employee;

public class DealershipService {

    Customer buyingCustomer;
    Employee sellingEmployee;

    Audi audi;
    BMW bmw;
    Scoda scoda;

    public void buyCar(CustomerService customerService, EmployeeService employeeService, int customerId, int employeeid, Vehicle vehicle){

        for(Customer customer:customerService.getAllCustomer()){
            if(customer.getCustomerId()==customerId){
                buyingCustomer=customer;
            }
        }

        for(Employee employee:employeeService.getAllEmployee()){
            if(employee.getEmployeeid()==employeeid){
                sellingEmployee=employee;
            }
        }

        if(vehicle instanceof Audi){
            audi=(Audi)vehicle;
            if(buyingCustomer.getCarBuyingRange()>=audi.getCost()){
                System.out.println("Congratulations for your new Audi ..");
            }
        }

        if(vehicle instanceof BMW){
            bmw=(BMW)vehicle;
            if(buyingCustomer.getCarBuyingRange()>=bmw.getCost()){
                System.out.println("Congratulations for your new BMW ..");
            }
        }

        if(vehicle instanceof Scoda){
            scoda=(Scoda)vehicle;
            if(buyingCustomer.getCarBuyingRange()>=scoda.getCost()){
                System.out.println("Congratulations for your new Scoda ..");
            }
        }
    }

}
