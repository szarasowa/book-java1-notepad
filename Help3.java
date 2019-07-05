/*
Simple help system (switch).

19jan19.em
*/

class Help3 {
	public static void main(String args[]) throws java.io.IOException {
		char userInput, ignore;

	 for(;;) {
		do {
			System.out.println("Informajca o sk³adni instrukcji:");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. for");
			System.out.println(" 4. while");
			System.out.println(" 5. do-while");
			System.out.println(" 6. break");
			System.out.println(" 7. continue");
			System.out.println("\nWybierz numer instrukcji (lub q aby zakoñczyæ):");

			userInput = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
		} while( userInput < '1' | userInput > '7' & userInput != 'q');

	 	if(userInput == 'q') break;

		switch(userInput) {
			case '1' :
			 System.out.print("\nInstrukcja warunkowa pêtli if:"
					+ "\n\n\tif(warunek) instrukcja;"
					+ "\n\telse instrukcja;");
			System.out.print("\n\nKoniec instrukcji.");
			break;
			case '2' :
			 System.out.print("\nInstrukcja wyboru switch:"
					+ "\n\n\tswitch(zmienna) {"
					+ "\n\t\tcase 'wartoœæ' :"
					+ "\n\t\t\tinstrukcja;"
					+ "\n\t\tcase 'wartoœæ' :"
					+ "\n\t\t\tinstrukcja;"
					+ "\n\t\tdefault:"
					+ "\n\t\t\tinstrukcja domyœlna;"
					+ "\n\t}");
			 System.out.print("\n\nKoniec instrukcji.");
			break;
			case '3' :
			 System.out.print("\nInstrukcja pêtli for:"
					+ "\n\n\tfor( inicjalizacja; warunek; iteracja) {"
					+ "\n\t instrukcja;"
					+ "\n\t}");
			 System.out.print("\n\nKoniec instrukcji.");
			break;
			case '4' :
			 System.out.print("\nInsturkcja pêtli while:"
				+ "\n\n\twhile(warunek) {"
				+ "\n\t instrukcja;"
				+ "\n\t}");
			 System.out.print("\n\nKoniec instrukcji.");
			break;
			case '5' :
			 System.out.print("\nInstrukcja pêtli do-while:"
				+ "\n\n\tdo {"
				+ "\n\t insturkcja"
				+ "\n\t} while(warunek);");
			 System.out.print("\n\nKoniec instrukcji.");
			break;
			case '6' :
			 System.out.print("\nInstrukcja break:"
				+ "\n\n\tbreak; lub break etykieta;\n");
			 System.out.print("\n\nKoniec instrukcji.");
			 break;
			case '7' :
			 System.out.print("\nInstrukcja contiune:"
				+ "\n\n\tcontinue; lub continue etykieta;");
			 System.out.print("\n\nKoniec instrukcji.");
			 break;
			default :
			System.out.println("YOU HAVE ONE JOB!");
			break;
		}
	 }
	}
}