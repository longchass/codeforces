import java.util.*;
public class S
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
		int k = input.nextInt();
		int res = 0;
		int lim =0;
		int temp = 0;
		for (int i = 0; i < k; ++i)
		{
			temp = input.nextInt();
			if (temp == 0)
			{
				System.out.println(i);
				return;
			}
		}
		int temp2=0;
		for(int i =k; i <n; i++)
		{
			temp2 = input.nextInt();
			if(temp != temp2)
			{
				System.out.println(i);
				return;
			}
		}			
		System.out.println(n);
		return;
    }
}