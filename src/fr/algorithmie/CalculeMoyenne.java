package fr.algorithmie;

public class CalculeMoyenne {

	public static void main(String[] args) {
		
		float valeurMoyen;
		float somme;
		
		somme = 0;
		valeurMoyen = 0;
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		for (int i = 0; i<array.length; i++) {
			somme = somme+ array[i];
		}
		valeurMoyen = somme/array.length;
			
			System.out.println("La valeur moyenne est: "+valeurMoyen);
		}
	}


