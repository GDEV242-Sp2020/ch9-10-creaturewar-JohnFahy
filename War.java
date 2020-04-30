import java.util.ArrayList;
/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{
    private ArrayList<Creature> army1 = new ArrayList<Creature>();
    private ArrayList<Creature> army2 = new ArrayList<Creature>();

    /**
     * Constructor for objects of class War
     */
    public War()
    {
    }

    /**
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void generateArmies(int numFighters)
    {   for(int i = 0; i < numFighters; i++){
            int creatureType1 =Randomizer.nextInt(4);
            int creatureType2 =Randomizer.nextInt(4);
            if(creatureType1 == 0 ){
                Human human = new Human();
                army1.add(human);
            }
            if(creatureType2 == 0){
                Human human = new Human();
                army2.add(human);
            }
            if(creatureType1 == 1){
                Elf elf = new Elf();
                army1.add(elf);
            }
            if(creatureType2 == 1){
                Elf elf = new Elf();
                army2.add(elf);
            }
            if(creatureType1 == 2){
                Demon demon = new Demon();
                army1.add(demon);
            }
            if(creatureType2 == 2){
                Demon demon = new Demon();
                army2.add(demon);
            }
            if(creatureType1 == 3){
                Cyberdemon cyberdemon = new Cyberdemon();
                army1.add(cyberdemon);
            }
            if(creatureType2 == 3){
                Cyberdemon cyberdemon = new Cyberdemon();
                army2.add(cyberdemon);
            }
            if(creatureType1 == 4){
                Balrog balrog = new Balrog();
                army1.add(balrog);
            }
            if(creatureType2 == 4){
                Balrog balrog = new Balrog();
                army2.add(balrog);
            }
        }
    }

    /**
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void battle()
    {
        int index1 = 0;
        int index2 = 0;
        while(index1 <army1.size() && index2 < army2.size()){
            while (army1.get(index1).isAlive() && army2.get(index2).isAlive()){
                army1.get(index1).takeDamage(army2.get(index2).damage());
                army2.get(index2).takeDamage(army1.get(index1).damage());
            }
            if(!army1.get(index1).isAlive()){
                index1++;
            }
            if(!army2.get(index2).isAlive()){
                index2++;
            }
        }
        if (index1 > index2){
            System.out.println("Army 2 is victorious.");
        }
    }
}
