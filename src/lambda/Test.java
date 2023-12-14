package lambda;

public class Test {
	public static void main(String[] args) {
		
		printThing((s) -> System.out.println("Meow"+ s));
	}
	
	static void printThing(Printable thing) {
		thing.print(" moye moye!");
	}
}


