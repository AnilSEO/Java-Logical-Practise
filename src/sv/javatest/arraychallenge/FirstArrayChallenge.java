/**
 * $$$$$$$$$$$$$$ Problem Statement $$$$$$$$$$$$$$$$$
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

package sv.javatest.arraychallenge;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author svishwakarma
 *
 */
public class FirstArrayChallenge {

	public FirstArrayChallenge() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int[] numbers = new int[]{2,7,11,15};
		int target = 9;
		System.out.println("Given number array: "+ Arrays.toString(numbers));
		System.out.println("Target to find: "+target);
		
		System.out.println();
		
		System.out.print("Indexes of numbers which are summedup to find the target: ");
		FirstArrayChallenge test = new FirstArrayChallenge();
		System.out.println(Arrays.toString(test.findIndecesOfTwoNumbers(numbers,target)));
		
	}
	
	
	public int[] findIndecesOfTwoNumbers(int[] numbers, int target) {
		int[] indexesOfNumbers = new int[2];
		
		//Map contains index of each element in numbers array 
		HashMap<Integer, Integer> indexesMap = new HashMap<>(); 
		
		for(int index = 0 ; index < numbers.length - 1; index ++ ) {
			if(!indexesMap.containsKey(numbers[index])) {
				indexesMap.put(numbers[index], index);
			} else if(numbers[index] * 2 == target) { 
				//Duplicates can not be solution unless twice of it becomes target
				indexesOfNumbers[0] = indexesMap.get(numbers[index]);
				indexesOfNumbers[1] = index;
				return indexesOfNumbers;
			}
		}
		
		
		//sorting numbers array elements
		Arrays.sort(numbers);
		
		int i = 0;
		int j = numbers.length -1; 
		
		//Finding indexes of numbers which can be summed of to find the target
		while(i < j) {
			if(numbers[i] + numbers[j] > target) {
				j--;
			} else if(numbers[i] + numbers[j] < target) {
				i++;
			} else {
				indexesOfNumbers[0] = indexesMap.get(numbers[i]);
				indexesOfNumbers[1] = indexesMap.get(numbers[j]);
				
				if(indexesOfNumbers[0] > indexesOfNumbers[1]) {
					int tempIndex = indexesOfNumbers[0];
					indexesOfNumbers[0] = indexesOfNumbers[1];
					indexesOfNumbers[1] = tempIndex;
				}
				
				return indexesOfNumbers;
			}
		}
		
		return indexesOfNumbers;
	}
}
