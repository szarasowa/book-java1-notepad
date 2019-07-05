class SideEffects {
	public static void main(String args[]) {
		int i = 0;

		if(false & (++i < 100)) {
			System.out.println("Wywo³anie nie zostanie wykonane");
		}
		System.out.println("Liczba wykonanych instrukcji: " + i); // wyœwietla 1

		if(false && (i++ < 100)) {
			System.out.println("Wywo³anie nie zostanie wykonane");
		}
		System.out.println("Liczba wykonanych instrukcji if: " + i);  // nadal wyœwietla 1
	}
}