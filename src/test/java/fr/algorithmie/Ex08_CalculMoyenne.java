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
@Exercice(nom="CalculMoyenne")
public class Ex08_CalculMoyenne {
	
	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero=1)
	public void calculMoyenne() {
		double sum = 0.0;
		for (int i=0; i<array.length; i++) {
			sum += array[i];
		}
		double avg = sum/array.length;
		Resultat.log(avg);
	}
	
	@Test
	@Question(numero=2)
	public void calculMoyenneValeursPositives() {
		double sum = 0.0;
		int nb_positif = 0;
		for (int i=0; i<array.length; i++) {
			if(array[i] >= 0) {
				sum += array[i];
				nb_positif++;
			}
		}
		double avg = sum/nb_positif;
		Resultat.log(avg);
	}

}
