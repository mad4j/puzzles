package dolmisani.puzzles;

import java.time.MonthDay;
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
 * â€œWhen is your birthday?â€� Albert asked Cheryl. 
 * Cheryl thought for a moment and said, â€œI wonâ€™t tell you, but Iâ€™ll give you some cluesâ€�. 
 * She wrote down a list of ten dates:
 *  <li> May 15, May 16, May 19
 *  <li> June 17, June 18
 *  <li> July 14, July 16
 *  <li> August 14, August 15, August 17
 *  
 *  â€œOne of these is my birthdayâ€� she said.
 *  Cheryl whispered in Albertâ€™s ear the month, and only the month, of her birthday. 
 *  To Bernard, she whispered the day, and only the day. 
 *  â€œCan you figure it out now?â€� she asked Albert.
 *  
 *  Albert: â€œI donâ€™t know when your birthday is, but I know Bernard doesnâ€™t know, either.â€�
 *  
 *  Bernard: â€œI didnâ€™t know originally, but now I do.â€�
 *  
 *  Albert: â€œWell, now I know, too!â€�
 *  
 *  When is Cherylâ€™s birthday?
 *  
 *  See also:
 *  <li> https://github.com/fj/cheryls-birthday-prolog
 *  <li> https://github.com/perng/prolog_collection/blob/master/cheryls_birthday.pl
 *  <li> http://www.nytimes.com/2015/04/15/science/answer-to-the-singapore-math-problem-cheryl-birthday.html
 *
 */
public class CherylBirthday {
	
	private static Predicate<MonthDay> byMonth(Month month) {
		return x -> x.getMonth().equals(month);
	}

	private static Predicate<MonthDay> byDay(int day) {
		return x -> x.getDayOfMonth() == day;
	}
	
	private static Predicate<MonthDay> isDayUniqueWithin(List<MonthDay> dates) {
		return x -> dates.stream()
				.filter(byDay(x.getDayOfMonth()))
				.count() == 1;
	}
	
	private static Predicate<MonthDay> isMonthUniqueWithin(List<MonthDay> dates) {
		return x -> dates.stream()
				.filter(byMonth(x.getMonth()))
				.count() == 1;
	}
	
	private static Predicate<MonthDay> isMonthWithUniqueDayWithin(List<MonthDay> dates) {
		return x -> dates.stream()
				.filter(isDayUniqueWithin(dates))
				.filter(byMonth(x.getMonth()))
				.count() == 1;
	}
	
	public static void main(String[] args) {
		List<MonthDay> possibleBirthdays = Arrays.asList(
			MonthDay.of(MAY, 15), MonthDay.of(MAY, 16), MonthDay.of(MAY, 19),
			MonthDay.of(JUNE, 17), MonthDay.of(JUNE, 18),
			MonthDay.of(JULY, 14), MonthDay.of(JULY, 16),
			MonthDay.of(AUGUST, 14), MonthDay.of(AUGUST, 15), MonthDay.of(AUGUST, 17)
		);
		
		System.out.println("Starting candidate dates:");
		System.out.println(possibleBirthdays);
		
		//filter candidate dates using first sentence
		possibleBirthdays = possibleBirthdays.stream()
				//Albert doesn't know the solution
				.filter(isMonthUniqueWithin(possibleBirthdays).negate())
				//Bernard doesn't know the solution, either
				.filter(isMonthWithUniqueDayWithin(possibleBirthdays).negate())
				.collect(Collectors.toList());
		
		System.out.println("\nCandidate dates after first sentence:");
		System.out.println(possibleBirthdays);
		
		//filter candidate dates using second sentence
		possibleBirthdays = possibleBirthdays.stream()
				//Bernard now knows the solution
				.filter(isDayUniqueWithin(possibleBirthdays))
				.collect(Collectors.toList());
				
		System.out.println("\nCandidate dates after second sentence:");
		System.out.println(possibleBirthdays);
		
		//filter candidate dates using last sentence
		possibleBirthdays = possibleBirthdays.stream()
				//Albert now knows the solution, too
				.filter(isMonthUniqueWithin(possibleBirthdays))
				.collect(Collectors.toList());
		
		System.out.println("\nCandidate dates after last sentence:");
		System.out.println(possibleBirthdays);
	}	
}
