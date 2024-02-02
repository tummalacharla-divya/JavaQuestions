import java.util.ArrayList;
import java.util.Collections;

public class Swap_elements_in_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<>();
		l.add(2);
		l.add(1);
		l.add(3);
		Collections.swap(l, 0, 1);
		System.out.println(l);
	}

}
