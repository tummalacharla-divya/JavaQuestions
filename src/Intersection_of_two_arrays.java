import java.util.HashSet;

public class Intersection_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4};
		int[] arr2= {2,3,6,7};
		printIntersection(arr1,arr2);
	}

	private static void printIntersection(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		HashSet<Integer> s=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			s.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(s.contains(arr2[i])) {
				System.out.print(arr2[i]+" ");
			}
		}
	}

}
