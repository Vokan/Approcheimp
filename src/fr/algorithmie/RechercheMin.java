package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		int valeurMin;
		
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		valeurMin=array[0];
		for (int i=0; i<=array.length -1;i++) {
			if (array[i]<valeurMin) 
			valeurMin=array[i];	
		}
		System.out.print(valeurMin);
		}


	}


