package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rang = 0;
		do {
			System.out.println("Veuiller choisir un rang :");
			rang = scanner.nextInt();
		} while(rang < 0);
		
		int[] fibonnaci = {0,1};
		for (int i = 2; i <= rang; i++) {
			int[] temp = Arrays.copyOf(fibonnaci, fibonnaci.length+1);
			temp[temp.length-1] = fibonnaci[i-1] + fibonnaci[i-2];
			fibonnaci = temp;
		}
		System.out.println(fibonnaci[rang]);
		scanner.close();
	}

}
