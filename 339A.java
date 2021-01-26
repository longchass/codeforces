import java.io.*;
import java.util.*;
 
public class Test{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();
		int[] res = new int[(t.length()/2)+1];
		int ptr = 0;
		for( char c : t.toCharArray())
		{
			if(c != '+')
			{
			res[ptr] = Character.getNumericValue(c);
			ptr++;				
			}
			

		}
		ptr =0;
		Arrays.sort(res);
		while(ptr < res.length-1)
		{
			System.out.print(res[ptr]+"+");
			ptr++;
		}
		System.out.print(res[res.length-1]);
		
	}
}