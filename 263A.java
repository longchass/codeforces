import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		int x =0;
		
		Scanner input = new Scanner(System.in);
		for(int i =1; i <=5;++i)
		{
			for(int j = 1; j<=5;++j)
			{
				x = input.nextInt();
				if(x==1)
				{
					System.out.println((Math.abs(i-3) + Math.abs(j-3)));
				}
			}
		}
	}
}