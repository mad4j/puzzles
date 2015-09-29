
package dolmisani.puzzles.numbers;

public class NumberToWord {

	public static String convert(int n) {

		return (n == 0) ? "zero" : buildWord(n);
	}

	private static String buildWord(int n) {

		if (n < 0) {
			return "meno " + buildWord(-n);
		} else if (n == 0) {
			return "";
		} else if (n <= 19) {
			return new String[] { 
					"uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove", "dieci",
					"undici", "dodici", "tredici", "quattordici", "quindici", "sedici", "diciassette", "diciotto",
					"diciannove" }[n - 1];
		} else if (n <= 99) {
			String[] vettore = { 
					"venti", "trenta", "quaranta", "cinquanta", "sessanta", "settanta", "ottanta", "novanta" };
			String letter = vettore[n / 10 - 2];
			int t = n % 10; // t è la prima cifra di n
			// se è 1 o 8 va tolta la vocale finale di letter
			if (t == 1 || t == 8) {
				letter = letter.substring(0, letter.length() - 1);
			}
			return letter + buildWord(n % 10);
		} else if (n <= 199) {
			return "cento" + buildWord(n % 100);
		} else if (n <= 999) {
			int m = n % 100;
			m /= 10; // divisione intera per 10 della variabile
			String letter = "cent";
			if (m != 8) {
				letter = letter + "o";
			}
			return buildWord(n / 100) + letter + buildWord(n % 100);
		} else if (n <= 1999) {
			return "mille" + buildWord(n % 1000);
		} else if (n <= 999999) {
			return buildWord(n / 1000) + "mila" + buildWord(n % 1000);
		} else if (n <= 1999999) {
			return "unmilione" + buildWord(n % 1000000);
		} else if (n <= 999999999) {
			return buildWord(n / 1000000) + "milioni" + buildWord(n % 1000000);
		} else if (n <= 1999999999) {
			return "unmiliardo" + buildWord(n % 1000000000);
		} else {
			return buildWord(n / 1000000000) + "miliardi" + buildWord(n % 1000000000);
		}
	}

	public static int maxWordLength(int n) {
		
		int max = 0;
		for (int i=0; i<=n; i++) {
			int l = NumberToWord.convert(i).length();
			if (l>max) {
				max = l;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		int MAX_VALUE = 100;
		
		
		for (int i=1; i<=MAX_VALUE; i++) {
			
			String s = NumberToWord.convert(i);
			int l = s.length();
			
			if (i % l == 0) {
				System.out.format("| %3d | %-16s | %2d |\n", i, s, i/l);
			}
		}
		
	}

}
