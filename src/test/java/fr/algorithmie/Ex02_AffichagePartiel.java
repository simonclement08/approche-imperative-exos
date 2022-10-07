package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="AffichagePartiel")
public class Ex02_AffichagePartiel {

	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	@Test
	@Question(numero=1)
	public void affichageValeursSup3() {
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 3) {
				Resultat.log(array[i]);
			}
		}
	}
	
	@Test
	@Question(numero=2)
	public void affichageValeursPaires() {
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 == 0) {
				Resultat.log(array[i]);
			}
		}
	}
	
	@Test
	@Question(numero=3)
	public void affichageIndexPairs() {
		for (int i = 0; i < array.length; i++) {
			if (i%2 == 0) {
				Resultat.log(array[i]);
			}
		}
	}
	
	@Test
	@Question(numero=4)
	public void affichageValeursImpaires() {
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 == 1) { // Remplacer array[i]%2 par Math.abs(array[i]%2) pour prendre en compte les valeurs négatifs
				Resultat.log(array[i]);
			}
		}
	}
}
