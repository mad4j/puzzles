package dolmisani.puzzles.hungryfrog;

public class Board {

	private static final int EMPTY = 0;
	
	private int[][] cells;
	
	private int width;
	private int height;
	
	public Board(int width, int height) {
		
		this.width = width;
		this.height = height;
		
		this.cells = new int[width][height];
	}
	
	public boolean contains(Point p) {
		return p.isInside(0, 0, width, height);
	}
	
	public boolean isEmpty(Point p) {
		return (cells[p.getX()][p.getY()] == EMPTY);
	}
	
	public int getCell(Point p) {
		return cells[p.getX()][p.getY()];
	}
		
	public void setCell(Point p, int value) {
		cells[p.getX()][p.getY()] = value;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for (int y=0; y<height; y++) {
			for ( int x=0; x<width; x++) {
				
				if (cells[x][y] == EMPTY) {
					sb.append(" ...");
				} else {
					sb.append(String.format(" %3d", cells[x][y]));
				}
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
