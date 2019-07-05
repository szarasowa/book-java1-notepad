// Exercise_3_9.java

class Exercise_3_9 {
 public static void main(String args[]) {
	for(int i = 1; i < 1000; i += i) {
		if(i != 512) {
		 System.out.print(i + ", ");
		} else System.out.print(i);
	}
 }
}
