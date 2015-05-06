import java.util.Random;
/**
 * Abstract class Creature - write a description of the class here
 * 
 * creature implements all methods, is abract to maintain combatants being creatures however
 * 'basic' creatures of human exists to give a contextual name
 * 
 * @author Robert Foder
 * @version April, 20 2015
 */
public abstract class Creature
{
    protected static Random rand = new Random();
    
    private int health; // health = 0 - creature dead
    private int strength; // calculates maximum damage
    
   /**
    * default constructor with base of 12 health and s
    */ 

    Creature(){
    health = 12;
    strength = 12;
    
    // call other constructor
}
    
    /**
     * 
     *Creature recives h and s to indicate max health and strength
     * 
     *@param h intial hit points 
     * @param s used to detirman damage
     */
    Creature(int h, int s){
        health = h;
        strength = s;
        
 }
 
    
/**
 * attack causes 1-strength point(s) of damage
 * 
 * @return damage value caused by attack
 */
 public int attack(){
     
     return rand.nextInt(strength) + 1;
    }
 
/**
 * take damage removes d hit points from the heaths
 * 
 * 
 * @param damage - damage to subtrack from health
 */
  public void takeDamage(int damage){
      health = health - damage;
      //health -= damage;
      
    }
 
/**
     * @ return true if heath > 0, else false
     * 
     * 
     */
    public boolean isAlive(){
      
        return health > 0;
    }
    
}
    
    
    
    
    
    
    
    
    
    




