import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		StringBuilder result = new StringBuilder();
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		int even=0;
		int odd =0;
		int[] storage = new int[loop];
		for(int i =0; i < loop;i++)
		{
			int temp =input.nextInt();
			storage[i] = temp;
			if(temp % 2 ==0)
				even++;
			else
				odd++;
		}
		if(even > odd)
		{
			for(int i =0; i < loop;i++)
			{
				if(storage[i] % 2 !=0)
				{
					System.out.println(i+1);
					return;					
				}

			}
		}
		else
		{
			for(int i =0; i < loop;i++)
			{
				if(storage[i] % 2 ==0)
				{
					System.out.println(i+1);
					return;					
				}

			}			
		}
	}
}