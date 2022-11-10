package sk.sosholic.prvypolrok.overloaded;

public class Konvertor {
	public static void main(String[] args) {
		System.out.println();

	}

	static double converterNaCm(int palce) {
		double centimeter = 2.54*palce;
		System.out.println("V centimetroch to je = " + centimeter);
		return centimeter;
	}

	static double converterNaCm2(int inch, int feet) {
		inch = feet*12;
		feet = inch;
		return feet;
	}

}
