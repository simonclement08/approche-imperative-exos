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
@Exercice(nom="InteractifChiffresSuivants")
public class Ex14_InteractifChiffresSuivants {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		// Le scanner permet d'interroger l'utilisateur.
		// Sur Spring Tool Suite vous devez saisir directement dans la Console.
		Scanner scanner = new Scanner(System.in) ;
		
		// Affichage d'un message
		System.out.println("Veuillez saisir un nombre : ");
		
		// Attente d'une saisie par l'utilisateur
		int nb = scanner.nextInt();
		
		for (int i=1; i<11; i++) {
			Resultat.log(nb+i);
		}
		scanner.close();
	}

}
