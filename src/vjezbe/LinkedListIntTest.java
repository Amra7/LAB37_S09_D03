package vjezbe;

public class LinkedListIntTest {

	public static void main(String[] args) {
		
		LinkedListInt lli = new LinkedListInt();

		lli.add(1);
		lli.add(2);
		lli.add(3);
		lli.add(4);
		lli.printList();


		lli.addAt(5, 3);
		
		System.out.println("Poslije brisanja-------");
		lli.printList();
		int[] arr = lli.toArray();
		
		for(int a : arr){
			System.out.println(a);
		}
		
		
		LinkedListInt lli2 = new LinkedListInt();

		lli2.add(6);
		lli2.add(7);
		lli2.add(8);
		lli2.add(9);
		lli2.printList();
		lli.add(lli2);
		System.out.println("____________________");
		lli.printList();
	}
}
