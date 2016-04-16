public class TestApplication {

	/**
	 * @param args
	 */
	public static final int dim = 3;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Output is a string that adds up a row of a matrix and is then displayed
		//Int elem is a counter 
		String output;
		int elem;
		//Creates 2 matrices
		Matrix matA = new Matrix();
		Matrix matB = new Matrix();
		Matrix matRes = new Matrix();
		Matrix matRes2 = new Matrix();
		
		
		//Sets values from 1 to 9 for the matrix elements
		elem = 0;
		for(int rowi = 0; rowi < dim; rowi++ )
			for (int coli = 0; coli < dim; coli++){
				elem+=1;
				matA.setElement(elem, rowi, coli);
			}
		
		elem = 0;
		for(int rowi = 0; rowi < dim; rowi++ )
			for (int coli = 0; coli < dim; coli++){
				elem+=1;
				matB.setElement(elem, rowi, coli);		
			}		
		
		matA.setElement(7, 0, 0);
		matA.setElement(4, 0, 1);
		matA.setElement(3, 0, 2);
		matA.setElement(8, 1, 0);
		matA.setElement(9, 1, 1);
		matA.setElement(7, 1, 2);
		matA.setElement(2, 2, 0);
		matA.setElement(0, 2, 1);
		matA.setElement(9, 2, 2);
		
		matB.setElement(4, 0, 0);
		matB.setElement(6, 0, 1);
		matB.setElement(3, 0, 2);
		matB.setElement(9, 1, 0);
		matB.setElement(7, 1, 1);
		matB.setElement(5, 1, 2);
		matB.setElement(6, 2, 0);
		matB.setElement(4, 2, 1);
		matB.setElement(1, 2, 2);
		
		//Displays the matrices		
		System.out.println("This is matA:");
		for(int rowi = 0; rowi < dim; rowi++ ){
			output = "";
			for (int coli = 0; coli < dim; coli++){
				output += matA.getElement(rowi, coli) + " ";
			}
			System.out.println(output);
		}
		
		System.out.println("This is matB:");
		for(int rowi = 0; rowi < dim; rowi++ ){
			output = "";
			for (int coli = 0; coli < dim; coli++){
				output += matB.getElement(rowi, coli) + " ";
			}
			System.out.println(output);
		}
		
		//Adds matA and matB and saves it in matRes
		matRes = matRes.addMatrices(matA, matB);
		//Displays MatRes
		System.out.println("This is matA+matB:");
		for(int rowi = 0; rowi < dim; rowi++ ){
			output = "";
			for (int coli = 0; coli < dim; coli++){
				output += matRes.getElement(rowi, coli) + " ";
			}
			System.out.println(output);
		}
		
		//Adds matA and matB and saves it in matRes2
		matRes2 = matRes2.multiplyMatrices(matA, matB);
		//Displays MatRes
		System.out.println("This is matA*matB:");
		for(int rowi = 0; rowi < dim; rowi++ ){
			output = "";
			for (int coli = 0; coli < dim; coli++){
				output += matRes2.getElement(rowi, coli) + " ";
			}
			System.out.println(output);
		}
	}

}
