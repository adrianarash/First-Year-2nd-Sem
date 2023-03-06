package com.example.adrianas_homework;
import java.util.ArrayList;
public class SchoolList {
    private ArrayList<School> school = new ArrayList<>();
    private ArrayList<Address> address = new ArrayList<>();

    //operations
    public void addSchool(School sc, Address ad){
        school.add(sc);
        address.add(ad);
    }

    //I wanted the program to display nicely, school name then school address
    //that's why i did this
    public void display(){
        for (int i=0; i< school.size(); i++){
            System.out.print("Name of school " + (i+1) + ": ");
            System.out.println(school.get(i).getName());

            System.out.print("Address for school " + (i+1) + ": ");
            //System.out.println(school.get(i).getAddress());
            System.out.println(address.get(i).print());
        }
    }

    //constructor
    /*public SchoolList(ArrayList<School> school) {
        this.school = school;
    }*/

    public ArrayList<School> getSchool() {
        return school;
    }

    public void setSchool(ArrayList<School> school) {
        this.school = school;
    }

    public ArrayList<Address> getAddress() { return address; }

    public void setAddress(ArrayList<Address> address) { this.address = address; }
}
