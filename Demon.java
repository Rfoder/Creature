
/**
 * Write a description of class Demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
 public Demon()
    {
       super();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    Demon(int str, int hp)
    {
        super(hp, str);
    }
    
    public int attack(){
        //ask creature for attack damage 
        int tempAttackDamage;
        tempAttackDamage = super.attack();
        //roll of dice(use creatures rand)
        if (rand.nextInt(20) == 0){
            tempAttackDamage += 50;
            System.out.println(" Belrog/CyberDemon use's hard hit ");
        }
        
        return tempAttackDamage;
    }
}