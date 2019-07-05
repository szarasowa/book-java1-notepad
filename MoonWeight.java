/*

Calculate weight on the Moon.

27dec18
Em
*/

class MoonWeight {
	public static void main(String args[]) {
		int weightOnEarth;
		double weightOnMoon;
		double moonG = 0.17;
		weightOnEarth = 72;

		weightOnMoon = weightOnEarth * moonG;
		/*
		System.out.println(
			"My weight on the Moon is "
			+ weightOnMoon + " kilograms");
		*/
		System.out.println();

		for(int x = 0; x <= weightOnEarth; x++) {
			System.out.println(
				x + "kg on Earth = " + x * moonG
				+ "kg on the Moon.");

			if(x == weightOnEarth) {
				System.out.println(
					"\nMy " + weightOnEarth 
					+ "kg weight on Earth is "
					+ weightOnMoon + " kilograms on the Moon.\n");
			}
		}
	}
}