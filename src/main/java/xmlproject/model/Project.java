package xmlproject.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="project")
public class Project
{
	public Project() {}
	
	
	
	public Project(List<Author> author, Date mod) {
		super();
		this.author = author;
		this.mod = mod;
	}



	@ElementList(entry="author", inline=true, required=false)
	private List<Author> author;
	
	@Element(name="mod")
	private Date mod;
	
	
	public List<Author> getAuthor() {
		return author;
	}
	public void setAuthor(List<Author> author) {
		this.author = author;
	}
	public Date getMod() {
		return mod;
	}
	public void setMod(Date mod) {
		this.mod = mod;
	}
	
	
}
