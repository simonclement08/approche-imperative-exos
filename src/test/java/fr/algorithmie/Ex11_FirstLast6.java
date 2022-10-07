package fr.algorithmie;

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
@Exercice(nom="FirstLast6")
public class Ex11_FirstLast6 {

	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 6 };
	int[] tab4 = { 1, 6 };
	int[] tab5 = { 6, 2 };
	int[] tab6 = { 0, 6, 2 };

	/**
	 * Ne pas modifier les informations portées par l'annotation. AU TOTAL : 6
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {
		boolean check = false;
		
		check = tab1.length >= 1 && (tab1[0] == 6 || tab1[tab1.length-1] == 6);
		Resultat.log(check);
		check = tab2.length >= 1 && (tab2[0] == 6 || tab2[tab2.length-1] == 6);
		Resultat.log(check);
		check = tab3.length >= 1 && (tab3[0] == 6 || tab3[tab3.length-1] == 6);
		Resultat.log(check);
		check = tab4.length >= 1 && (tab4[0] == 6 || tab4[tab4.length-1] == 6);
		Resultat.log(check);
		check = tab5.length >= 1 && (tab5[0] == 6 || tab5[tab5.length-1] == 6);
		Resultat.log(check);
		check = tab6.length >= 1 && (tab6[0] == 6 || tab6[tab6.length-1] == 6);
		Resultat.log(check);
	}

}
