// Exercise_3_10.java

class Exercise_3_10 {
 public static void main(String args[]) throws java.io.IOException {
	char userInput, ignore;
	int q = 0;

  do {
	do {
	 System.out.println("Press some key on your keyboard...");
	 userInput = (char) System.in.read();

	 	do {
	 		ignore = (char) System.in.read();
		} while(ignore != '\n');
	} while(!(userInput >= 0));

	if(userInput >= 'A' && userInput <= 'Z') { 
		userInput+=32; 
		System.out.println("Your input is: " + userInput);
		q++;
	} else if(userInput >= 'a' && userInput <= 'z') {
		userInput-=32; 
		System.out.println("Your input is: " + userInput);
		q++;
	}

  } while (userInput != '.');

  System.out.println("changes quatity: " + q);
 }
}