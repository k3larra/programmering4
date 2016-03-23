package se.mah.k3.grupp4;

import se.mah.k3.grupp4.Journeys;
import se.mah.k3.grupp4.Gui2;

import se.mah.k3.grupp4.Constants;
import se.mah.k3.grupp4.Parser;

public class SearchThread extends Thread {
	private String searchURL;
	private Gui2 gui2;
	//private Journeys journeys;
	private String fromStn;
	private String toStn;
	private int label;
	//Journeys journeys= new Journeys();

	public SearchThread(Gui2 gui222, String from, String to, int label) {
		this.gui2 = gui222;
		fromStn = from;
		toStn = to;
		this.label = label;
		searchURL = Constants.getURL(fromStn, toStn, 5);

	}


	@Override
	public void run() {
		while (true) {
			
			Journeys journeys = new Journeys();
			journeys.clearJourneys();
			journeys = Parser.getJourneys(searchURL);

			print(journeys);

			gui2.setTimeOnLabel(journeys.getJourney(0).getRealDepTime() + " min",
					journeys.getJourney(1).getRealDepTime() + " min", label);

			try {
				Thread.sleep(20000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
			
	/*Prints info for debug**/ 
	public void print(Journeys j) {

		try {
			System.out.print(j.getJourney(0).getStartStation().getStationName() + " - ");
			System.out.print(j.getJourney(0).getEndStation().getStationName());
			System.out.println(" Departs in " + j.getJourney(0).getRealDepTime() + " mothafukkin minutes");
			System.out.print(j.getJourney(1).getStartStation().getStationName() + " - ");
			System.out.print(j.getJourney(1).getEndStation().getStationName());
			System.out.println(" Departs in " + j.getJourney(1).getRealDepTime() + " mothafukkin minutes");
			System.out.println(j.getJourney(0).getStartStation().getStationNbr() +j.getJourney(1).getStartStation().getStationName() );
			System.out.println("Antal Journeys:" + j.getJourneys().size()); // debug
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}