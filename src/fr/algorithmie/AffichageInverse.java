package fr.algorithmie;



public class AffichageInverse {

	public static void main(String[] args) {

		
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
// L'ensemble des valeurs du tableau grâce à une boucle
		//for (int i = 0; i<array.length ; i++) {
		//System.out.print(array[i]+" ");
		//	 		}

// L'ensemble des valeurs du tableau affiché dans l'ordre inverse
	//for (int i=array.length-1;i>=0; i--) {
	//	System.out.print(array[i]+" ");
	//}
	
	// Création d'un tableau arryCopy avec tous les éléments de array dedans
		int[] arrayCopy = new int [array.length];
		for (int i= 1; i<arrayCopy.length; i++ ) {
			arrayCopy[i]=array[i];
		System.out.print(arrayCopy[i]+" ");
		}
	}
}