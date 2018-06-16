package xmlproject.model;

import java.util.ArrayList;
import java.util.List;

public class Winestore 
{

	private List<Wine> wines;
	
	public Winestore()
	{
		this.wines = new ArrayList<Wine>();
	}
	
	
	public void clearWinestore()
	{
		wines.clear();
	}
	
	
	public List<Wine> getWineList()
	{
		return wines;
	}
	
}
