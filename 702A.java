import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		input.nextLine();
		int res = 1;
		int temp=input.nextInt();
		int currloop=1;

		for(int i =0; i <loop-1;i++)
		{
			int prevnum=temp;
			temp = input.nextInt();
			if(temp > prevnum)
			{
				currloop++;
			}
			else
			{
				currloop =1;
			}
			res=Math.max(currloop,res);

			prevnum = temp;
		}
		
		System.out.println(res);
	}
}