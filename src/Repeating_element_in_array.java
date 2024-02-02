//it only works for element values which are less than size of array. 
//otherwise we can use duplicate elements program for finding the repeated elements.
public class Repeating_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,2,5,1,6,3};
		int[] temp=new int[arr.length];
		for(int i=0;i<temp.length;i++) {
			if(temp[arr[i]]==1) {
				System.out.println(arr[i]);
			}
			else {
				temp[arr[i]]++;
			}
		}
	}

}
