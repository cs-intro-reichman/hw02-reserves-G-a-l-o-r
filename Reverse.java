/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String original = args[0];
		String Reverse = "";
		
		for (int i = original.length()-1; i >= 0; i--) 
		{
		Reverse = Reverse+ original.charAt(i);
		}
		System.out.println(Reverse);
		System.out.println("The middle character is " + original.charAt((int)((original.length()-1)/2)));




	


	}

}
