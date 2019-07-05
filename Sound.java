/*
Obliczanie odleg�o�ci przy pomocy sta�ej pr�dko�ci d�wi�ku

30dec18em
*/

class Sound {
	public static void main(String args[]) {
		double soundPM, t, n;
		soundPM = 330;

		t = 7.2;
		n = soundPM * t;

		System.out.println("Odleg�o�� od miejsca uderzenia pioruna wynosi " + n + " metr�w");

		String distUnit = " metry";
		double echoN = n/2;
		if(echoN > 1000) {
			distUnit = " kilometry";
			echoN = echoN/1000;
		}

		System.out.println("Je�eli obliczamy odleg�o�� przy pomocy echa, a d�wi�k wr�ci� do nas w ci�gu " + t + " sekund, to odleg�o�� do odbijaj�cego d�wi�k obiektu wynosi " + echoN + distUnit);
	}
}