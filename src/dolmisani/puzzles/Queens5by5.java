package dolmisani.puzzles;

public class Queens5by5 {

	private static void showCombination(int[] s) {
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + " ");
		System.out.println();
	}

	public static void generate(int[] s, int position, int nextInt, int k, int N) {
		if (position == k) {
			showCombination(s);
			return;
		}
		for (int i = nextInt; i < N; i++) {
			s[position] = i;
			generate(s, position + 1, i + 1, k, N);
		}
	}

	public static void main(String[] args) {
		int N = 25;
		int k = 5;

		int[] s = new int[k];
		generate(s, 0, 0, k, N);
	}

}
