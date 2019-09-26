package model;

public class Customer {

    private int customerId;
    private String customerName;
    private Address customerAddress;
    private long phoneNumber;
    private int age;
    private long carBuyingRange;

    public Customer() {
    }

    public Customer(int customerId, String customerName, Address customerAddress, long phoneNumber, int age, long carBuyingRange) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.carBuyingRange = carBuyingRange;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Address getAddress() {
        return customerAddress;
    }

    public void setAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getCarBuyingRange() {
        return carBuyingRange;
    }

    public void setCarBuyingRange(long carBuyingRange) {
        this.carBuyingRange = carBuyingRange;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){ this.age = age; }
    }

    @Override
    public String toString() {
        return "\n\nCustomer Details\n===============================================\n" +
                "Customer Id:" + customerId +
                ", Customer Name:'" + customerName + '\'' +
                "\nAddress details\n" +
                "Flat Number:"+ customerAddress.getFlatNumber()+
                ", Building Name:"+ customerAddress.getBuildingName()+
                ", City:"+ customerAddress.getCity()+
                ", State:"+ customerAddress.getState()+
                "\nPhone Number:" + phoneNumber +
                ", Age:" + age +
                ", Buying Range : " + carBuyingRange +"\n";
    }
}
