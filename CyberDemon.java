
/**
 * Write a description of class CyberDemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
   public CyberDemon()
   {
       super();
     
    }
    public CyberDemon(int str, int hp ){
        super(str, hp);
        hp = 45;
        str = 25;
         System.out.println(" CyberDemon ");
    }
    
    public void takeDamage(int damage){
        super.takeDamage(damage);
        System.out.println("CyberDemon take's " + damage + " damage");
    }
     public int attack(){
        //ask creature for attack damage 
        int tempAttackDamage;
        tempAttackDamage = super.attack();
        tempAttackDamage += super.attack();
        //roll of dice(use creatures rand)
       return tempAttackDamage;
    }
    public void Cybername(){
        System.out.println(" CyberDemon ");
    }
}

