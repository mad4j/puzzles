package dolmisani.puzzles;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.time.Month.*;

/**
 * Cheryl's Birthday problem.
 * 
 * Albert and Bernard have just met Cheryl. 
 * “When is your birthday?” Albert asked Cheryl. 
 * Cheryl thought for a moment and said, “I won’t tell you, but I’ll give you some clues”. 
 * She wrote down a list of ten dates:
 *  <li> May 15, May 16, May 19
 *  <li> June 17, June 18
 *  <li> July 14, July 16
 *  <lI> August 14, August 15, August 17
 *  
 *  “One of these is my birthday” she said.
 *  Cheryl whispered in Albert’s ear the month, and only the month, of her birthday. 
 *  To Bernard, she whispered the day, and only the day. 
 *  “Can you figure it out now?” she asked Albert.
 *  
 *  Albert: “I don’t know when your birthday is, but I know Bernard doesn’t know, either.”
 *  
 *  Bernard: “I didn’t know originally, but now I do.”
 *  
 *  Albert: “Well, now I know, too!”
 *  
 *  When is Cheryl’s birthday?
 *  
 *  See also:
 *  <li> https://github.com/fj/cheryls-birthday-prolog
 *  <li> https://github.com/perng/prolog_collection/blob/master/cheryls_birthday.pl
 *  <li> http://www.nytimes.com/2015/04/15/science/answer-to-the-singapore-math-problem-cheryl-birthday.html
 *
 */
public class CherylBirthday {

	/**
	 * list of Cheryl's candidate dates
	 */
	private static final List<LocalDate> DATES = Arrays.asList(
			d(MAY, 15), d(MAY, 16), d(MAY, 19),
			d(JUNE, 17), d(JUNE, 18),
			d(JULY, 14), d(JULY, 16),
			d(AUGUST, 14), d(AUGUST, 15), d(AUGUST, 17)
	);
	
	
	/**
	 * Convenience method for easily building a new LocalData object.
	 * In order to simplify code, using 1990 as default year.
	 */
	private static LocalDate d(Month m, int d) {
		
		return LocalDate.of(1990, m, d);
	}
	
	/**
	 * Predicate for filtering a Stream<LocalData> for a given month.
	 */
	public static Predicate<LocalDate> by(Month m) {
		
		return x -> x.getMonth().equals(m);
	}
	
	/**
	 * Predicate for filtering a Stream<LocalData> for a given day of month.
	 */
	public static Predicate<LocalDate> by(int d) {
		
		return x -> x.getDayOfMonth() == d;
	}
	
	/**
	 * Predicate for filtering a Stream<LocalData> for elements with unique
	 * day of month within a given set of dates.
	 */
	public static Predicate<LocalDate> isDayUniqueWithin(List<LocalDate> dates) {
		
		return x -> dates.stream()
				.filter(by(x.getDayOfMonth()))
				.count() == 1;
	}
	
	/**
	 * Predicate for filtering a Stream<LocalData> for elements with unique
	 * month within a given set of dates.
	 */
	public static Predicate<LocalDate> isMonthUniqueWithin(List<LocalDate> dates) {
		
		return x -> dates.stream()
				.filter(by(x.getMonth()))
				.count() == 1;
	}
	
	/**
	 * Predicate for filtering a Stream<LocalData> for elements with month
	 * value associated with a unique day of month within a given set of dates.
	 */
	public static Predicate<LocalDate> isMonthWithUniqueDayWithin(List<LocalDate> dates) {
		
		return x -> dates.stream()
				.filter(isDayUniqueWithin(dates))
				.filter(by(x.getMonth()))
				.count() == 1;
	}
	
	
	/**
	 * Solve the Cheryl's Birthday problem.
	 */
	public static void main(String[] args) {
		
		//filter candidate dates using first sentence
		List<LocalDate> result1 = DATES.stream()
				//Albert doesn't know the solution
				.filter(isMonthUniqueWithin(DATES).negate())
				//Bernard doesn't know the solution, too
				.filter(isMonthWithUniqueDayWithin(DATES).negate())
				.collect(Collectors.toList());
		
		//filter candidate dates using second sentence
		List<LocalDate> result2 = result1.stream()
				//Bernard now knows the solution
				.filter(isDayUniqueWithin(result1))
				.collect(Collectors.toList());
		
		//filter candidate dates using last sentence
		List<LocalDate> result3 = result2.stream()
				//Albert now knows the solution, too
				.filter(isMonthUniqueWithin(result2))
				.collect(Collectors.toList());
		
		System.out.println("Starting candidate dates:");
		System.out.println(DATES);
		
		System.out.println("\nCadidate dates after first sentence:");
		System.out.println(result1);
		
		System.out.println("\nCadidate dates after second sentence:");
		System.out.println(result2);
		
		System.out.println("\nCadidate dates after last sentence:");
		System.out.println(result3);
	}	
}
