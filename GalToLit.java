/* 
Program zmieniaj¹cy galony na litry.

27 Dec 2018. Em.
*/

class GalToLit	{
	public static void main(String args[])	{
		double gallons;	// keep amount of gallons
		double liters;	// keep amount of liters

		gallons = 10;

		liters = gallons * 3.7854;

		System.out.println(gallons + " galonow odpowiada " + liters + " litrów.");
	}
}