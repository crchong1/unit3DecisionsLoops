import java.util.Random;
import java.util.Scanner;
public class MonteCarlo
{
    public static void main (String[] args)
    {
        double y=0;
        double randomX;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the min");
        double min = scan.nextDouble();
        
        System.out.println("Enter the max");
        double max = scan.nextDouble();
        
        System.out.println("Enter the number of iterations");
        double iterations = scan.nextDouble();
        Random rn = new Random();
        
        for(int i = 0; i < iterations; i++) 
        {
            randomX = rn.nextDouble()*(max - min) + min;
            y = y + Math.sin(randomX);
        }
        
        y = (y/iterations)*(max - min);
        
        
        System.out.println("The area under the curve from min to max is: " + y);
    }

}
