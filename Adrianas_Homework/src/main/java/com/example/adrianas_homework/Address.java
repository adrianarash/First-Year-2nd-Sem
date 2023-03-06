package com.example.adrianas_homework;

public class Address {
    private String street;
    private String district;
    private String postcode;
    private String state;

    //This is a constructor (it has no return type)
    public Address(String street, String district, String postcode, String state){
        this.street = street;
        this.district = district;
        this.postcode = postcode;
        this.state = state;
    }
    //constructors can be overloaded (repeated but with different parameters)


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address print() {
        System.out.println(street + " " + district + " " + postcode + " " + state);
        return null; //intelliJ forced me to put this return null statement :(
    }
}
