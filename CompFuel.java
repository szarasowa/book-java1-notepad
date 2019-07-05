/*
Method with a parmeter.
17.02.em
*/

class Vehicle {
	int passengers;
	int fuelcap;
	double lkm;

	int range() {
	 return (int) (fuelcap / lkm * 100);
	}

	double fuelneeded(int km) {
	 return (double) (km / 100 * lkm);
	}
}

class CompFuel {
	public static void main(String args[]) {
	 Vehicle minivan = new Vehicle();
	 Vehicle sportscar = new Vehicle();
	 double litersMinivan, litersSportscar;
	 int dist = 252;

	 minivan.passengers = 7;
	 minivan.fuelcap = 65;
	 minivan.lkm = 9.1;

	 sportscar.passengers = 2;
	 sportscar.fuelcap = 55;
	 sportscar.lkm = 12.5;

	 litersMinivan = minivan.fuelneeded(dist);
	 litersSportscar = sportscar.fuelneeded(dist);

	 System.out.print("\nMinivan need " + litersMinivan + " liters and Sports Car " + litersSportscar + " liters, for " + dist + " km long way." );
	}
}