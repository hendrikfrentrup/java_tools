
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstTerm = 2, secondTerm =15;
		int thirdTerm=3;
		
		System.out.println(toThePowerOf(firstTerm,thirdTerm));
		System.out.println(addition(firstTerm,secondTerm));
	}
	
	public static double addition(double term1 ,double term2){
		double result = 0;
		
		result=term1+term2;
		return result;
	}
	
	public static double subtraction(double term1 ,double term2){
		double result = 0;
		
		result=term1-term2;
		return result;
	}
	
	public static double toThePowerOf2(double term1){
			double result = 0;
			
			result=term1*term1;
			return result;
		
	}

	public static double toThePowerOf(double term1, int term2){
		double result = 1;
		int count = 0;
		
		while (count < term2){
			
			result=result*term1;
			count++;
		}
		
		return result;
		
	}
}
