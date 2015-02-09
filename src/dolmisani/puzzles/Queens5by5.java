package dolmisani.puzzles;

public class Queens5by5 {

	private static void showCombination(int[] s) {
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + " ");
		System.out.println();
	}

	public static void generate(int[] s, int position, int nextInt, int k, int N) {
		if (position == k) {
			if (computeAttack(s, 5) == 3) {
				showCombination(s);
			}
			return;
		}
		for (int i = nextInt; i < N; i++) {
			s[position] = i;
			generate(s, position + 1, i + 1, k, N);
		}
	}
	
	
	public static int computeAttack(int[] queens, int size) {
		
		int result = 0;
		int[][] board = new int[size][size];
		
		for (int q=0; q<queens.length; q++) {
			
			int x = queens[q] / 5;
			int y = queens[q] % 5;
			
			for (int i=0; i<size; i++) {
				for (int j=0; j<size; j++) {
					if ((x==i) || (y==j)|| ((x+y)==(i+j)) || ((x-y)==(i-j))) {
						board[i][j] = 1;
					}
				}
			}
		}
		
		
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				
				if (board[i][j] == 0) {
					result++;
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int N = 25;
		int k = 5;

		int[] s = new int[k];
		generate(s, 0, 0, k, N);
	}

}
