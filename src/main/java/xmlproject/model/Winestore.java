package xmlproject.model;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="winestore")
public class Winestore 
{
	
	
	
	@Element(name="project")
	private Project project;
	
	@ElementList(inline = true, required = false)
	private List<Wine> wine;
	
	@Element(name="moddate")
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
		this.wine = new ArrayList<Wine>();
	}
	
	
	public void clearWinestore()
	{
		wine.clear();
	}
	
	
	public List<Wine> getWineList()
	{
		return wine;
	}



	public void addWine(Wine w) {
		
		wine.add(w);
		
	}
	
}
