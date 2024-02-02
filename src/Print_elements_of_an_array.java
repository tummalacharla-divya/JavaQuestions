import java.util.Arrays;

public class Print_elements_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"red","green","blue"};
		int intvalues[]={1,2,3};
		int [][]twod=new int[][] {{1,2,3},{4,5,6}};
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}System.out.println();
		for(String s:str) {
			System.out.print(s+" ");
		}System.out.println();
		System.out.println(Arrays.asList(str)); // it is not working with integer array.
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(intvalues));
		System.out.println(Arrays.deepToString(twod));
		Arrays.asList(str).stream().forEach(s->System.out.println(s));
		Arrays.stream(str).forEach(System.out::println);
	}

}
