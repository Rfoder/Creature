import java.util.Random;
import java.util.ArrayList;


/**
 * Write a description of class CreatureWar here.
 * 
 * @author Robert Foder
 * @version 5/3/15
 */
public class CreatureWar
{
    public Random rand = new Random();
    private ArrayList<Creature> firstSide;
    private ArrayList<Creature> secondSide;
    int battleSpots = rand.nextInt(8);
    
    public CreatureWar(){
        firstSide = new ArrayList<Creature>();
        secondSide = new ArrayList<Creature>();
        
        
    }
    public Creature addSpots(){ // # of creatures added to list.
       Random rand = new Random(); 
        int creature = rand.nextInt(5);
        if(creature == 0){
            System.out.println("Dragon: added");
            return new Dragon();
        }
        if(creature == 1){
            System.out.println("Elf: added");
            return new Elf();
        }
        if(creature == 2){
            System.out.println("Belrog: added");
            return new Belrog();
        }
        if(creature == 3){
            System.out.println("Human: added");
            return new Human();
        }
        if(creature == 4){
            System.out.println("Sellsword: added");
            return new Sellsword();
        }
         
      System.out.println("Demon added");
        return new Demon();
    }
      public void createSides() // random spots created for battle.
        {
            for(int Side = 0; Side < battleSpots; Side++){
                firstSide.add(addSpots());
                secondSide.add(addSpots());
        }
    }
    public void newbattle() // the battle sim play by play.
    {
        int Side1 = 0;  // the first army
        int Side2 = 0;  // the second army
        while(Side1 < battleSpots && Side2 < battleSpots)
        {
              
             System.out.println("----------------------------------------------------");
             System.out.println("The battle begins two sides clash!!! ");
              System.out.println("");
               System.out.println("");
                
            firstSide.get(Side1).takeDamage(secondSide.get(Side2).attack()); // first side gets hit
           
            System.out.println("");
            
            System.out.println("Creature " + Side2 + " Attack amount is " + secondSide.get(Side2).attack() 
                 + " directed towards " + Side1 + " the first side's creature. ");
                 
            System.out.println("");
            secondSide.get(Side2).takeDamage(firstSide.get(Side1).attack()); // second side gets hit
            System.out.println("");
            
             System.out.println("Creature " + Side1 + " Attack amount is " + secondSide.get(Side1).attack()
             + " directed towards " + Side2 + " the second side's creature. ");
             
             System.out.println("");
             
             if(firstSide.get(Side1).isAlive() != true){
                 System.out.println("Creature " + firstSide + " Dies, first side loses soldier. ");
                 Side1++;
                }
                if(secondSide.get(Side2).isAlive() != true){
                    System.out.println("Creature " + Side2 + " Dies, second side loses soldier. ");
                    Side2++;
                }
                 System.out.println("----------------------------------------------------");
                  System.out.println("The next line moves forward. ");
                   System.out.println("The battle continues");
                    System.out.println("");
                    System.out.println("");
                    
            }
            // if else statments determins the winner.
            System.out.println("The victor approaches");
            if(Side1 < Side2){
            System.out.println("Side two wins the battle!!!! ");
            }
            else if(Side1 > Side2){
                System.out.println("Side one wins the battle!!! ");
            }          
            else{
                System.out.println("Valar Morghulis!!! (All sides must die) ");
           }
            
         }    
    }
       
     

    

    
     
            
           