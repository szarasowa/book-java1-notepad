/*
Simple help system (switch).

19jan19.em
*/

class Help {

	// this method will show selected content
	void helpOn(int what) {
		switch(what) {
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

	// this method will show a menu
	void showMenu() {	
		System.out.println("Informajca o sk³adni instrukcji:");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.println(" 3. for");
		System.out.println(" 4. while");
		System.out.println(" 5. do-while");
		System.out.println(" 6. break");
		System.out.println(" 7. continue");
		System.out.println("\nWybierz numer instrukcji (lub q aby zakoñczyæ):");
	}

	// this method will check is argument is vaild
	boolean isValid(int ch) {
		if(ch < '1' | ch > '7' & ch != 'q') return true;
		else return false;
	}
}

class HelpClassDemo {
	public static void main(String args[]) throws java.io.IOException {
		Help mHelp = new Help();
		char userInput, ignore;

		forLoop : for(;;) {
			do {
				mHelp.showMenu();
				userInput = (char) System.in.read();
				do {
					ignore = (char) System.in.read();
				} while(ignore != '\n');
			} while(mHelp.isValid(userInput));

	 	if(userInput == 'q') break forLoop;
		else mHelp.helpOn(userInput);
		}
	}
}