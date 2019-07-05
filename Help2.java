/*
Simple help system (switch).

06jan18.em
*/

class Help2 {
	public static void main(String args[]) throws java.io.IOException {
		char userInput, ignore;

		do {
			System.out.println("Informajca o sk�adni instrukcji:");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. for");
			System.out.println(" 4. while");
			System.out.println(" 5. do-while\n");
			System.out.println("Wybierz numer instrukcji:");

			userInput = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
		} while( userInput < '1' | userInput > '5');

		switch(userInput) {
			case '1' :
			 System.out.print("\nInstrukcja warunkowa p�tli if:"
					+ "\n\n\tif(warunek) instrukcja;"
					+ "\n\telse instrukcja;");
			System.out.print("\n\nKoniec instrukcji.");
			break;
			case '2' :
			 System.out.print("Instrukcja wyboru switch:"
					+ "\n\n\tswitch(zmienna) {"
					+ "\n\t\tcase 'warto��' :"
					+ "\n\t\t\tinstrukcja;"
					+ "\n\t\tcase 'warto��' :"
					+ "\n\t\t\tinstrukcja;"
					+ "\n\t\tdefault:"
					+ "\n\t\t\tinstrukcja domy�lna;"
					+ "\n\t}");
			 System.out.print("\n\nKoniec instrukcji.");
			break;
			case '3' :
			 System.out.print("Instrukcja p�tli for:"
					+ "\n\n\tfor( inicjalizacja; warunek; iteracja) {"
					+ "\n\t instrukcja;"
					+ "\n\t}");
			 System.out.print("\n\nKoniec instrukcji.");
			break;
			case '4' :
			 System.out.print("Insturkcja p�tli while:"
				+ "\n\n\twhile(warunek) {"
				+ "\n\t instrukcja;"
				+ "\n\t}");
			 System.out.print("\n\nKoniec instrukcji.");
			break;
			case '5' :
			 System.out.print("Instrukcja p�tli do-while:"
				+ "\n\n\tdo {"
				+ "\n\t insturkcja"
				+ "\n\t} while(warunek);");
			 System.out.print("\n\nKoniec instrukcji.");
			break;
			default :
			System.out.println("YOU HAVE ONE JOB!");
			break;
		}
	}
}