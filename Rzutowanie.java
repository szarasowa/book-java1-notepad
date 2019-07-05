/* 
Demontracja rzutowania
org. CastDemo.java

01jan19
em
*/

class Rzutowanie {
	public static void main(String args[]) {
		double x, y;
		byte b;
		int i;
		char ch;

		x = 10.0;
		y = 3.0;

		// Rzutowanie obetnie cz�� dziesi�tn� wyniku
		i = (int) (x / y);	// rzutuje double na int
		System.out.println("Ca�kowity wynik dzielenia x/ y: " + i);

		i = 100;
		b = (byte) i;	// Brak utraty informacji, byte umo�liwia reprezentacj� warto�ci 100
		System.out.println("Warto�� zmiennej b: " + b);

		i = 257;
		b = (byte) i;	// Utrata informacjj; byte nie umo�liwia reprezentacji warto�ci 257;
		System.out.println("Warto�� zmiennej b: " + b);

		b = 88;		// kod ASCII litery X
		ch = (char) b;	// Rzutowanie typu niezgodnego
		System.out.println("ch: " + ch);
	}	
}