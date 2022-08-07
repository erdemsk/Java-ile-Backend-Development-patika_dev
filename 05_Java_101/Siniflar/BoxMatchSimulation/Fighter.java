package boxmatchsimulation;

public class Fighter {
    String name;
    int damage, health, weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter opponent){
        System.out.println("------------");
        System.out.println(this.name + " => " + opponent.name + " " + this.damage + " damage tried");
    if(opponent.dodge()){
        System.out.println(opponent.name + " swayed the damage");
        return opponent.health;
    }

    if(opponent.health - this.damage < 0){
        return 0;
    }

    return opponent.health - this.damage;
    }

    public boolean dodge(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
