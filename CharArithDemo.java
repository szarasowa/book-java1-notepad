/*
U¿ywanie zmiennych typu char jak wartoœci ca³kowitych.

30dec18em
*/

class CharArithDemo {
	public static void main(String args[]) {
		char ch;

		ch = 'X';
		System.out.println("ch ma wartosc = " + ch);

		ch++;		// inkrementacja zmiennej typu char

		System.out.println("po inkrementacji zminna ch ma wartosc = " + ch);

		ch = 90;	// zmiennej typu char mozna przypisac wartosc calkowita
		System.out.println("Zmienna 'ch' po przypisaniu liczby calkowitej = " + ch);


		for(ch = 0; ch <= 126; ch++) {
			System.out.println(ch + " znak w Unicode to " + ch);
		}
	}
}