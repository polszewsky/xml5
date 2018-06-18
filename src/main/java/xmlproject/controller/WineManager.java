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
	public static String nextID = "";
	
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


	
	// METODA DLA DOROTY
	public void transformToPDF() throws RepoException
	{
		// zak³adam ¿e trzeba zrobiæ now¹ kladê PDFTransform/TransformPDF i do niej przes³aæ instancje aktual;nego winestore
		// coœ takiego: TransformPDF transformation = New TransformPDF(winestore)
		// transformation.transformToPDF();
		
	}

	public void removeWineById(String id)
	{
		System.out.println("Removing event with id " + id);
		for(Wine w : winestore.getWineList()){
						
			if(w.getId().equals(id)) {
				winestore.getWineList().remove(w);
				System.out.println("usuniêto!");
				break;
			}
		}
//		try {
//			exportXML();
//		} catch (RepoException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
	}
}
