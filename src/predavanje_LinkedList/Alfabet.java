package predavanje_LinkedList;

public class Alfabet {

	public static void main(String[] args) {
		
		Train abcTrain = new Train();
		Engine eng =  new Engine ();
		Truck a = new Truck('A');
		eng.add(a);
		Truck lastTrucke = a;
		
		for ( int i = 1; i<26; i++){
			Truck next = new Truck ((char)('A' +i));
			lastTrucke.attachTruck(next);
			lastTrucke = next;
			
		}
		
		System.out.println(eng);
		
		
	}
}
