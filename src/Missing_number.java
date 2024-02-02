import java.util.HashSet;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,6,3,4,6};
		missing(a);
	}
	public static void missing(int[] a) {
		HashSet<Integer> set=new HashSet<Integer>();
		for(int num:a) {
			set.add(num);
			
		}
		int n=a.length+1;
		for(int i=0;i<n;i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
