package xmlproject.model;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.ElementList;

public class Winestore 
{

	@ElementList
	private List<Project> project;
	
	@ElementList
	private List<Wine> wines;
	
	@Element
	private String moddate;
	
	@ElementArray(entry="p")
	   private String[] wineCount;        

	   public String[] getWineCount() {
	      return wineCount;           
	   }
	
	@ElementArray(entry="p")
	   private String[] wineAvailable;        

	   public String[] getWineAvailable() {
	      return wineAvailable;           
	   }

	@ElementArray(entry="p")
	   private String[] wineColor;        

	   public String[] getWineColor() {
	      return wineColor;           
	   }
	
	
	
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
