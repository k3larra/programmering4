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
	
	//Constructor: Creates a list of journeys
	public Journeys() {
		journeys = new ArrayList<Journey>();
	}
	
	public void addJourney(Journey journey) {
		this.journeys.add(journey);
	}
//	public void addJourneys(Journeys journeys) {
//		this.journeys.addAll(journeys.getJourneys());
	
	@SuppressWarnings("unchecked")
	public Journey getJourney(int get) {
		return journeys.get(get);
	}
	
	public void clearJourneys() {
		this.journeys.clear();
	}

	public ArrayList<Journey> getJourneys() {
		// TODO Auto-generated method stub
		return journeys;
	}
}
