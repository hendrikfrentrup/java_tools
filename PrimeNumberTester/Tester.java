
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Checks for all primes up to limit
		boolean prime = true;
		int limit = 1000, num = 3, quantity = 0, rem, lnbr = 0, br;
		String primeNumbers = "1,2,";
		
		while (num <= limit){
			prime = true;
			/*num is being divided by all numbers between 1 and num, excluding both. In case that
			 rem, which is the rest of the division, equals to 0, num is not a prime number.*/ 
			
			//System.out.println("Test num: " + num);
			for (int i = 2; i < num; i++){
				rem = 0;
				rem = num%i;
				//System.out.println("divided by: " + i + " -> rest:" + rem);				
				if (rem == 0)
					prime=false;
			}
			
			/*control of the output, testing the "prime" value and generating linebreaks
			*/
			if (prime==true){
				quantity++;
				lnbr += 1;
				primeNumbers += num + ",";
				br = lnbr%20;
				if (br == 0)
					primeNumbers += "\n";
			//System.out.println("The statement that " + num +" is a prime number is " + prime);
			}
			num++;
		}
		System.out.println("There are " + quantity + " prime numbers!");
		System.out.println("The list of all prime numbers until " + limit + " read as follows:");
		System.out.println(primeNumbers);
		
			
	}

}
