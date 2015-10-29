import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your side length?");
        int side = scan.nextInt();
        int spaces;
        boolean nextLine= false;       
        boolean exit = false;
        while (exit == false)
        {
            while(nextLine == false)
            {
                int start = 0;
                while (start < side + 1)
                {
                    spaces = side-1;
                    while (spaces >= 0)
                    {
                        
                        System.out.print(" ");
                    }
                    
                    System.out.print("*");
                }
                
            System.out.println();
            }
            
        }
          
    }   
}
