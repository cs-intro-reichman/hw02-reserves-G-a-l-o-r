import java.util.Random;

/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		boolean girl = false;
		boolean boy = false;
		int counter = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		
		for(int i = 0; i< T; i++){
		while (boy == false || girl == false) {
			double child = Math.random();
			
            if  (child < 0.5) {
			counter++;
			girl = true; 
			} else {
			counter++;
			boy = true; }
			}
			if  (counter == 2){
				counter2++;
		    if	(counter == 3){
					counter3++;
		    if (counter >= 4){
						counter4++;

			}
		}
	}
		double avreage = counter / T;
		String most = "The most common number of children is ";
		int max = Math.max(Math.max(counter2, counter3),
			               counter4);
		if (max == counter2) {
			most = most + "2.";
		} else {
			if (max == counter3) {
				most = most + "3.";
			} else {
			
			    most = most + "4 or more.";
        System.out.println("Average: "+ avreage+"children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: "+ counter2);
        System.out.println("Number of families with 3 children: "+ counter3);
        System.out.println("Number of families with 4 children: "+ counter4);
        System.out.println(most);
			}
		
	}
	}
	}
}