package com.example.adrianas_homework;

public class Main {
    public static void main(String args[]) {
        SchoolList sl = new SchoolList(); //creating an object for School list class

        //-- calling the school list function --
        School sc = new School(); //creating an object for School class
        Address addr = new Address("Jalan 14/49","Petaling Jaya","46100","Selangor");
        sc.setName("SMK(P) Sri Aman");
        sl.addSchool(sc, addr);

        School sc2 = new School();
        Address addr2 = new Address("Presint 1","Putrajaya","62000","WP Putrajaya");
        sc2.setName("SMK Sultan Alam Shah");
        sl.addSchool(sc2, addr2);

        School sc3 = new School();
        Address addr3 = new Address("Jalan Hang Tuah","Kuala Lumpur","55200","WP KL");
        sc3.setName("Victoria Institution");
        sl.addSchool(sc3, addr3);

        sl.display();

        //-- calling the function to get address --
        /*Address addr = new Address("Jalan 14/49","Petaling Jaya","46100","Selangor");
        sc.setAddress(addr); addr.print();*/

        /*Address addr2 = new Address("Presint 1","Putrajaya","62000","WP Putrajaya");
        sc.setAddress(addr2); addr2.print();*/

        Marks marks = new Marks(100);

        //-- kalau ada error input it will display an error message --
        try {
            marks.setMark(-50, 0);
        }
        catch (Exception ex) {
            System.out.println("\nMarks must be positive.");
            ex.printStackTrace();
        }


        //marks.setMark(52, 1);
        //marks.setMark(93, 2);

        //-- displaying marks --
        float mark = marks.getMarks(5);
        System.out.println("Marks for student 1 is " + mark);

    }
}
