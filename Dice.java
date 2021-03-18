package assignment;
import java.util.Random;                      

public class Dice
{

	   public static void main(String[] args)
	   {
	       
	       roll obj=new roll();                          
	       obj.Dice_r();                       
	      
	    }
	  
}



	class roll
	{
	   public  void Dice_r()                       
	   {
	        int i;                                     
	        int sum=0;
	        
	        Random n=new Random();                    
	       
	        for(i=1;i<=5;i++)                          
	        {
	             int m = n.nextInt(6);
	             System.out.println("Dice " +i+ " outcome = "+m);
	             sum=sum+m;
	        }
	        
	        System.out.println("sum of all Dice outcomes = " + sum);
	   }
	}