package Services;

import model.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerService {

    public List<Customer> customerList = new ArrayList<Customer>();

    public void addCustomer(Customer customer){
        this.customerList.add(customer);
    }

    public void displayCustomer(){
        for(Customer customer:customerList){
            System.out.println(customer);
        }
    }

    public void deleteCustomer(int id){
        Iterator<Customer> iterator = customerList.iterator();
        while(iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getCustomerId() == id) {
                iterator.remove();
            }
        }
    }

    public List<Customer> getAllCustomer(){
        return this.customerList;
    }
}
