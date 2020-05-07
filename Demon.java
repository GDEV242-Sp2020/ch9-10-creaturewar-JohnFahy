/**
 * Write a description of class Human here.
 * 
 * @author John Patrick Fahy 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 40;
    private static final int MIN_DEMON_HP = 35;
    private static final int MAX_DEMON_STR = 15;
    private static final int MIN_DEMON_STR = 10;

    /**
     * Constructor for objects of class Human
     */
    public Demon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
          
    }
    
    /**
     * 10% chance for elf to double damage
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int damage(){
        if (Randomizer.nextInt(19) == 0){
         return 50+super.damage();   
        }
        else{
        return super.damage();
    }
    }

}
