/*
Program wyœwietla tabelê zmiany metry na cale 

27 dec 18 
Em
*/

// 1 metr = 39.37 cali

class InchesToMeters {
	public static void main(String args[]) {
		double inches, meters;
		int counter;

		counter = 1;
		for(inches = 1; inches <= 1000000; inches++) {
			meters = inches * 39.37;
			System.out.println(counter + ") " 
					+ inches + " inches = "
					+ meters + " meters.");
			counter++;

			if(counter == 11) {
				System.out.println();
				counter = 1;
			
				/* t
				// Slep to be more readable
				try 
				{
					Thread.sleep(2500);
				} catch(InterruptedException e)
				{
					Thread.currentThread().interrupt();
				}
				*/
			}
		}
	}
}