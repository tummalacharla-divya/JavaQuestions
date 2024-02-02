import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
	public static void main(String[] args) {
	
		//int[] arr= {1,2,3,4,5};
		//int ele=3;
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int ele=sc.nextInt();
		System.out.println(removeElement(arr,ele));
	}
	public static String removeElement(int[] arr,int element) {
		int[] arr1=new int[arr.length-1];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=element) {
				arr1[index++]=arr[i];
				
			}
		}
		return Arrays.toString(arr1);
	}
}
