package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		for (int i=0;i<=array.length-1;i++) {
	
	//		n'affiche que les entier >3 du tableau array.
	
	//		if (array[i]>3) {
	//		System.out.print(array[i]+" ");
	//		}
	
	//		n'affiche que les entiers pairs du tableau.

	//		if (array[i] %2 == 0 ) {
	//			System.out.print(array[i]+" ");
	//		}

	// 		n'affiche que les valeurs correspondant aux index pairs.
		
	//		if (i%2  == 0) {
	//			System.out.print(array[i]+" ");
	//		}
	
	//		n'affiche que les entiers impairs du tableau.
			
			if (array[i] %2 !=0) {
				System.out.print(array[i]+" ");
			}
		}

	}

}
