package sk.sosholic.prvypolrok.Zoo;

public class Ryba extends Zviera {

	String typVody;
	public Ryba(String typZvierata, double cena, String typVody) {
		super(typZvierata, cena);
		this.typVody =typVody;
	}
	public String getTypVody() {
		return typVody;
	}
	public void setTypVody(String typVody) {
		this.typVody = typVody;
	}
	@Override
	public String toString() {
		return "Ryba{" +
				"typVody='" + typVody + '\'' +
				'}';
	}
}
