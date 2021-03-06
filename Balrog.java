/**
 * Write a description of class Human here.
 * 
 * @author John Patrick Fahy 
 * @version (a version number or a date)
 */
public class Balrog extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Human
     */
    public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
          
    }
    
    /**
     * Balrog attacks twice each round.
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int damage(){
        return super.damage() + super.damage();
    }
    

}
