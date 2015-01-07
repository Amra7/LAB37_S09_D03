package predavanje_LinkedList;

public class Truck {

	private char letter;
	private Truck next;
	
	
	public Truck ( char letter){
		addLetter(letter);
	}

	public void addLetter(char letter2) {
		this.letter = letter;
	}
	
	public char getLetter(){
		return letter;
	}
	
	public Truck getNext(){
		return next;
	}
	
	public void attachTruck(Truck other){
		this.next = other;
	}
	
	public String toString(){
		String str="";
		str = str + "["+letter+"]";
		return str;
	}
	
}
