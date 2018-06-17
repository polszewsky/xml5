package xmlproject.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="wineCount")
public class WineCount
{

	@Element(name="p")
	private String p;

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}
}
