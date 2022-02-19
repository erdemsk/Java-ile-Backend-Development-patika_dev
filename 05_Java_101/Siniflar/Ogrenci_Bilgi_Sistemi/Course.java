package student.information.system;

public class Course {
    Professor professor;
    String name, code, prefix;
    int score;

    public Course(String name, String courseID, String coursePrefix){
        this.name = name;
        this.code = courseID;
        this.prefix = coursePrefix;
        this.score = 0;
    }

    public void addProfessor(Professor p){
        if (this.prefix.equals(p.branch)){
            this.professor = p;
            System.out.println("Operation succeed!");
        } else{
            System.out.println("Prof. " + p.name + " can not teach these courses: " + this.prefix);
        }
    }

    public void printProfessor(){
        System.out.println("---------------------------------------------------------");
        if (professor != null){
            System.out.println("Professor of " + this.name + " is " + professor.name);
        } else{
            System.out.println("No professor has been assigned to the " + this.name + " course.");
        }
        System.out.println("---------------------------------------------------------");
    }
}
