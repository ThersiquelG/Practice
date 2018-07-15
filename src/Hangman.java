import java.util.Scanner;
import java.util.Random ;



public class Hangman {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] guesses = {"reddit", "programming", "fruit", "donut"};
		
		boolean weArePlaying = true;
		while (weArePlaying) {
			System.out.println("La partie commence.");
			char[] randomWordToGuess =  guesses[random.nextInt(guesses.length)].toCharArray(); // mots changés en Char
			int amountOfGuesses = 12 ; // nombres d'essais 
			char[] playerGuess = new char[amountOfGuesses];
			
			
			for (int i = 0; i < playerGuess.length; i++) {
				playerGuess[i] = '_' ;
			}//for 1
			
			
			boolean wordIsGuessed = false ;
			int tries = 0 ;
			
			while (!wordIsGuessed && tries != amountOfGuesses) {
				System.out.print("Lettres trouvées: ");
				printArray(playerGuess);
				System.out.printf("You have %d tries left.\n", amountOfGuesses - tries);
				System.out.println("Entrez un seul charactère");
				char input = scanner.nextLine().charAt(0); // input en char
				tries++;
				if (input == '-') {
					weArePlaying = false;
					wordIsGuessed = true;
				} else {
					for (int i = 0; i < randomWordToGuess.length; i++) {
						if (randomWordToGuess[i] == input) {
							playerGuess[i] = input ;
						}
					}//while2/for
					
							if (isTheWordGuessed(playerGuess)) {
								wordIsGuessed = true ;
								System.out.println("Bien joué c'était mérité.");
							}
						}//sous if
				
					
					
				
			}//while2	
			
			
			if(!wordIsGuessed) System.out.println("Vous n'avez plus de vie :/");
			System.out.println("Voulez vous rejouer ? (oui/non)");
			String anotherGame = scanner.nextLine();
			if (anotherGame.equals("no")) weArePlaying = false;
		}//fin du while
		
		
		
		
		System.out.println("Partie terminée");
 }//main
	public static void printArray(char[]array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}//for 1
		System.out.println();
	}//printArray
	
	public static boolean isTheWordGuessed(char[]array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_') return false;
		}//for 1
		return true;
	}
}

