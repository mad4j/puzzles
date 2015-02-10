package dolmisani.puzzles;

public class Queens5by5 {

	private static void showCombination(int[] s) {
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + " ");
		System.out.println();
	}

	public static void generate(int[] s, int position, int nextInt, int k, int N) {
		if (position == k) {
			if (computeAttack(s, 5) == 5) {
				showCombination(s);
			}
			return;
		}
		for (int i = nextInt; i < N; i++) {
			s[position] = i;
			generate(s, position + 1, i + 1, k, N);
		}
	}
	
	
	public static boolean attack(int c, int q, int size) {
		return ((q%size == c%size) || 
				(q/size == c/size) || 
				((q%size+q/size) == (c%size+c/size)) || 
				((q%size-q/size) == (c%size-c/size)));
	}
	
	public static int computeAttack(int[] queens, int size) {

		int result = 0;
		int[] board = new int[size*size];
				
		for (int q: queens) {
			for (int c=0; c<board.length; c++) {
			
				if  (attack(c, q, size)) {					
					board[c] = 1;
				}
			}
		}
		
		for (int c=0; c<board.length; c++) {
			if (board[c] == 0) {
				result++;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int N = 25;
		int k = 3;

		int[] s = new int[k];
		generate(s, 0, 0, k, N);
	}

}
