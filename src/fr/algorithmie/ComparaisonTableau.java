package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		
		int nbCommun;
		nbCommun=0;
		
		int[]array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int[]array2 = {3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
		
		// On forme une boucle pour parcourir le tableau et rechercher 
		// pour quel index on a des chiffres identiques.
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array2.length; j++) {
				if (array[i]==array2[j])
				
				System.out.print("same");
			}
		}
	
	}

}
