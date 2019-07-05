/*
Simple help system (switch).

06jan18.em
*/

class Help {
	public static void main(String args[]) throws java.io.IOException {
		System.out.print("Informajca o sk³adni instrukcji:"
				+ "\n\t1.\tif \n\t2.\tswitch"
				+ "\nWybierz numer instrukcji:\n");
		
		char userInput;
		userInput = (char) System.in.read();
		switch(userInput) {
			case '1' :
			System.out.print("\nInstrukcja warunkowa pêtli if:"
					+ "\n\n\tif(warunek) instrukcja;"
					+ "\n\telse instrukcja;");
			System.out.print("\n\nKoniec instrukcji.");
			break;
			case '2' :
			System.out.print("Instrukcja wyboru switch:"
					+ "\n\n\tswitch(zmienna) {"
					+ "\n\t\tcase 'wartoœæ' :"
					+ "\n\t\t\tinstrukcja;"
					+ "\n\t\tcase 'wartoœæ' :"
					+ "\n\t\t\tinstrukcja;"
					+ "\n\t\tdefault:"
					+ "\n\t\t\tdomyœlna;"
					+ "\n\t}");
			System.out.print("\n\nKoniec instrukcji.");
			break;
			default :
			System.out.println("YOU HAVE ONE JOB!");
			break;
		}
	}
}