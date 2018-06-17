package xmlproject.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="wineCount")
public class WineCount
{

	@Element(name="p")
	private String p;
}
