import java.io.*;
import java.util.*;
 
public class Test{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			Integer[] arr = new Integer[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			Arrays.sort(arr);
			Collections.reverse(Arrays.asList(arr));
			long ans = 0;
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0 && arr[i] % 2 == 0) {
					ans += arr[i];
				} else if (i % 2 == 1 && arr[i] % 2 == 1) {
					ans -= arr[i];
				}
			}
			if (ans > 0) {
				System.out.println("Alice");
			} else if (ans == 0) {
				System.out.println("Tie");
			} else {
				System.out.println("Bob");
			}
		}
		
	}
}