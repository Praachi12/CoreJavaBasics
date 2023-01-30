package Practice_Assignment_InheritanceAndPolymorphism;

public class FireMonster extends Monster{
    FireMonster(String name){
        super(name);
    }
    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
