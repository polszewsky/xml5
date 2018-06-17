package xmlproject.model;

import java.util.Date;

import org.simpleframework.xml.Attribute;

public class Shipment
{
	public Shipment() {}
	
	
	@Attribute(name="status")
	private String status;
	
	private Date text;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getText() {
		return text;
	}

	public void setText(Date text) {
		this.text = text;
	}
	
	
	
}
