public class TestApplication {

	/**
	 * @param args
	 */
	
	public static int nStates = 10;	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Output is a string that adds up a row of a matrix and is then displayed
		//Int elem is a counter 
		
		String out;
		out = "";
		
		//create a session
		Session council = new Session();				
		
		//Displays the speakers list		
		System.out.println("This is the speakers list");
		council.print();
		//for(int pos = 0; pos < nStates; pos++ ){
		//	out += "Loop:" + pos + council.get(pos) + "\n";
		//}
		
		//System.out.println(out);
		
		
	}

}
