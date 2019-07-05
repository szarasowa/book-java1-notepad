/*
Program wyœwietla tabelê zmiany galonów na litry

27 dec 18 
Em
*/

class GalToLitTable {
	public static void main(String args[]) {
		double gallons, liters;
		int counter;

		counter = 1;
		for(gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854;
			System.out.println(counter + ") " 
					+ gallons + " gallons = "
					+ liters + " liters.");
			counter++;

			if(counter == 11) {
				System.out.println();
				counter = 1;
			}
		}
	}
}