package dolmisani.puzzles.hungryfrog;

import java.util.Arrays;
import java.util.List;

public class Constants {

	public static final List<Delta> HUNGRY_FROG = Arrays.asList(
			new Delta(+3, +0),
			new Delta(+2, +2),
			new Delta(+0, +3),
			new Delta(-2, +2),
			new Delta(-3, +0),
			new Delta(-2, -2),
			new Delta(+0, -3),
			new Delta(+2, -2)
		);
	
	public static final List<Delta> CHESS_KNIGHT = Arrays.asList(
			new Delta(+2, -1),
			new Delta(+2, +1),
			new Delta(-2, +1),
			new Delta(-2, -1),
			new Delta(+1, +2),
			new Delta(+1, -2),
			new Delta(-1, +2),
			new Delta(-1, -2)
		);

}
