package xmlproject.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name="price")
public class Price
{

	public Price()
	{
		super();
	}
	
	private String value;
	
	@Element(name="vat")
	private String vat;


	public String getValue() {
		return value;
	}

	public void setValue(String text) {
		this.value = text;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}
	
	
}
