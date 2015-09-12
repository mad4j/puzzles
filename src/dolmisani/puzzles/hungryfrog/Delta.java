package dolmisani.puzzles.hungryfrog;

public class Delta {
	
	private int dx;
	private int dy;
	
	public Delta(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}
	
	public int getDx() {
		return dx;
	}
	
	public int getDy() {
		return dy;
	}

	@Override
	public String toString() {
		return String.format("(%d, %d)", dx, dy);
	}
}
