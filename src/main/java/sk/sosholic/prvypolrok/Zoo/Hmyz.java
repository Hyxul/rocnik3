package sk.sosholic.prvypolrok.Zoo;

public class Hmyz extends Zviera{

	private int pocetNoh;
	public Hmyz(String typZvierata, double cena,int pocetNoh) {
		super(typZvierata, cena);
		this.pocetNoh = checkPocetNoh(pocetNoh);
	}
	public int getPocetNoh() {
		return pocetNoh;
	}

	public void setPocetNoh(int pocetNoh) {
		this.pocetNoh = checkPocetNoh(pocetNoh);
	}

	private int checkPocetNoh(int pocetNoh) {
		if(pocetNoh==0 || pocetNoh==6 || pocetNoh==8 || pocetNoh==100){
			return pocetNoh;

		}else {
			return -1;
		}
	}
}
