import java.util.Scanner;

public class JeuPendu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * tant que le mot saisi à la console
		 * n'a pas au moins cinq caractères
		 * alors le maitre du jeu recommence sa saisie d'un mot
		 *       d'au moins cinq caractères à la console
		 */
		
		int lngIn = 0;
		while (lngIn < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Saisir un mot de cinq caractères : ");
			String strIn = sc.nextLine();
			lngIn = strIn.length();															// longueur du mot saisi 
			
			/*
			 * si le mot est supérieur à cinq lettres alors :
			 * ----------------------------------------------
			 * 1) le mot est tronqué à cinq caractères
			 * 2) le mot de cinq lettres est convertie en majuscules
			 * 3) le mot de cinq lettres est affiché
			 * 4) le mot est masqué par 8 sauts de ligne 
			 */
			if (lngIn > 4) {
				strIn = strIn.substring(0,5);
				strIn = strIn.toUpperCase();
				System.out.println("votre mot de 5 lettres saisi est : " + strIn);
				for (int i = 1; i < 10; i++) {
					System.out.println();
				}
			}
			
			String strOut = "-----";														// initialisation du mot recherché
			System.out.println(strOut);
			
			for (int i = 0; i < 11; i++) {													// boucle de dix essais pour rechercher le mot mystère
				
				int lngRc = 0;																// longueur du caractère recherché
				while (lngRc == 1) {
					System.out.print("Saisir un caractère : ");
					String strRech = sc.nextLine();
					strRech = strRech.toUpperCase();
					System.out.println(strRech);
				}
				
				/*
				 *  boucle de comparaison des cinq lettres du mot mystère du maitre du jeu
				 *  avec la lettre de recherche du joueur
				 */
				for (int j = 0; j < 6; j++) { 
					char a = strIn.charAt(j);
					System.out.println("a : " + a);
		/*				strOut.charAt(j) = strIn.charAt(j); */
	
				}
			}
			
			/* RESULTAT DU JEU DU PENDU au bout des dix essais
			 * 
			 * si dans la chaine de caractère de recherche
			 *    du mot en cinq lettres strOut contient au moins 
			 *    un caractère de type "-"
			 * alors
			 *    la partie est perdue
			 * sinon
			 *    la partie est gagnée
			 * fin si
			 */
			char trait = '-';
			boolean trouve = (strOut.indexOf(trait) != -1);
			if (trouve) {
				System.out.println(" ( ) ");
				System.out.println("  O  ");
				System.out.println(" -|- ");
				System.out.println(" | | ");
				System.out.println("Game Over");
			} else {
				System.out.println("Winner of the Day"); 
			}
		}
	}

}
