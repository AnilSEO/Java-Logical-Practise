/**
 * 
 */
package sv.javatest.pattern;

/**
 * @author svishwakarma
 *
 */
public class LogicalPattern {

	/**
	 * 
	 */
	public LogicalPattern() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LogicalPattern logicalpattern = new LogicalPattern();
		
		logicalpattern.printNumberPattern1(5);
		
	}
	
	/**
	 * Problem statement:
	 * 5
	 * 45
	 * 345
	 * 2345
	 * 12345
	 */
	public void printNumberPattern1(int number) {
		//Outer loop for iterating till number times 
		for (int counter = 0; counter < number ; counter++ ) {
			//Inner loop for iterating and printing number pattern 
			for(int printNumber = number-counter ; printNumber <= number ; printNumber++ ) {
				System.out.print(printNumber);
			}
			
			//Moving to next line and incrementing count   
			System.out.println();
		}
		
	}
	
	
	

}
