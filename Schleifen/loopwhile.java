
public class loopwhile 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int bis=5, i=1, count;
		String ausgabe="";
		while (i<=bis)
		{
			//System.out.println(ausgabe+""+i);	
			//ausgabe=ausgabe+""+i;
			count=1;
			while(count<i)
			{
				//ausgabe=""+i;
				count=count+1;
				//System.out.println(ausgabe);
				ausgabe=ausgabe+""+i;
			}
			System.out.println(ausgabe+""+i);	
			ausgabe="";
			i=i+1;
		}
	System.out.println("YEAH!");
	
	}

}
