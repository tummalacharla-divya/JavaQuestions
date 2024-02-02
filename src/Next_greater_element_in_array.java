
public class Next_greater_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,8,4,9,10,26};
		int ele=8;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele+1) {
				System.out.println(arr[i]);
			}
		}
		
		printNext(arr);
		
	}

	private static void printNext(int[] arr) {
		// TODO Auto-generated method stub
		int next,i,j;
		for(i=0;i<arr.length;i++) {
			next=-1;
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					next=arr[j];
					break;
				}
			}
			System.out.println(arr[i]+","+next);
		}
	}

}
