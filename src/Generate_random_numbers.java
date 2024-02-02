import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//Math.random()
//ThreadLocalRandom class
//java.util.Random class
public class Generate_random_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.random());
		//System.out.println(ThreadLocalRandom.current().nextBoolean());
		//System.out.println(ThreadLocalRandom.current().nextInt());
		//System.out.println(ThreadLocalRandom.current().nextDouble());
		Random random=new Random();
		System.out.println(random.nextInt(100,150));
		System.out.println(random.nextDouble(500));
		System.out.println(random.nextBoolean());
	}

}
