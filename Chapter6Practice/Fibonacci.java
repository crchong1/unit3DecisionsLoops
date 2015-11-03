import java.util.Scanner;
public class Fibonacci
{
    public static void main (String[] args)
    {
    double fold1 = 1;
    double fold2 = 1;
    Scanner input = new Scanner(System.in);
    System.out.println("What is the Nth term you want?");
    double fmax = input.nextInt(); 
    
    double fnew = fold1+fold2;
    System.out.println("1");
    System.out.println("1");
    for(int n = 2; n <= fmax; n++)
    {
        fold2 = fold1;
        fold1 = fnew;
        fnew = fold1+fold2;
        System.out.println(fnew);
    }
    } 
}
