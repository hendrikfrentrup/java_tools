/*****************************************
* speakerList.java
* Hendrik Frentrup
*
* defines the speakers list of the debate
******************************************/

import java.util.ArrayList;

public class speakerList
{
	// initialisation
	ArrayList<String> list = new ArrayList<String>()

	// methods
	public void addSpeaker( String speakerName )
	{
		int     length = 0;
		boolean exist  = false;

		length = this.list.size();
		for (int i = 0; i <= length; i++)
		{
			if speakerName.equalsIgnoreCase(this.list.get(i))
			{
			exist = true;
			}
		}
		if (exits == false)
		{
			this.list.add(speakerName);
		}
		else
		{
		System.out.println(speakerName + " is already on the speakers list.");
		}
	}

	public void delSpeaker( int index)
	{
		
	}


}
