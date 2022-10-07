package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		int batonsRestant = 21;
		Scanner scanner = new Scanner(System.in);
		while (batonsRestant > 0) {
			System.out.println("Veuillez prendre 1,2 ou 3 bâtons :");
			int batonPris = scanner.nextInt();
			while(batonPris != 1 && batonPris != 2 && batonPris != 3) {
				System.out.println("Veuillez prendre 1,2 ou 3 bâtons uniquement :");
				batonPris = scanner.nextInt();
			}
			batonsRestant -= batonPris;
			if(batonsRestant == 0) {
				System.out.println("Vous avez perdu !");
			} else {
				Random random = new Random();
				int maxBatonAPrendre = 3;
				if (batonsRestant < maxBatonAPrendre) {
					maxBatonAPrendre = batonsRestant;
				}
				batonPris = 1 + random.nextInt(maxBatonAPrendre);
				batonsRestant -= batonPris;
				System.out.println("L\'ordinateur prend " + batonPris + " bâtons, il reste " + batonsRestant + " bâtons");
				if(batonsRestant == 0) {
					System.out.println("Vous avez gagné !");
				}
			}
		}
		scanner.close();
	}

}
