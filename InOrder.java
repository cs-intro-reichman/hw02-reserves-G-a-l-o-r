/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int random = (int) (10 * Math.random());
		int prev = random;
		do {
			prev = random;
			System.out.print(prev + " ");
			random = (int) (10 * Math.random());
		} while (random >= prev);
		System.out.println();
	}
}
