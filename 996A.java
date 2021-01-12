import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		int[] bill = new int[]{100,20,10,5,1};
		int res=0;
		int i =0;
		while(money > 0)
		{
			if(bill[i] > money)
				i++;
			else
			{
				money -= bill[i];
				res++;
			}
		}
		
		System.out.println(res);
	}
}