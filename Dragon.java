public class Dragon extends Creature
{
  
    /**
     * Constructor for objects of class Elf
     */
    public Dragon()
    {
       super();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    Dragon(int str, int hp)
    {
        super(hp, str);
        hp = 40;
        str = 40;
         System.out.println(" Dragon ");
    }
    
    public int attack(){
        //ask creature for attack damage 
        int tempAttackDamage;
        tempAttackDamage = super.attack();
        //roll of dice(use creatures rand)
        if (rand.nextInt(10) == 0){
            tempAttackDamage *= 6;
            System.out.println("Dragon use's Dragon's Fire");
        }
        
        return tempAttackDamage;
    }
    public void Dragonname(){
        System.out.println(" Dragon ");
    }
}
