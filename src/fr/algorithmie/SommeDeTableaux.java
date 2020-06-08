package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		
		int somme1;
		int somme2;
	//	int total;
		
		somme1=0;
		somme2=0;
	//	total=0;
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int[] tableau = {-1,12,17,14,5,-9,0,18,-6,0,4,-13,5,7,-2,8,-1};
		for (int i=0; i<array.length; i++) {
			somme1=somme1+array[i];
		}
		for (int j=0; j<tableau.length; j++) {
			somme2=somme2+tableau[j];
		}
		
	//	total=somme1+somme2;
		int [] newTabl = new int [2];
		newTabl [0] = somme1;
		newTabl [1] = somme2;
		
		for (int k=0; k<=newTabl.length-1; k++) {
			
		
		System.out.print(newTabl[k]+ " ");
		}
	}
}


