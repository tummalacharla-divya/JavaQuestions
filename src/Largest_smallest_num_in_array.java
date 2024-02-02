
public class Largest_smallest_num_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,5,8,4,9};
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int i:nums) {
			if(i<smallest) {
				smallest=i;
			}
			else {
				largest=i;
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}
