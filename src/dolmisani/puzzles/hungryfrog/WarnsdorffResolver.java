package dolmisani.puzzles.hungryfrog;


import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class WarnsdorffResolver implements Resolver {

	private final static Logger LOGGER = Logger.getLogger(WarnsdorffResolver.class.getName()); 
	
	public WarnsdorffResolver() {
		//no implementation
	}
	
	@Override
	public Board resolve(final Point start, final int boardWidth, final int boardHeight, final List<Delta> moves) {
	
		assert (boardWidth > 0);
		assert (boardHeight > 0);
		assert (start.isInside(0, 0, boardWidth, boardHeight));
		assert (moves != null && moves.size() >= 0);
		
		Board board = new Board(boardWidth, boardHeight);
		Point point = new Point(start);
		
		int index = 1;		
		while (point != null) {

			board.setCell(point, index++);
			
			LOGGER.info(String.format("Iteration #%d", index));
			LOGGER.info(String.format("Moving to %s", point));
			
			final Point v = point;
			List<Point> targets = moves.stream()	
					.map(m -> v.moveBy(m))
					.filter(t -> board.contains(t) && board.isEmpty(t))
					.collect(Collectors.toList());
			
			LOGGER.info(String.format("targets from %s --> %s", point, targets));
			
			point = targets.stream()
					.min(Comparator.comparing(i -> i.getDegree(board, moves)))
					.orElse(null);
		}
		
		LOGGER.info(String.format("FINISHED:\n%s", board));
		
		return board;
	}
}
