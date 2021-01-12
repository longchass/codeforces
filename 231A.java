import java.util.*;
public class S
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int loop = input.nextInt();
        input.nextLine();
		int res = 0;
        for(int i = 1; i <= loop; i++)
        {
			int count =0;
			for(int j =0; j < 3; j++)
			{
				if(input.nextInt() ==1)
				{
				count++;
				}
			}
			if (count >= 2)
				res++;
        }
		System.out.println(res);
    }
}