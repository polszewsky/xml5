package xmlproject.controller;

import java.util.ArrayList;
import java.util.List;

import xmlproject.exception.RepoException;
import xmlproject.model.Wine;
import xmlproject.model.Winestore;
import xmlproject.repository.WineXMLRepository;

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
	 * Zwraca wszystkie wina z Winestore
	 * @return lista obiektow klasy Wine
	 */
	public ArrayList<Wine> getAllWines() {
		ArrayList<Wine> result = new ArrayList<Wine>();
		for(Wine w : winestore.getWineList())
			result.add(w.clone());
		return result;
	}

	public void importFromXML() throws RepoException
	{
		
		WineXMLRepository repository = new WineXMLRepository(winestore);
		
		repository.importObjects();
		System.out.println("imported from XML 1");
	}
	
	public void exportToXML() throws RepoException
	{
		WineXMLRepository repository = new  WineXMLRepository(winestore);
		
		repository.exportObjects();
		
		System.out.println("imported to XML 1");
	}
	
	public void updateXML() throws RepoException
	{
		
		WineXMLRepository repository = new WineXMLRepository(winestore);
		
		repository.updateObjects();
		System.out.println("updated XML 1");
	}
	
	public void deleteXML() throws RepoException
	{
		WineXMLRepository repository = new  WineXMLRepository(winestore);
		
		repository.deleteObjects();
		
		System.out.println("deleted to XML 1");
	}

	
	// METODA DLA DOROTY
	public void transformToPDF()
	{
		// zak³adam ¿e trzeba zrobiæ now¹ kladê PDFTransform/TransformPDF i do niej przes³aæ instancje aktual;nego winestore
		// coœ takiego: TransformPDF transformation = New TransformPDF(winestore)
		// transformation.transformToPDF();
		
	}
}
