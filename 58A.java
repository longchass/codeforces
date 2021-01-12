import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		String initial = input.nextLine();

		String h = "hello";
		int f =0;
		for(int i =0; i < initial.length() ;i++)
		{
			if(h.charAt(f) == initial.charAt(i))
			{
				f++;
				if(f == 5)
				{
							System.out.println("YES");
							return;
				}	
			}
			
				
		}

		System.out.println("NO");
	}
}