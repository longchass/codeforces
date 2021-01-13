import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		StringBuilder result = new StringBuilder();
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		int count=0;
		int lasteven=0;
		int lastodd=0;
		for(int i =0; i < loop;i++)
		{
			int temp =input.nextInt();
			if(temp % 2 ==0)
			{			
				count++;
				lasteven =i;
			}
			else
			{
				count--;
				lastodd =i;
			}
		}
		if(count > 0)
		{
					System.out.println(lastodd+1);
					return;					
		}
		else
		{
					System.out.println(lasteven+1);
					return;								
		}
	}
}