
public class Square_sorted_array_of_positive_negative_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-6,-1,2,4,6};
		int[] squarearr=squareArray(arr);
		for(int i=0;i<squarearr.length;i++) {
			System.out.println(squarearr[i]);
		}
	}

	private static int[] squareArray(int[] arr) {
		// TODO Auto-generated method stub\\
		int squarearr1[]=new int[arr.length];
		int start=0;
		int end=arr.length-1;
		int sq=arr.length-1;
		while(start<=end) {
			if(arr[start]*arr[start]>arr[end]*arr[end]) {
				squarearr1[sq--]=arr[start]*arr[start];
				start++;
			}else {
				squarearr1[sq--]=arr[end]*arr[end];
				end--;
			}
		}
		return squarearr1;
	}

}
