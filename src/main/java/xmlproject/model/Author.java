package xmlproject.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name="author")
public class Author
{
	public Author() {}
	
	
	public Author(String departament, String faculty, String value) {
		super();
		this.departament = departament;
		this.faculty = faculty;
		this.value = value;
	}


	@Attribute
    private String departament;
	
	@Attribute
	private String faculty;
	
	@Text
	private String value;

	
	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
