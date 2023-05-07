package _00_intro_to_array_lists;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		String [] words = new String[5];
		//2. Add five Strings to your list
		for (int i=0; i<5; i++)
		{
			words[i]=i+"adde"+ Math.random();
			
			
			System.out.println("poop="+ words[i]);
			
		}
		
		
		//3. Print all the Strings using a standard for-loop
		
		//4. Print all the Strings using a for-each loop
		for(String word : words)
		{
			System.out.println( word);

		}
		
		//5. Print only the even numbered elements in the list.
		for (int i=0; i<5; i++)
		{
			if (i%2 == 0) 
			{
				System.out.println(words[i]);
				
			}
			
		}
		//6. Print all the Strings in reverse order.
		for (int i=4; i>=0; i--)
		{
			System.out.println(words[i]);
			
		}
		//7. Print only the Strings that have the letter 'e' in them.
		
		for (int i=0; i<5; i++)
		{
			char[] letters = words[i].toCharArray();
			for (char letter : letters)
			{
				if (letter == 'e')
				{
					System.out.println("superpoopinator");
				}
			}
			
			
		}
		
		
	}
}
