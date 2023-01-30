package Practice_Assignment_InheritanceAndPolymorphism;

public class StoneMonster extends Monster {

    public StoneMonster(String name)
    {
        super(name);
    }
    public String attack()
    {
         return "Attack with stones!";
    }
}
