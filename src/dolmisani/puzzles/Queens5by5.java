package dolmisani.puzzles;

import static java.util.Arrays.stream;

import java.util.Arrays;
import java.util.stream.IntStream;


public class Queens5by5 {


	public static void generate(int[] s, int position, int nextInt, int k, int N) {
		
		if (position == k) {
			if (computeAttack(s, 5) == 5) {
				System.out.println(Arrays.toString(s));
			}
			return;
		}
		
		for (int i = nextInt; i < N; i++) {
			s[position] = i;
			generate(s, position + 1, i + 1, k, N);
		}
	}
	
	
	public static boolean isUnderAttack(int c, int q, int size) {
		return ((q%size == c%size) || 
				(q/size == c/size) || 
				((q%size+q/size) == (c%size+c/size)) || 
				((q%size-q/size) == (c%size-c/size)));
	}
	
	
	public static long computeAttack(int[] queens, int size) {
		
		return IntStream.range(0, size*size)
				.boxed()
				.map(i -> stream(queens).anyMatch(q -> isUnderAttack(i, q, size)))
				.filter(c -> !c)
				.count();
	}
	
	public static void main(String[] args) {
		
		int N = 25;
		int k = 3;

		int[] s = new int[k];
		generate(s, 0, 0, k, N);
	}

}
