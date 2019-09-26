package model;

public class Address {
    private int flatNumber;
    private String buildingName;
    private String city;
    private String state;

    public Address(int flatNumber, String buildingName, String city, String state) {
        this.flatNumber = flatNumber;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}
