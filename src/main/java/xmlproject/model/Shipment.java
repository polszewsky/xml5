package xmlproject.model;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class Shipment
{
	public Shipment() {}
	
	
	
	
	public Shipment(String status, Date text) {
		super();
		this.status = status;
		this.text = text;
	}




	@Attribute(name="status")
	private String status;
	
	@Text
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
