/**
 * Human is a basic creature 
 * 
 * @author Robert Foder
 * @version April 20, 2015
 */
public class Sellsword extends Creature
{
   Sellsword(){
       super();
    }
    
   Sellsword(int str,int hp){
     
    super(hp, str);
    hp = 60;
    str = 12;
     ;
    }
    public void Sellswordname(){
        System.out.println(" Sellsword ");
    }
}
