package Examples;
public class Main {
    public static void main(String args[]) {
        School sk1 = new School();
        // NOT GOOD - Direct access to attributes is not a good practice
        sk1.setName("SMK Example On How to Use SetName");
        System.out.println("Name of school is "+sk1.getName());

        Address addr2 = new Address("Jalan 7/153A","Kuala Lumpur","58200","WP KL");
        //addr2.setStreet("Jalan 2");
        sk1.setAddress(addr2);
        addr2.print(); //I'M


        Marks marks = new Marks(100);
        //marks.createData(100);

        //kalau ada error input it will display an error message
        try {
            marks.setMark(-50, 0);
        }
        catch (Exception ex) {
            System.out.println("Marks must be positive.");
            ex.printStackTrace();
        }


        //marks.setMark(52, 1);
        //marks.setMark(93, 2);

        float mark = marks.getMarks(5);
        System.out.println("Marks for student 1 is " + mark);



    }
}