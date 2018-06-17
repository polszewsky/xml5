package xmlproject.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Text;

public class Price
{

	private String text;
	
	@Element(name="vat")
	private String vat;


	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}
	
	
}
