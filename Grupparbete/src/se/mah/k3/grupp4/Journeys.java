package se.mah.k3.grupp4;

import java.util.ArrayList;
/**
 * Journeys class can hold a number of or singular journeys. 
 * For example all transports from one stations to another
 * @author K3LARA
 *
 */
public class Journeys {
	private ArrayList<Journey> journeys;
	private String errorMsg;
	
	//Constructor: Creates a list of journeys
	public Journeys() {
		journeys = new ArrayList<Journey>();
	}
	
	public void addJourney(Journey journey) {
		this.journeys.add(journey);
	}
	
	@SuppressWarnings("unchecked")
	public Journey getJourney(int get) {
		if(get < journeys.size()){
		return journeys.get(get);
		}
		else{
			return null;
		}
	}
	
	public void clearJourneys() {
		this.journeys.clear();
	}

	public ArrayList<Journey> getJourneys() {
		return journeys;
	}

	public void setErrorMsg(String error) {
		this.errorMsg = error;
	}

	public String getError() {
		return errorMsg;
	}
}
