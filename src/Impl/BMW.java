package Impl;

import Interface.Vehicle;

public class BMW implements Vehicle {
    private static final String name="Scoda";
    private String model;
    private int cost;
    private int serviceYears;

    public BMW(String model, int cost, int serviceYears) {
        this.model = model;
        this.cost = cost;
        this.serviceYears = serviceYears;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getServiceYears() {
        return serviceYears;
    }

    public void setServiceYears(int serviceYears) {
        this.serviceYears = serviceYears;
    }

    @Override
    public void getDetails() {
        System.out.println("The Car you choose is "+name+ " of Model:"+ this.getModel()
                +" having cost: "+this.getCost()
                +" with "+this.getServiceYears()+" years of service"
        );
    }
}
