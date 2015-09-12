package dolmisani.puzzles.hungryfrog;

import java.util.List;

public interface Resolver {

	public Board resolve(
			final Point start, 
			final int boardWidth,
			final int boardHeight, 
			final List<Delta> moves);

}
