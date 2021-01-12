import java.util.*;
public class S
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int loop = input.nextInt();
        input.nextLine();
        for(int i = 1; i <= loop; i++)
        {
            String get = input.nextLine();
            if(get.length() <= 10)
            {
                System.out.println(get);
            }
            else
            {
                System.out.println(get.charAt(0) + Integer.toString(get.length() - 2) + get.charAt(get.length()-1));
            }
        }
    }
}