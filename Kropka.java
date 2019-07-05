/*
read char from keyboard user input, unless read '.'
19jan19em
*/

class Kropka {
 public static void main(String args[]) throws java.io.IOException {
	char userInput, ignore;
	int q = 0;

	mainLoop : for(;;) {
		
		System.out.println("Wpisuj znaki...");
		userInput = (char) System.in.read();
	 	 do {
		  ignore = (char) System.in.read();
		 } while(ignore != '\n');

		switch(userInput) {
		 case '.' :
		  break mainLoop;
		 case ' ' :
		  q++;
		  break;
		 default:
		 System.out.println("\nYou clicked the " + userInput + " key\n");
		}

	}
	System.out.println("You clicked the space key " + q + " times.");
 }
}