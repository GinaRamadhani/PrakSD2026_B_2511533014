package pekan2_2511533014;
import java.util.ArrayList;

public class ArrayList1_2511533014 {
	public static void main (String [] args) {
		// Size Of the Arraylist
		int n= 5;
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		//Appending new elements at the end of the list
		for (int i= 1; i <= n; i++)
			arrli.add(i);
		//Printing elements
		System.out.println (arrli);
		//Printing elements one by one
		for (int i= 0; i < arrli.size () ; i++)
			System.out.print(arrli.get (i) +" ");
	
		
	}

}
