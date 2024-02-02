
public class Duplicate_occurence_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,7,1,5,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					return;
				}
			}
		}
	}

}
