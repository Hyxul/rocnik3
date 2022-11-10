package sk.sosholic.prvypolrok.Zoo;

import sk.sosholic.prvypolrok.databazaziakov.Ziak;

import java.util.ArrayList;
import java.util.List;

public class Chovatel {

	private List<Zviera> zoo = new ArrayList<>();
	private String menoPriezvisko;

	public Chovatel(String menoPriezvisko) {
		this.menoPriezvisko = menoPriezvisko;
	}

	public void pridatZviera(Zviera zviera){
		zoo.add(zviera);
	}

	public Zviera zistiNajdrahsieZviera(){
		Zviera najdrahsieZviera = zoo.get(0);
		for (Zviera animalCyklus : zoo) {
			if( animalCyklus.getCena() >najdrahsieZviera.getCena()){
				najdrahsieZviera = animalCyklus;
			}
		}
		return najdrahsieZviera;
	}
}
