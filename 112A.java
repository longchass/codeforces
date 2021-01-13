import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		StringBuilder result = new StringBuilder();
		Scanner input = new Scanner(System.in);
		String line1 = input.nextLine().toLowerCase();
		String line2 = input.nextLine().toLowerCase();
		for(int i = 0; i<line1.length(); i++){
			if(line1.charAt(i) - line2.charAt(i) < 0)
			{
				System.out.println(-1);
				return;
			}
			if(line2.charAt(i) - line1.charAt(i) < 0)
			{
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
}