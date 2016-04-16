
public class count {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int countfrom=10;
		//if countfrom>15;
			{
				for (int count=10;count>0;count=count-1)
				{
					//count = Integer.parseInt(args[0]);
					try {
					     Thread.sleep(1000);
					} catch (InterruptedException e) {
					     // TODO Auto-generated catch block
					     e.printStackTrace();
					}
					System.out.println(count);
				}
			}	
		//else
			System.out.println("Zähl doch selber!");
	}

}
