import java.util.Random;

public class MontyPython
{
    public static void main(String[] args)
    {
        
        int strategyCounter = 0;
        for(int games = 0; games <= 1000; games++)
        {
             Random rn = new Random();
             int randomNumber = rn.nextInt(3) + 1;    
        
             Random choice = new Random();
             int randomChoice = choice.nextInt(3) + 1;
             
             if (randomNumber == randomChoice)
             {
                 strategyCounter++;
             }
        }     
        double winPercentage = strategyCounter / 1000.0;
        
        System.out.println("Here is the percent of wins out of 1000 games: " + winPercentage);
        
        strategyCounter = 0;
        for (int games2 = 0; games2 < 1000; games++)
        {
            
            boolean door1 = false;
            boolean door2 = false;
            boolean door3 = false;
            Random rand = new Random();
            int randomNumber2 = rand.nextInt(3) + 1;
            switch (randomNumber2)
            {
                case 1: door1 = true;
                break;
                case 2: door2 = true;
                break;
                case 3: door3 = true;
                break;
            }
        
            boolean chosenDoor1 = false;
            boolean chosenDoor2 = false;
            boolean chosenDoor3 = false;
            Random rand2 = new Random();
            int randomNumber3 = rand2.nextInt(3) + 1;
            switch (randomNumber3)
            {
                case 1: chosenDoor1 = true;
                break;
                case 2: chosenDoor2 = true;
                break;
                case 3: chosenDoor3 = true;
                break;
            }
            
            
            
        }            
    }
}
