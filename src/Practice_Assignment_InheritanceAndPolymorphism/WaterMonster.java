package Practice_Assignment_InheritanceAndPolymorphism;

public class WaterMonster extends Monster{
    WaterMonster(String name){
        super(name);
    }
    @Override

    public String attack() {
        return "Attack with water!";
    }
}
