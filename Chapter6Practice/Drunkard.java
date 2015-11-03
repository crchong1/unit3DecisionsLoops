import java.util.Random;

public class Drunkard
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;       
    
        for (int i = 0; i <=100; i++)
        {
            Random rn = new Random();
            int randomChoice = rn.nextInt(3) + 1;
            if (randomChoice == 1)
            {
                x++;
            }
            else if (randomChoice == 2)
            {
                x--;
            }    
            
            else if (randomChoice == 3)
            {
                y++;
            }
            
            else 
            {
                y--;
            }
        }  
        
        System.out.println("Drunkard stumbled to: " + x + ", " + y);
    
    }    
}
