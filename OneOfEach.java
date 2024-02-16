
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean girl = false;
		boolean boy = false;
		int sum = 0;
		while (boy == false || girl == false) {
			double child = Math.random();
			sum++;
            if  (child < 0.5) {
			System.out.print("g ");
			girl = true; 
			} else {
			System.out.print("b ");
			boy = true; }
			}
			System.out.println();
			System.out.println("You made it... and you now have "+ sum +" children.");
			
	}
}
