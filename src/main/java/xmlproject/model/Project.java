package xmlproject.model;

import java.util.Date;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="project")
public class Project
{
	@ElementList(entry="author", inline=true)
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
