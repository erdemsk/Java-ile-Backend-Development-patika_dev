package studentinformationsystem;

public class Student {
    final double NUMBER_OF_COURSES = 3.0;
    final int PASS_BENCHMARK = 55, LOWEST_SCORE_POSSIBLE = 0, HIGHEST_SCORE_POSSIBLE = 100;

    String name, studentID;
    int classOfStudent;
    Course math, physics, chemistry;
    double averageScore;
    boolean isPassed;

    Student(String name, int classOfStudent, String studentID, Course math, Course physics, Course chemistry){
        this.name = name;
        this.classOfStudent = classOfStudent;
        this.studentID = studentID;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPassed = false;
    }

    public void addBulkExamScore(int math, int physics, int chemistry){
        if (math >= LOWEST_SCORE_POSSIBLE && math <= HIGHEST_SCORE_POSSIBLE){
            this.math.score = math;
        }
        if (physics >= LOWEST_SCORE_POSSIBLE && physics <= HIGHEST_SCORE_POSSIBLE){
            this.physics.score = physics;
        }
        if (chemistry >= LOWEST_SCORE_POSSIBLE && chemistry <= HIGHEST_SCORE_POSSIBLE){
            this.chemistry.score = chemistry;
        }
    }

    public void isPassed() {
        if (this.math.score == LOWEST_SCORE_POSSIBLE || this.physics.score == LOWEST_SCORE_POSSIBLE || this.chemistry.score == LOWEST_SCORE_POSSIBLE) {
            System.out.println("Not all grades entered");
        } else {
            this.isPassed = isPassCheck();
            printNote();
            System.out.println("Average: " + this.averageScore);
            if (this.isPassed) {
                System.out.println("Passed the class!");
            } else {
                System.out.println("Failed the class!");
            }
        }
    }

    public void calcAverage(){
        this.averageScore = (this.physics.score + this.chemistry.score + this.math.score) / NUMBER_OF_COURSES;
    }

    public boolean isPassCheck(){
        calcAverage();
        return (this.averageScore > PASS_BENCHMARK);
    }

    public void printNote(){
        System.out.println("------------------");
        System.out.println("Student: " + this.name);
        System.out.println("Math score: " + this.math.score);
        System.out.println("Physics score: " + this.physics.score);
        System.out.println("Chemistry score: " + this.chemistry.score);
    }
}
