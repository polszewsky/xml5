package xmlproject.model;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="wine")
public class Wine
{
	
	@Attribute(name="id")
	private String id;
	
	@Attribute(name="available")
	private String available;
	
	@Element(name="name")
	private String name;
	
	@Element
	private Country country;
	
	@Element
	private String color;
	
	@Element
	private String taste;
	
	@Element
	private int year;
	
	@Element
	private String alcohol;
	
	@Element
	private String volume;
	
	@Element
	private Price pirce;
	
	@Element
	private Shipment shipment;
	
	
	
	

	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getAvailable() {
		return available;
	}





	public void setAvailable(String available) {
		this.available = available;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public Country getCountry() {
		return country;
	}





	public void setCountry(Country country) {
		this.country = country;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public String getTaste() {
		return taste;
	}





	public void setTaste(String taste) {
		this.taste = taste;
	}





	public int getYear() {
		return year;
	}





	public void setYear(int year) {
		this.year = year;
	}





	public String getAlcohol() {
		return alcohol;
	}





	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}





	public String getVolume() {
		return volume;
	}





	public void setVolume(String volume) {
		this.volume = volume;
	}





	public Price getPirce() {
		return pirce;
	}





	public void setPirce(Price pirce) {
		this.pirce = pirce;
	}





	public Shipment getShipment() {
		return shipment;
	}





	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}





	public Wine clone()
	{
		return new Wine();
	}
}
