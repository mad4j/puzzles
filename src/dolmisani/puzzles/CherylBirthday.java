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
 * “When is your birthday?” Albert asked Cheryl. 
 * Cheryl thought for a moment and said, “I won’t tell you, but I’ll give you some clues”. 
 * She wrote down a list of ten dates:
 *  <li> May 15, May 16, May 19
 *  <li> June 17, June 18
 *  <li> July 14, July 16
 *  <li> August 14, August 15, August 17
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
			MonthDay(MAY, 15), MonthDay(MAY, 16), MonthDay(MAY, 19),
			MonthDay(JUNE, 17), MonthDay(JUNE, 18),
			MonthDay(JULY, 14), MonthDay(JULY, 16),
			MonthDay(AUGUST, 14), MonthDay(AUGUST, 15), MonthDay(AUGUST, 17)
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
