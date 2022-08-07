package boxmatchsimulation;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight, maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void startMatch(){
        if (checkWeight()){
            while (f1.health > 0 && f2.health > 0){
                System.out.println("--------- New round ---------");
                if(Math.random() >= 0.5){
                    f2.health = f1.hit(f2);
                    if(isWin()) break;
                } else{
                    f1.health = f2.hit(f1);
                    if(isWin()) break;
                }

                printScore();
            }
        } else{
            System.out.println("Weight divisions of fighters don't match");
        }
    }

    public boolean checkWeight(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin(){
        if(f1.health == 0){
            System.out.println("Winner is: " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Winner is: " + f1.name);
            return true;
        }

        return false;
    }

    public void printScore(){
        System.out.println("---------");
        System.out.println(" Remaining health of " + f1.name + " is " + f1.health);
        System.out.println(" Remaining health of " + f2.name + " is " + f2.health);
    }
}
