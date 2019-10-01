import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenges
	{

		public static void main(String[] args)
			{
				challenges();
			}
		
		public static void challenges()
		{
			ArrayList <String> iceCream = new ArrayList <String>();
			
			iceCream.add("Rocky Road");
			iceCream.add("Butter Pecan");
			iceCream.add("Sweet Cream");
			iceCream.add("Blackberry");
			iceCream.add("Caramel Swirl");
			iceCream.add("French Vanilla");
			iceCream.add("Dark Chocolate Chunk");
			iceCream.add("Blueberry");
			iceCream.add("Watermelon");
			iceCream.add("Bubblegum");
			
			//First Challenge
			System.out.println("Printed Array List:");
			System.out.println();
			for(String s : iceCream)
			{
				System.out.println(s);
			}
			
			//Second Challenge
			System.out.println();
			System.out.println("Alphabetized List:");
			System.out.println();
			Collections.sort(iceCream);
			for(String s : iceCream)
				{
					System.out.println(s);
				}
			
			//Third Challenge
			System.out.println();
			System.out.println("First and Last Items Alphabetically:");
			System.out.println();
			Collections.sort(iceCream);
			System.out.println(iceCream.get(0) + " " + iceCream.get(9));
				
			
			//Fourth Challenge
			String result = "";
			for(int i = 0; i < iceCream.size(); i++)
				{
				  if(iceC[i].equals("B"))
					  {
						  
					  }
				}
		
			
			//Fifth Challenge
		}
		

	}
