
/**
 * Write a description of class Belrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Belrog extends Demon
{
    
    public Belrog()
    {
        super();
        
    }
    
    public Belrog(int str, int hp){
        super(str, hp);
        hp = 35;
        str = 25;
         System.out.println(" Belrog ");
}

     public int attack(){
        //ask creature for attack damage 
        int tempAttackDamage;
        tempAttackDamage = super.attack();
        tempAttackDamage += super.attack();
        tempAttackDamage += super.attack();
        //roll of dice(use creatures rand)
       return tempAttackDamage;
    }
    
    public void takeDamage(int damage){
       super.takeDamage(damage); 
       System.out.println("Belrog take's " + damage + " damage");
    }
   public void Belrogname(){
        System.out.println(" Belrog ");
    } 
    
}

