import java.util.Random;

public class PermutationABCFisherYatesShuffle {

	public static void main(String[] args) {
		char letters [] = {'a', 'b', 'c'};

		printArray(permutationFisherYates(letters));

	}

	public static char[] permutationFisherYates(char[] letters) {
		for (int i=letters.length-1; i>0; i--) {
			int random = getRandom(i);
			char temp = letters[i];
			letters[i] = letters[random];
			letters[random] = temp;
		}
		return letters;
	}

	public static int getRandom(int i) {
		Random rnd = new Random();
		int random = rnd.nextInt(i+1);
		return random;
	}

	public static void printArray (char [] letters) {
		for (int i=0; i<letters.length; i++) {
			System.out.print(letters[i] + " ");
		}
	}

}
