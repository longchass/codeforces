import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		int res =0;
		 input.nextLine();
		for(int i=0; i < loop;i++)
		{
			String line = input.nextLine();
			char in = line.charAt(0);
			if(in == 'X')
			{
				in = line.charAt(1);
			}
			if (in ==  '-')
			{
				res--;
			}
			else
			{
				res++;
			}
		}
		System.out.println(res);
	}
}