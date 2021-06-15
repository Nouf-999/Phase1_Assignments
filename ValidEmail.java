import java.util.*;

public class ValidEmail {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> EmailID = new ArrayList<String>();
		
		EmailID.add("Rene22@yahoo.com");
		EmailID.add("Majed_Ahmed@gmail.com");
		EmailID.add("Sara-09@outlook.com");
		EmailID.add("ydaop@gmail.com");
		EmailID.add("ItzKera@yahoo.com");
		EmailID.add("BBU.1991@outlook.com");
		EmailID.add("Nuiia@yahoo.com");
		EmailID.add("Madi.00@gmail.com");
	   
		System.out.println("Enter an Email Id to search for: ");
		
		String input = sc.nextLine();
		
	    for (String element : EmailID){
	         if (element.contains(input)){
	               System.out.println(element + " is found.");
	         }
	      }
	}
}
