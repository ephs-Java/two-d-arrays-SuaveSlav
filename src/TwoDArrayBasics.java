import java.util.Random;
public class TwoDArrayBasics {
	
	public static void main(String[] args) {
		int[][] nums = new int[3][5];
		fillRandom(nums, 1 , 6);
		// test each method you create below.
		printArray(nums);
		System.out.println(print(rowSums(nums)));
		System.out.println(isUnique(nums[0]));
		System.out.println(findValue(nums[0], 1));
		System.out.println(minimum(nums));
		System.out.println(maximum(nums));
	}
	
	public static void fillRandom(int[][] nums, int low, int high) {
		Random random = new Random();
		for(int r = 0; r < nums.length; r++) {
			for(int c = 0; c < nums[0].length; c++) {
				nums[r][c] = random.nextInt(high) + low;
			}
		}
	}
	
	public static void printArray(int[][] nums) {
		@SuppressWarnings("unused")
		Random random = new Random();
		for(int r = 0; r < nums.length; r++) {
			for(int c = 0; c < nums[0].length; c++) {
				System.out.print(nums[r][c] + ", ");
			}
			System.out.print("\n");
		}
	}
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int sumRow(int[][] nums, int row) {
		int total = 0;
		for (int c = 0; c < nums[row].length; c++) {
			total += nums[row][c];
		}
		return total;
	}

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	public static int[] rowSums(int[][] nums) {
		int[] sums = new int[nums.length];
		for (int r = 0; r < nums.length; r++) {
			sums[r] = sumRow(nums, r);
		}
		return sums;
	}
	
	public static String print(int[] n) {
		String Return = "";
		for(int r = 0; r < n.length; r++) {
			Return += (n[r] + " ");
		}
		return Return;
	}

	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	public static boolean isUnique(int[] nums) {
		for(int i = 0; i < nums.length;i++) {
			for (int o = 0; o < nums.length;o++) {
				if (i == o) {
					//nothing
				} else if (nums[i] == nums[o]) {
					return false;
				}
			}
		}
		return true;
	}

	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	public static int findValue(int[] nums, int value) {
		for(int i = 0; i < nums.length;i++) {
			if(nums[i] == value) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * return the min value in a 2D array
	 */
	
	public static int minimum(int [][] nums) {
		int min = nums[0][0];
		for(int r = 0; r < nums.length;r++) {
			for(int c = 0; c < nums[0].length; c++) {
				min = Math.min(min, nums[r][c]);
			}
		}
		return min;
	}
	
	
	/*
	 * return the max value in a 2D array
	 */
	
	public static int maximum(int [][] nums) {
		int max = nums[0][0];
		for(int r = 0; r < nums.length;r++) {
			for(int c = 0; c < nums[0].length; c++) {
				max = Math.max(max, nums[r][c]);
			}
		}
		return max;
	}
	
	
	
}
