package sk.sosholic.prvypolrok.overloaded;

public class KonvertovanieCasu {
	public static void main(String[] args) {
		getDurationString(-1);

	}
	static String getDurationString(double seconds){
		double minutes = seconds/60;
		double hours = minutes/60;
		double reminderMinutes = minutes%60;
		double reminderSeconds = seconds%60;
		if (seconds<60){
			System.out.println("Neplatné číslo");
		}
		if(minutes<0){
			System.out.println("Neplatné číslo");
		}
		else{
			System.out.println(seconds);
		}

		return hours + "Hod " + reminderMinutes + "Min " + reminderSeconds + "Sec ";
	}
	static String getDurationString(int minutes, int seconds){
		double seconds1 = seconds%60;
		if (seconds<59 && seconds <0){
			System.out.println("Neplatné číslo");
		}
		else{
			System.out.println();
		}
		return getDurationString(seconds + seconds1);
	}
}

