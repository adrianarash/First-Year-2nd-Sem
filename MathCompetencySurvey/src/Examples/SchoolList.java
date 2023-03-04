package Examples;

import java.util.ArrayList;

public class SchoolList {
    //data section
    private ArrayList<School> school = new ArrayList<>();

    //operations
    public void addSchool(School sc){
        school.add(sc);
    }

    public void display(){
        for (int i=0; i< school.size(); i++){
            System.out.print("Name of school: ");
            System.out.println(school.get(i).getName());
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

    //testing the display, see if it works
    public static void main(String args[]){
        SchoolList test = new SchoolList();

        School sc = new School();
        sc.setName("Sri Aman");
        test.addSchool(sc);

        School sc2 = new School();
        sc2.setName("Sultan Alam Shah");
        test.addSchool(sc2);

        test.display();
    }
}
