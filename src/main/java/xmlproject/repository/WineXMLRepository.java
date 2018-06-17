package xmlproject.repository;

import xmlproject.exception.RepoException;
import xmlproject.model.Winestore;

public class WineXMLRepository implements WineRepository
{

	private Winestore winestore;
	private Winestore importWinestore = null;
	
	public WineXMLRepository(Winestore winestore)
	{
		this.winestore = winestore;
		
	}

	public void importObjects() throws RepoException {
		// TODO Auto-generated method stub
		
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
