package xmlproject.model;

import org.simpleframework.xml.Element;

public class Country
{

	private String text;
	
	@Element(name="cont")
	private String cont;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}
	
	
}
