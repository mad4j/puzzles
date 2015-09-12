package dolmisani.puzzles.hungryfrog;

public class HungryFrogApp {

	public static void main(String[] args) {

		new WarnsdorffResolver().resolve(new Point(0, 0), 10, 10, Constants.HUNGRY_FROG);
		
		//new WarnsdorffResolver().resolve(new Point(0, 0), 8, 8, Constants.CHESS_KNIGHT);

	}

}
