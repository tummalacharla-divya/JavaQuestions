import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Convert_Arrays_to_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] color= {"red","green","blue"};
		//System.out.println(Arrays.asList(color));
		List<String> l=new ArrayList<>();
		//Collections.addAll(l, color);
		//System.out.println(l);
		for(String string:color) {
			l.add(string);
		}
		System.out.println(l);
	}

}
