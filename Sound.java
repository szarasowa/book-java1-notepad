/*
Obliczanie odleg³oœci przy pomocy sta³ej prêdkoœci dŸwiêku

30dec18em
*/

class Sound {
	public static void main(String args[]) {
		double soundPM, t, n;
		soundPM = 330;

		t = 7.2;
		n = soundPM * t;

		System.out.println("Odleg³oœæ od miejsca uderzenia pioruna wynosi " + n + " metrów");

		String distUnit = " metry";
		double echoN = n/2;
		if(echoN > 1000) {
			distUnit = " kilometry";
			echoN = echoN/1000;
		}

		System.out.println("Je¿eli obliczamy odleg³oœæ przy pomocy echa, a dŸwiêk wróci³ do nas w ci¹gu " + t + " sekund, to odleg³oœæ do odbijaj¹cego dŸwiêk obiektu wynosi " + echoN + distUnit);
	}
}