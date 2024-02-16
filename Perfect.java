/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		String answer = n + " is a perfect number since " + n + " = 1";
		int sum = 1;
		for (int i = 2 ; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
				answer = answer + " + " + i;
			}
		}
		if (n != sum) {
			answer = n + " is not a perfect number";
		}
		System.out.println(answer);
	}
}
