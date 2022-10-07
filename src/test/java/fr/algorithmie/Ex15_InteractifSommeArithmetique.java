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
@Exercice(nom="InteractifSommeArithmetique")
public class Ex15_InteractifSommeArithmetique {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Veuillez saisir un nombre : ");
		int nb = scanner.nextInt();
		Resultat.log(nb);
		int sum = 0;
		for (int i=1; i<nb+1; i++) {
			sum += i;
		}
		Resultat.log(sum);
		
		scanner.close();
	}

}
