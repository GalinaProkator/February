import java.util.Random;

public class PermutationABC {

	public static void main(String[] args) {
		char letters [] = {'a', 'b', 'c'};

		permutation (letters);
	}

	public static void permutation (char [] letters) {
		char newArray [] = new char [letters.length];
		int currentCell = 0;

		//		get a random number within a range 0-2
		while (currentCell < 3) {
			int random = getRandom();
			while (isPresentInTheArray(letters[random], newArray)) {
				random = getRandom();
			}
			newArray [currentCell] = letters[random];
			currentCell++;
		}
		printArray(newArray);
	}

	public static boolean isPresentInTheArray (char random, char [] newArray) {
		for (int i=0; i<newArray.length; i++) {
			if (newArray[i] == random) {
				return true;
			}
		}
		return false;
	}

	public static int getRandom() {
		Random rnd = new Random();
		int random = rnd.nextInt(3);
		return random;
	}

	public static void printArray (char [] newArray) {
		for (int i=0; i<newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}


}
