import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Difference_between_two_dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime d1=LocalDateTime.of(2020, 12,1,11,20,20);
		LocalDateTime d2=LocalDateTime.of(2019, 12,1,11,20,20);
		Duration d=Duration.between(d2, d1);
		System.out.println(d.getSeconds());
		
		LocalDate d3=LocalDate.of(2020, 12,1);
		LocalDate d4=LocalDate.of(2019, 12,1);
		Period p=Period.between(d4, d3);
		System.out.println(p.getDays());
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
	}

}
