package xmlproject.repository;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import xmlproject.controller.WineManager;
import xmlproject.exception.RepoException;
import xmlproject.model.Country;
import xmlproject.model.Price;
import xmlproject.model.Shipment;
import xmlproject.model.Wine;
import xmlproject.model.WineCount;
import xmlproject.model.Winestore;

public class WineXMLRepository implements WineRepository
{

	private Winestore winestore;
	private Winestore importWinestore = null;
	Serializer serializer = null;
	File source = null;
	
	public WineXMLRepository(Winestore winestore)
	{
		this.winestore = winestore;
		
	}

	public void importObjects() throws RepoException {


		try
		{
			Serializer serializer = new Persister();
			
			File source = new File("xml\\zadanie4.xml");
			
			winestore.clearWinestore();
			
			importWinestore = serializer.read(Winestore.class, source);
			
			//System.out.println(importWinestore.getModdate());
			//System.out.println(importWinestore.getWineList().get(5).getCountry().getValue());
			//winestore.addWine(new Wine());
			
			String maxWineID = "";
			int winesImported = 0;
			
			winestore.setProject(importWinestore.getProject());
			winestore.setModdate(importWinestore.getModdate());
			winestore.setWineColor(importWinestore.getWineColor());
			winestore.setWineAvailable(importWinestore.getWineAvailable());
			winestore.setWineCount(importWinestore.getWineCount());
			
			for(Wine w : importWinestore.getWineList())
			{
				
				
				String id = w.getId();
				String aval = w.getAvailable();
				
				String name = w.getName();
				Country country = w.getCountry(); 			
				String color = w.getColor();
				String taste = w.getTaste();
				int year = w.getYear();
				String alc = w.getAlcohol();
				String vol = w.getVolume();
				Price price = w.getPirce();
				Shipment ship = w.getShipment();
				
				winestore.addWine(new Wine(id,aval,name,new Country(country.getValue(), country.getCont()),color,taste,year,alc,vol,new Price(price.getValue(),price.getVat()),new Shipment(ship.getStatus(), ship.getText())));
				
				++winesImported;
				maxWineID = w.getId();
				
			}
			
			
			
			WineManager.getInstance().nextID = maxWineID;
			
			System.out.println("Wines importred: " + winesImported);
			System.out.println("LatestID: "+ WineManager.getInstance().nextID);
			System.out.println("zaimportowano");
		}
		catch (Exception e)
		{
		
			e.printStackTrace();
			throw new RepoException();
		}
		
	}

	public void exportObjects() throws RepoException {
	
		
		try
		{
		
		System.out.println("export method");
			
		Serializer serializer = new Persister();
			
		File result = new File("xml\\xmlOutput.xml");

		serializer.write(winestore, result);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new RepoException();
		}
		
	}

	public void updateObjects() throws RepoException {
		// TODO Auto-generated method stub
		
	}

	public void deleteObjects() throws RepoException {
		// TODO Auto-generated method stub
		
	}

	
}
