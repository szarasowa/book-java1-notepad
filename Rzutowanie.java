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

		// Rzutowanie obetnie czêœæ dziesiêtn¹ wyniku
		i = (int) (x / y);	// rzutuje double na int
		System.out.println("Ca³kowity wynik dzielenia x/ y: " + i);

		i = 100;
		b = (byte) i;	// Brak utraty informacji, byte umo¿liwia reprezentacjê wartoœci 100
		System.out.println("Wartoœæ zmiennej b: " + b);

		i = 257;
		b = (byte) i;	// Utrata informacjj; byte nie umo¿liwia reprezentacji wartoœci 257;
		System.out.println("Wartoœæ zmiennej b: " + b);

		b = 88;		// kod ASCII litery X
		ch = (char) b;	// Rzutowanie typu niezgodnego
		System.out.println("ch: " + ch);
	}	
}