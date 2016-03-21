package se.mah.k3.grupp4;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import se.mah.k3.grupp4.Journey;
import se.mah.k3.grupp4.Journeys;
import se.mah.k3.grupp4.Gui2;

import se.mah.k3.grupp4.Constants;
import se.mah.k3.grupp4.Parser;

public class SearchThread extends Thread {
	private String searchURL;
	private Gui2 gui2;

	public SearchThread(Gui2 gui222) {
		this.gui2 = gui222;
	}

	/** Prints info for debug */
	public void print(Journeys journeys) {

		try {
			System.out.print(journeys.getJourneys().get(0).getStartStation().getStationName() + " - ");
			System.out.print(journeys.getJourneys().get(0).getEndStation().getStationName());
			System.out.println(" Departs in " + journeys.getJourneys().get(0).realDepTime() + " mothafukkin minutes");
			System.out.print(journeys.getJourneys().get(1).getStartStation().getStationName() + " - ");
			System.out.print(journeys.getJourneys().get(1).getEndStation().getStationName());
			System.out.println(" Departs in " + journeys.getJourneys().get(1).realDepTime() + " mothafukkin minutes");
			System.out.println("Antal:" + journeys.getJourneys().size()); // debug
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		while (true) {

			// mot c 2an
			searchURL = Constants.getURL("80002", "80600", 3);
			Journeys journeys = Parser.getJourneys(searchURL);

			print(journeys);

			gui2.setTimeOnLabel(journeys.getJourneys().get(0).realDepTime() + " min",
					journeys.getJourneys().get(1).realDepTime() + " min", 2);

			// mot c 3an
			searchURL = Constants.getURL("80002", "80110", 3);
			Journeys journeys3an = Parser.getJourneys(searchURL);
			print(journeys3an);

			// Send to GUI
			gui2.setTimeOnLabel(journeys3an.getJourneys().get(0).realDepTime() + " min",
					journeys3an.getJourneys().get(1).realDepTime() + " min", 3);

			// 5:an mot Malm� C
			searchURL = Constants.getURL("80002", "80840", 3);
			Journeys journeys5an = Parser.getJourneys(searchURL);
			print(journeys5an);

			gui2.setTimeOnLabel(journeys5an.getJourneys().get(0).realDepTime() + " min",
					journeys5an.getJourneys().get(1).realDepTime() + " min", 5);

			// 7:an mot Malm� C
			searchURL = Constants.getURL("80002", "80580", 3);
			Journeys journeys7an = Parser.getJourneys(searchURL);
			gui2.setTimeOnLabel(journeys7an.getJourneys().get(0).realDepTime() + " min",
					journeys7an.getJourneys().get(1).realDepTime() + " min", 7);

			gui2.setTimeOnLabel(journeys7an.getJourneys().get(0).realDepTime() + " min",
					journeys7an.getJourneys().get(1).realDepTime() + " min", 7);
			// 8:an mot Malm� C

			searchURL = Constants.getURL("80002", "80660", 3);
			Journeys journeys8an = Parser.getJourneys(searchURL);
			gui2.setTimeOnLabel(journeys8an.getJourneys().get(0).realDepTime() + " min",
					journeys8an.getJourneys().get(1).realDepTime() + " min", 8);

			// 2:an fr�n Malm� C

			searchURL = Constants.getURL("80002", "80005", 3);

			Journeys journeys22an = Parser.getJourneys(searchURL);
			gui2.setTimeOnLabel(journeys22an.getJourneys().get(0).realDepTime() + " min",
					journeys22an.getJourneys().get(1).realDepTime() + " min", 22);
			// 3:an fr�n Malm� C
			searchURL = Constants.getURL("80002", "80300", 3);
			Journeys journeys33an = Parser.getJourneys(searchURL);
			gui2.setTimeOnLabel(journeys33an.getJourneys().get(0).realDepTime() + " min",
					journeys33an.getJourneys().get(1).realDepTime() + " min", 33);

			// 3:an fr�n Malm� C
			String searchURL = Constants.getURL("80002", "80004", 3);
			Journeys journeys55an = Parser.getJourneys(searchURL);
			gui2.setTimeOnLabel(journeys55an.getJourneys().get(0).realDepTime() + " min",
					journeys55an.getJourneys().get(1).realDepTime() + " min", 55);

			searchURL = Constants.getURL("80002", "80338", 3);
			Journeys journeys77an = Parser.getJourneys(searchURL);
			gui2.setTimeOnLabel(journeys77an.getJourneys().get(0).realDepTime() + " min",
					journeys77an.getJourneys().get(1).realDepTime() + " min", 77);

			searchURL = Constants.getURL("80002", "80040", 3);
			Journeys journeys88an = Parser.getJourneys(searchURL);
			gui2.setTimeOnLabel(journeys88an.getJourneys().get(0).realDepTime() + " min",
					journeys88an.getJourneys().get(1).realDepTime() + " min", 88);

			try {
				Thread.sleep(20000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
