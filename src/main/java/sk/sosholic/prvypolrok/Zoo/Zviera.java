package sk.sosholic.prvypolrok.Zoo;

public class Zviera {


		private String typZvierata;
		private double cena;


		public Zviera(String typZvierata, double cena) {
			if (cena <= 0) {
				this.cena = 0;
			} else {
				this.cena = cena;
			}
			if (typZvierata.equals("")) {
				this.typZvierata = "Student 3TPI";
			} else {
				this.typZvierata = typZvierata;
			}

		}

		public String getTypZvierata() {
			return typZvierata;
		}

		public void setTypZvierata(String typZvierata) {
			this.typZvierata = checkName(typZvierata);
		}

		public double getCena() {
			return cena;
		}

		public void setCena(double cena) {
			this.cena = nubmerCheck(cena);
		}

		@Override
		public String toString() {
			return "Zviera{" +
					"typZvierata='" + typZvierata + '\'' +
					", cena=" + cena +
					'}';
		}

		private double nubmerCheck(double number) {
			if (number < 0) {
				return 0.0;
			} else
				return number;
		}

		private String checkName(String name) {
			if (name.trim().length() == 0) {
				return "student 3 TPI";
			} else {
				return name;
			}
		}
	}
