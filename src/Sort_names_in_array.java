import java.util.Arrays;
import java.util.Scanner;

public class Sort_names_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of names");
		n=sc.nextInt();
		String[] name=new String[n];
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter names");
		for(int i=0;i<n;i++) {
			name[i]=sc1.nextLine();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(name[i].compareTo(name[j])>0) {
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(name));
	}

}
