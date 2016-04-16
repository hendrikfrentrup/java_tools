
public class Matrix {
	
	//Declaring instance variables
	public static final int dim = 3; 
	private int mat[][];

	//Constructor of a Matrix
	public Matrix(){
		
		//dim = dimension; for now, only 3-dim. matrices are being handled
		mat = new int[dim][dim];
		
		for(int rowi = 0; rowi < dim; rowi++ )
			for (int coli = 0; coli < dim; coli++)
				mat[rowi][coli]=0;
	}
	
	//Change an element, submit the element and the index for row and column of the element
	public void setElement(int element, int rowIndex, int colIndex){
	
		mat[rowIndex][colIndex]=element;
	
	}
	
	//Get the element, submit the index for row and column of the element
	public int getElement(int rowIndex, int colIndex){
		
		int res = 0;
		res = mat[rowIndex][colIndex];
		return res;
	
	}
	//A Method to add 2 matrices, the result is a Matrix as well
	public Matrix addMatrices(Matrix mat1, Matrix mat2){
		
		Matrix resultMat = new Matrix();
		
		for(int rowi = 0; rowi < dim; rowi++ )
			for (int coli = 0; coli < dim; coli++)
			resultMat.setElement(mat1.getElement(rowi, coli) + mat2.getElement(rowi, coli), rowi, coli);
		return resultMat;
	}
	
	public Matrix multiplyMatrices(Matrix mat1, Matrix mat2){
		int bufferElement;
		Matrix resultMat = new Matrix();
		
		for(int rowi = 0; rowi < dim; rowi++ )
			for (int coli=0; coli < dim; coli++){
				bufferElement = 0;
				for(int count = 0; count < dim; count++ )
						bufferElement += mat1.getElement(rowi, count)*mat1.getElement(count, coli);
				resultMat.setElement(bufferElement, rowi, coli);
			}
		
		
		return resultMat; 
	}
}
