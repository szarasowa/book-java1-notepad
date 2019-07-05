class TestS {
	public static void main(String args[]) throws java.io.IOException {
		System.out.println("Press S to stop this!");

		int i;

		for(i = 0; (char) System.in.read() != 'S'; i++) {
			System.out.println("Loop number " + i);
		}

	}
}