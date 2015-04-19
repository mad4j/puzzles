package dolmisani.puzzles.cherylbirthday;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.time.Month.*;

public class CherylBirthday {

	private static final List<LocalDate> DATES = Arrays.asList(
			d(MAY, 15), d(MAY, 16), d(MAY, 19),
			d(JUNE, 17), d(JUNE, 18),
			d(JULY, 14), d(JULY, 16),
			d(AUGUST, 14), d(AUGUST, 15), d(AUGUST, 17)
	);
	
	
	private static LocalDate d(Month m, int d) {
		
		return LocalDate.of(1990, m, d);
	}
	
	
	public static Predicate<LocalDate> by(Month m) {
		
		return x -> x.getMonth().equals(m);
	}
	
	
	public static Predicate<LocalDate> by(int d) {
		
		return x -> x.getDayOfMonth() == d;
	}
	
	
	public static Predicate<LocalDate> isDayUniqueWithin(List<LocalDate> dates) {
		
		return x -> dates.stream()
				.filter(by(x.getDayOfMonth()))
				.count() == 1;
	}
	
	
	public static Predicate<LocalDate> isMonthUniqueWithin(List<LocalDate> dates) {
		
		return x -> dates.stream()
				.filter(by(x.getMonth()))
				.count() == 1;
	}
	
	
	public static Predicate<LocalDate> isMonthWithUniqueDayWithin(List<LocalDate> dates) {
		
		return x -> dates.stream()
				.filter(isDayUniqueWithin(DATES))
				.filter(by(x.getMonth()))
				.count() == 1;
	}
	
	
	public static void main(String[] args) {
		
		List<LocalDate> result1 = DATES.stream()
				.filter(isMonthUniqueWithin(DATES).negate())
				.filter(isMonthWithUniqueDayWithin(DATES).negate())
				.collect(Collectors.toList());
		
		List<LocalDate> result2 = result1.stream()
				.filter(isDayUniqueWithin(result1))
				.collect(Collectors.toList());
		
		List<LocalDate> result3 = result2.stream()
				.filter(isMonthUniqueWithin(result2))
				.collect(Collectors.toList());
		
		System.out.println(DATES);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
	
		
}
