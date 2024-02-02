import java.util.Arrays;
import java.util.Scanner;

public class Insert_element_at_specific_position_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		System.out.println("enter elements: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter index you want to insert:");
		int index=sc.nextInt();
		System.out.println("enter value you want to insert:");
		int value=sc.nextInt();
		
		for(int i=arr.length-1;i>index;i--) {
			arr[i]=arr[i-1];
		}
		arr[index]=value;
		System.out.println("after insertion");
		System.out.println(Arrays.toString(arr));
		
	}
}
