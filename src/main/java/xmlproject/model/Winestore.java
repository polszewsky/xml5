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

	public Winestore()
	{
		this.wine = new ArrayList<Wine>();
	}
	
	
	@Element(name="project", required = false)
	private Project project;
	
	@ElementList(inline = true, required = false)
	private List<Wine> wine;
	
	@Element(name="moddate", required = false)
	private String moddate;
	
	@Element(name="wineCount", required = false)
	private WineCount wineCount;        

	@ElementList(name="wineAvailable", required = false)
	private List<String> wineAvailable;        

	@ElementList(name="wineColor", required = false)
	private List<String> wineColor;        
       


	
	 public List<Wine> getWine() {
		return wine;
	}

	public void setWine(List<Wine> wine) {
		this.wine = wine;
	}

	public void setWineCount(WineCount wineCount) {
		this.wineCount = wineCount;
	}

	public void setWineAvailable(List<String> wineAvailable) {
		this.wineAvailable = wineAvailable;
	}

	public void setWineColor(List<String> wineColor) {
		this.wineColor = wineColor;
	}

	public WineCount getWineCount() {
		      return wineCount;           
		   }
	
	public List<String> getWineColor() {
		      return wineColor;           
		   }
	   
	public List<String> getWineAvailable() {
		      return wineAvailable;           
		   }
	   
	    
	   
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getModdate() {
		return moddate;
	}

	public void setModdate(String moddate) {
		this.moddate = moddate;
	}


	// WA¯NE FUNKCJE
	
	
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
		System.out.println("Dodano do biblioteki wino " + w.getId());
		
	}
	
}
