/*
Zastosowanie twierdzenia Pitagorasa
do obliczenia przeciwprostokątnej,
znając długość przyprostokątnych.

29dec18
em
*/

class PrzeciwProstokatna
{
	public static void main(String args[])
	{
		double x, y, z;

		x = 3;
		y = 4;

		z = Math.sqrt(x*x + y*y);
		System.out.println("PrzeciwprostoktAna wynosi " + z);
	}
}