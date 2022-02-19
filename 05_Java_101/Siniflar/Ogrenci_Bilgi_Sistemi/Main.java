package student.information.system;
     /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-obs
    Write a student information system with 4 classes: Course, Professor, Student, Main
    */

public class Main {
    public static void main(String[] args) {
        //create Course objects
        Course math = new Course("Mathematics", "MAT101", "MATH");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry", "CHEM101", "CHEM");

        //create Professor objects
        Professor p1 = new Professor("Srinivasa Aiyangar Ramanujan", "911887221287", "MATH");
        Professor p2 = new Professor("Albert Einstein", "911887221287", "PHY");
        Professor p3 = new Professor("Walter White", "0707091958", "CHEM");

        //invoke addProfessor(Professor p) method from the Course class
        math.addProfessor(p1);
        math.addProfessor(p2);
        physics.addProfessor(p2);
        chemistry.addProfessor(p3);

        //create Student objects and enter their notes as integers, then check if they are passed or failed
        Student s1 = new Student("Erdem Sik", 4, "180180180", math, physics, chemistry);
        s1.addBulkExamScore(100, 100, 100);
        s1.isPassed();

        Student s2 = new Student("Stephen Hawking", 4, "180180181", math, physics, chemistry);
        s2.addBulkExamScore(100, 100, 10); //He is not interested in chemistry
        s2.isPassed();

        Student s3 = new Student ("Jesse Pinkman", 4, "180180182", math, physics, chemistry);
        s3.addBulkExamScore(3, 5, 11); //Chemistry is his favorite subject
        s3.isPassed();

        //invoke printProfessor() method from Course class, and printProfessorInfo() method from Professor class
        math.printProfessor();
        p1.printProfessorInfo();
    }
}
