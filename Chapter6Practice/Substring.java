import java.util.Scanner;
public class Substring
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your word here");
        String word = scan.next();
        
        for(int start =0; start <= word.length(); start++)
        {
            int end = start+1;
            while (end <= word.length())
            {
                   System.out.println(word.substring(start, end));
                   end ++;    
            }    
        }
    }
}
