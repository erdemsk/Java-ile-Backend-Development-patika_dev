package boxmatchsimulation;
// Assignment of Java101 Module by patika.dev https://app.patika.dev/courses/java101/pratik-boks

public class Main {
    public static void main(String[] args) {
        Fighter mark = new Fighter("Mark", 15, 100, 90, Math.random()*10);
        Fighter alex = new Fighter("Alex", 10, 95, 100, Math.random()*10);
        Ring r = new Ring(mark, alex, 90, 100);
        r.startMatch();
    }
}
