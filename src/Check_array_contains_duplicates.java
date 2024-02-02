import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Check_array_contains_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=new String[] {"java","python","java","c"};
		List l=Arrays.asList(str);
		Set<String> set=new HashSet<>(l);
		if(set.size()!=l.size()) {
			System.out.println("array contains duplicates");
		}
		else {
			System.out.println("array does not contain duplicates");
		}
		/*
		 * String str[]=new String[] {"java","python","java","c"};
		 * set nonduplicate=new HashSet<>();
		 * set duplicate=new HashSet<>();
		 * for(String string:str){
		 * 	if(!nonduplicate.contains(String){
		 * 		nonduplicate.add(string);
		 * 	}else{
		 * 		duplicate.add(string);
		 * 	}
		 * }
		 * System.out.println(duplicate);
		 */
	}

}
