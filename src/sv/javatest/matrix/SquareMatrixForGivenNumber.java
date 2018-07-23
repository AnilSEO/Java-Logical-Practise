/**
 * 
 */
package sv.javatest.matrix;

/**
 * @author svishwakarma
 *
 */
public class SquareMatrixForGivenNumber {

	/**
	 * 
	 */
	public SquareMatrixForGivenNumber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int matrixSize = 4;
		
		SquareMatrixForGivenNumber sq = new SquareMatrixForGivenNumber();
		sq.printInForwardBackwardOrder(matrixSize); 
	}
	
	public void printInForwardBackwardOrder(int matrixSize) {
		for(int i= 1; i <= matrixSize; i++ ) {
			if(i % 2 == 0) {
				for(int j = i*matrixSize, k = 1; k <= matrixSize; k++) {
					System.out.print(j--);
					System.out.print(" ");
				}
			} else {
				for(int j = (i * matrixSize - matrixSize ) + 1, k =1; k <= matrixSize; k++) {
					System.out.print(j++);
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
