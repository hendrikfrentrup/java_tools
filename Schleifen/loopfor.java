
public class loopfor 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int zahl = 5;
		String ausgabe ="";
		for(int i=1;i<=zahl;i=i+1)
		{
			for(int count=1;count<=i;count=count+1)
			{	
				ausgabe=ausgabe+i;	
			}	
			System.out.println(ausgabe);
			ausgabe="";
		}		
	}
}
