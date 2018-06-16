package xmlproject.controller;

import java.util.ArrayList;
import java.util.List;


import xmlproject.model.Wine;
import xmlproject.model.Winestore;

public class WineManager {

	private Winestore winestore;
	
	private static WineManager instance = null;
	
	
	public WineManager()
	{
		winestore = new Winestore();
	}
	
	public static WineManager getInstance() {
		if(instance == null)
			instance = new WineManager();
		return instance;
	}

	
	/**
	 * Zwraca wszystkie zdarzenia z kalendarza
	 * @return lista obiektow klasy Event
	 */
	public ArrayList<Wine> getAllWines() {
		ArrayList<Wine> result = new ArrayList<Wine>();
		for(Wine w : winestore.getWineList())
			result.add(w.clone());
		return result;
	}
	
	
}
