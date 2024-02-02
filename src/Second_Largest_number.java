import java.util.Arrays;

public class Second_Largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,98,678,8,9};
		Arrays.sort(nums);
		System.out.println(nums[nums.length-2]);
	}

}
