package corejava_package;

public class Javaforloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
			}
	
		for (int j = 0; j <= 10; j = j + 2) {
			  System.out.println(j);
			}
		//nested loop
		for (int i = 1; i <= 2; i++) {
			  System.out.println("Outer: " + i); // Executes 2 times
			  
			  // Inner loop
			  for (int j = 1; j <= 3; j++) {
			    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
			  }
			}
	}

}
