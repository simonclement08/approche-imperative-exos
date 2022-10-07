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
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifTableMult")
public class Ex17_InteractifTableMult {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Veuillez saisir un nombre : ");
		int nb = scanner.nextInt();
		while (nb < 1 || nb > 10) {
			nb = scanner.nextInt();
		}
		for (int i = 1; i <= 10; i++) {
			Resultat.log(nb + "*" + i + "=" + nb*i);
		}
		
		scanner.close();
	}

}
