package xmlproject.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.lowagie.text.DocumentException;

import xmlproject.exception.RepoException;
import xmlproject.model.Wine;
import xmlproject.model.Winestore;
import xmlproject.repository.WineXMLRepository;
import xmlproject.transform.*;

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
	public void transformToPDF()
	{
		// zak�adam �e trzeba zrobi� now� klad� PDFTransform/TransformPDF i do niej przes�a� instancje aktual;nego winestore
		// co� takiego: TransformPDF transformation = New TransformPDF(winestore)
		// transformation.transformToPDF();
		
		PDFTransform transform = new PDFTransform();
		try {
			transform.transformToPDF();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void removeWineById(String id)
	{
		System.out.println("Removing event with id " + id);
		for(Wine w : winestore.getWineList()){
						
			if(w.getId().equals(id)) {
				winestore.getWineList().remove(w);
				System.out.println("usuni�to!");
				break;
			}
		}
	}	
		public Wine getWineById(String id)
		{
		
			Wine returnWine = null;
			
			System.out.println("returning wine by id " + id);
			for(Wine w : winestore.getWineList()){
							
				if(w.getId().equals(id)) {
					
					returnWine = w.clone();
					break;
				}
			}
		
			System.out.println("zwrocono wino!");
			
			return returnWine;
	}

	public void addNewWine(Wine w) {
		
		winestore.addWine(w);
		
	}
}
