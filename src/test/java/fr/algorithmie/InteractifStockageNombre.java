package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		int[] userArray = {1};
		do {
			System.out.println("Veuillez choisir une option : \n1) Ajouter un nombre\n2) Afficher les nombres existants\n3) Arrêter le programme");
			System.out.print ( "Selection: " );
			choice = scanner.nextInt();
			
			while(choice != 1 && choice != 2 && choice != 3) {
				System.out.print ( "Veuillez choisir entre le choix 1 et 2 et 3 : " );
				choice = scanner.nextInt();
			}
			
			if(choice == 1) {
				System.out.print ( "Veuillez renseigner un nombre : " );
				int[] temp = Arrays.copyOf(userArray, userArray.length+1);
				temp[temp.length-1] = scanner.nextInt();
				userArray = temp;
			} else if(choice == 2) {
				System.out.println("Pour le moment, le tableau contient ces valeurs :");
				for (int i = 0; i < userArray.length; i++) {
					System.out.println(userArray[i]);
				}
			}
		} while(choice != 3);

		scanner.close();

	}

}
