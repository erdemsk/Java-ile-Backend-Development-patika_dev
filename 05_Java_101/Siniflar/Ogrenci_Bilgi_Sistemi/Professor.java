package studentinformationsystem;

public class Professor {
    String name, phoneNumber, branch;

    public Professor(String name, String phoneNumber, String branch){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    public void printProfessorInfo(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Name of the Professor: " + this.name);
        System.out.println("Phone Number of the Professor: " + this.phoneNumber);
        System.out.println("Branch of the Professor: " + this.branch);
        System.out.println("---------------------------------------------------------");
    }
}
