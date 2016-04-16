//extends java.lang
import java.util.ArrayList;

public class Session {
	
	//Declaring instance variables
	private int nStates;
	private ArrayList speakersList;
	//private String speakersList[];

	//Constructor of the session
	public Session(){
		
		nStates = 10;
		ArrayList speakersList = new ArrayList();
		//speakersList = new String[nStates];
		
		for(int i = 0; i < nStates; i++)
		speakersList.add(i,"none");
	}

	//Display an element of the list
	public void print(){
	System.out.println(speakersList);
	}		
	
	public ArrayList get(){				
		return speakersList;
	}
}
