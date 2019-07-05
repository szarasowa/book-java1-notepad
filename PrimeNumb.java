/*
Show prime numbers from 2 to 100

02jan19.em
*/

class PrimeNumb	{
	public static void main(String args[])	{
		double primeNumber;
		System.out.println("\n\tPrime numbers from 2 to 100:\n");
		
		for(int y = 0; y < 1000000; y++) {
			System.out.println(y);
		}
		
		/*
		for(int n = 2; n <= 1000000; n++) {
			boolean isPrime = true;
			for(int x = 2; x < n; x++) {
				double modulo = n % x;
				if(modulo == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println("To jest liczba pierwsza = " + n);
			}
		}	
		*/
	}
}