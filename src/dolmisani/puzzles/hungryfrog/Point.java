package dolmisani.puzzles.hungryfrog;

import java.util.List;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this(0, 0);
	}
	
	public Point(Point p) {
		this(p.x, p.y);
	}
		
	public Point moveBy(Delta m) {
		return new Point(x+m.getDx(), y+m.getDy());
	}
	
	public Point moveTo(Point p) {
		return new Point(p.x, p.y);
	}
		
	public boolean isInside(int x1, int y1, int x2, int y2) {
		return (x>=x1) && (x<x2) && (y>=y1) && (y<y2);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getDegree(final Board board, final List<Delta> moves) {
		
		return (int)moves.stream()
			.map(m -> this.moveBy(m))
			.filter(t -> board.contains(t) && board.isEmpty(t))
			.count();
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
}
