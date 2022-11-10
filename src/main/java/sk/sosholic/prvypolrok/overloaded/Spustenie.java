package sk.sosholic.prvypolrok.overloaded;

public class Spustenie {

	public static void main(String[] args) {
		ZoznamZiakov zoznamZiakov = new ZoznamZiakov();
		System.out.println(zoznamZiakov.get());
		System.out.println(zoznamZiakov.get(2));
	}
}
