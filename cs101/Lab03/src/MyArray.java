import java.util.ArrayList;

/**
 * a class having special functions for arrays
 * @author Arman Engin SUCU
 * @version 20.05.2020
 */

public class MyArray {
	// properties
	private int[] array;

	// constructors
	
	// default constructor
	public MyArray() {
		array = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	}

	public MyArray(int length) {
		array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = (int) (Math.random() * length + 1);
		}
		System.out.println("Rnadom array has been created.");
	}

	// an inner class to return two variables in the isBalanced method
	public class TwoVariables {
		private boolean isBalanced;
		private int indexOfLast;

		public TwoVariables(boolean isBalanced, int indexOfLast) {
			this.isBalanced = isBalanced;
			this.indexOfLast = indexOfLast;
		}

		public boolean getIsBalanced() {
			return isBalanced;
		}

		public int getIndexOfLast() {
			return indexOfLast;
		}

		public void setBalanced(boolean isBalanced) {
			this.isBalanced = isBalanced;
		}

		public void setIndexOfLast(int indexOfLast) {
			this.indexOfLast = indexOfLast;
		}

	}

//methods
	/**
	 * gets the array
	 * 
	 * @return the array
	 */
	public int[] getArray() {
		return array;
	}

	/**
	 * sets the array
	 * @param array which is the new instance data member
	 */
	public void setArray(int[] array) {
		int count = 0;
		boolean isEmpty = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count++;
			}
		}
		if (count == array.length) {
			isEmpty = true;
		}
		if (array == null) {
			isEmpty = true;
		}

		if (!isEmpty && this.array.length == array.length) {
			this.array = array;
		} else if (!isEmpty) {
			this.array = new int[array.length];
			for (int i = 0; i < array.length; i++) {
				this.array[i] = array[i];
			}
		}
		System.out.println("The array has been set.");
	}

	/**
	 * finds the lucky number in the array
	 * 
	 * @return the biggest lucky number or there is not -1
	 */
	public int findLucky() {
		int result = -1;
		for (int i = 0; i < array.length; i++) {
			int tempCount = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					tempCount++;
				}
			}
			if (tempCount == array[i] && array[i] > result) {
				result = array[i];
			}
		}
		return result;
	}

	/**
	 * determines whether the array is balanced
	 * 
	 * @return object type which has the values of boolean and integer
	 */
	public TwoVariables isBalanced() {
		boolean isBalanced = false;
		int indexOfLast = -1;
		int tempCount = 0;
		int sum = 0;
		TwoVariables result = new TwoVariables(isBalanced, indexOfLast);
		for (int i = 0; i < this.array.length; i++) {
			sum += this.array[i];
		}
		for (int i = 0; i < this.array.length; i++) {
			tempCount += this.array[i];
			if (tempCount == (sum - tempCount)) {
				isBalanced = true;
				indexOfLast = i;
				result.setBalanced(isBalanced);
				result.setIndexOfLast(indexOfLast);
			}
		}
		return result;
	}

	/**
	 * merges an integer array to the instance member
	 * 
	 * @param array the array to merge it to the instance data member
	 */
	public void merge(int[] array) {
		int count = 0;
		int[] merge = new int[array.length + this.array.length];
		for (int i = 0; i < merge.length; i++) {
			if (count < this.array.length) {
				merge[i] = this.array[i];
			} else
				merge[i] = array[i - this.array.length];
			count++;
		}
		this.array = new int[array.length + this.array.length];
		this.array = merge;
		System.out.println("The arrays have been merged.");
	}

	/**
	 * changes the indices of the values randomly
	 */
	public void randomize() {
		int index = 0;
		int[] array = new int[this.array.length];
		ArrayList<Integer> list = new ArrayList<Integer>();

		// adding the indexes to the ArrayList
		for (int i = 0; i < this.array.length; i++) {
			list.add(i);
		}
		for (int i = 0; i < this.array.length; i++) {
			int random = (int) (Math.random() * (list.size()));
			index = list.get(random);
			array[i] = this.array[index];
			list.remove(random);
		}
		this.array = array;
		System.out.println("The array has been randomized.");
	}

	/**
	 * sorts numbers in the array from small to large
	 */
	public void sort() {
		int temp;
		for (int j = 0; j < this.array.length; j++) {
			for (int i = 0; i < this.array.length - 1; i++) {
				if (this.array[i] > this.array[i + 1]) {
					temp = this.array[i];
					this.array[i] = this.array[i + 1];
					this.array[i + 1] = temp;
				}
			}
		}
		System.out.println("The array has been sorted.");
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		String result = "[ ";
		for(int i = 0; i < array.length-1 ; i++) {
			result += array[i] + ", ";
		}
		result += array[array.length-1] + " ]";
		return result;
	}
}
