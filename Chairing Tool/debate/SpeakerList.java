/*****************************************
* speakerList.java
* Hendrik Frentrup
*
* defines the speakers list of the debate
******************************************/

package debate;

import java.util.ArrayList;

public class SpeakerList {
	//	 initialisation
	ArrayList list = new ArrayList();

	// methods
	public void addSpeaker( String speakerName ){
		int     length  = 0;
		boolean exist   = false;
		String  listelem;

		length = this.list.size();
		for (int i = 0; i <= length; i++){
			listelem = (String) this.list.get(i);
			if (speakerName.equalsIgnoreCase(listelem)){
			exist = true;
			}
		}
		if (exist == false){
			this.list.add(speakerName);
		}
		else{
		System.out.println(speakerName + " is already on the speakers list.");
		}
	}

	public void delSpeaker( int index){
		
	}
}
