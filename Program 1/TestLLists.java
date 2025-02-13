
public class TestLLists
{
	public static void main(String [] args) 
	{
		final int NUM_DATA = 100000;
		DLList <Integer>linkList = new DLList<Integer>(); 
		DLList <String>strLList = new DLList<String>(); 
		
		// First we will be inserting in the front
		//First for the Doubly Linked List
		long start = System.currentTimeMillis(); //for the DLList
		for (int i = 0; i < NUM_DATA; i++)
			linkList.add(0,i);
		long elapsed = System.currentTimeMillis() - start;
		System.out.printf("Doubly Linked List when adding to front: %d ms\n", elapsed);
		
		//Now for the Doubly Linked List of type String
		start = System.currentTimeMillis(); // DLL
		for (int i = 0; i < NUM_DATA; i++)
			strLList.add(String.valueOf((char)('a' + i)));
		elapsed = System.currentTimeMillis() - start;
		System.out.printf("Doubly Linked List of type String when adding to front: %d ms\n", elapsed);

		//Now we are inserting at the rear 
		//First the Doubly Linked List
		linkList.clear();
		start = System.currentTimeMillis();
		for (int i = 0; i < NUM_DATA; i++)
			linkList.add(i);
		elapsed = System.currentTimeMillis() - start;
		System.out.printf("Doubly Linked List when adding to rear: %d ms\n", elapsed);
		
		//Now the Doubly Linked List of type String
		strLList.clear();
		start = System.currentTimeMillis(); // ArrayList
		for (int i = 0; i < NUM_DATA; i++)
			strLList.add(String.valueOf((char)('a' + i)));
		elapsed = System.currentTimeMillis() - start;
		System.out.printf("Doubly Linked List of type String when adding to rear: %d ms\n", elapsed);
	}
}
