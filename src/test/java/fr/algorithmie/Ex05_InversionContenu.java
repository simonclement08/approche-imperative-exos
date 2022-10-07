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
@Exercice(nom="InversionContenu")
public class Ex05_InversionContenu {

	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	@Test
	@Question(numero=1)
	public void affichageTableauArrayCopy() {
		int[] arrayCopy = new int[array.length];
		
		for (int i=0; i<array.length; i++) {
			arrayCopy[i] = array[array.length-i-1];
			Resultat.log(arrayCopy[i]);
		}
	}
}
