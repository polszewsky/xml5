package xmlproject.repository;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import xmlproject.exception.RepoException;
import xmlproject.model.Wine;
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
			
			System.out.println(importWinestore.getModdate());
			System.out.println(importWinestore.getWineList().get(5).getPirce().getValue());
			//winestore.addWine(new Wine());
			
//			int winesImported = 0;
//			
//			for(Wine w : importWinestore.getWineList())
//			{
//				
//			}
			
			
			System.out.println("zaimportowano");
		}
		catch (Exception e)
		{
		
			e.printStackTrace();
			System.out.println("b³¹d importu w repo -> exception");
		}
		
	}

	public void exportObjects() throws RepoException {
		// TODO Auto-generated method stub
		
	}

	public void updateObjects() throws RepoException {
		// TODO Auto-generated method stub
		
	}

	public void deleteObjects() throws RepoException {
		// TODO Auto-generated method stub
		
	}

	
}
