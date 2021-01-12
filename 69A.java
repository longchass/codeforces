import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		input.nextLine();
		int x =0;
		int y =0;
		int f =0;
		
		for(int i =0; i < loop ;i++)
		{
			x += input.nextInt();
			y += input.nextInt();
			f += input.nextInt();
			input.nextLine();
		}
		if(x == 0 && y ==0 && f == 0)
		{
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}
}