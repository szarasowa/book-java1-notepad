/* test
*/

class Liczbaa {
	public static void main(String args[]) {
		int liczba = 2, dzielniki = 0;
		double reszta;
		liczba = 2;
		
		for(int y = 0; y < 100; y++) {

			for(int x = 1; x <= liczba; x++) {
				// System.out.println("dzielê liczbê " + liczba + "\n");
				reszta = liczba % x;
				// System.out.println("reszta = " + reszta);
				if(reszta == 0) dzielniki++;
			}

			// System.out.println("dzielinków = " + dzielniki);
			if(dzielniki == 2) {
				System.out.println(liczba);
			}

			dzielniki = 0;
			liczba++;
		}
	}
}