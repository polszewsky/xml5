package xmlproject.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name="country")
public class Country
{
	public Country() {}
	
	
	private String value;
	
	@Element(name="cont", required = false)
	private String cont;

	
	public String getValue() {
		return value;
	}

	public void setValue(String v) {
		this.value = v;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}
	
	
}
