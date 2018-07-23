/**
 * $$$$$$$$$$$$ Problem Statement $$$$$$$$$$$$$$$
Say you have an array for which the i element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
design an algorithm to find the maximum profit.
Note that you cannot sell a stock before you buy one.

Example 1:
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. 
Not 7-1 = 6, as selling price needs to be larger than buying price.

Example 2:
Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
*/
package sv.javatest.arraychallenge;

import java.util.Arrays;

/**
 * @author svishwakarma
 *
 */
public class SecondArrayChallenge {

	/**
	 * 
	 */
	public SecondArrayChallenge() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] weeklyStockPrice = {7,6,4,3,1};//{7,1,5,3,6,4}; 
		System.out.println("Input: "+ Arrays.toString(weeklyStockPrice));
		SecondArrayChallenge sac = new SecondArrayChallenge();
		System.out.println("Output: "+sac.findMaximumProfitOnWeeklyStock(weeklyStockPrice));
	}
	
	public int findMaximumProfitOnWeeklyStock(int[] weeklyStockPrice) {
		int maxprofit = 0;
		
		for(int i = 0; i < weeklyStockPrice.length -2; i ++) {
			for(int j = i +1; j < weeklyStockPrice.length -1; j++) {
				if(weeklyStockPrice[j] - weeklyStockPrice[i] > maxprofit) {
					maxprofit = weeklyStockPrice[j] - weeklyStockPrice[i];
				}
			}
		}
		
		return maxprofit;
	}

}
