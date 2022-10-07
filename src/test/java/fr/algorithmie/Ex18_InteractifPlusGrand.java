package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		int[] userNb = new int[10];
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Veuillez saisir dix nombre : ");
		for (int i = 0; i < userNb.length; i++) {
			int nb = scanner.nextInt();
			userNb[i] = nb;
			Resultat.log(nb);
		}
		int max = userNb[0];
		for (int i = 1; i < userNb.length; i++) {
			if(userNb[i] > max) {
				max = userNb[i];
			}
		}
		Resultat.log(max);
		
		scanner.close();
	}

}
