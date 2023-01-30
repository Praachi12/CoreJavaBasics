package Practice_Assignment_InheritanceAndPolymorphism;

public class Monster {

    public String getMonster() {
        return monster;
    }

    public void setMonster(String monster) {
        this.monster = monster;
    }

    public Monster(String monster) {
        this.monster = monster;
    }

    String monster;
    public String attack()
    {
       return  "I don't know how to attack";
    }



}
