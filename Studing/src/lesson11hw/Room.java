package lesson11hw;

import java.util.Date;

public class Room {
	private long id;
	private int price;
	private int persons;
	private Date dateAvailableFrom;
	private String hotelName;
	private String cityName;

	public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
		super();
		this.id = id;
		this.price = price;
		this.persons = persons;
		this.dateAvailableFrom = dateAvailableFrom;
		this.hotelName = hotelName;
		this.cityName = cityName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDateAvailableFrom() {
		return dateAvailableFrom;
	}

	public void setDateAvailableFrom(Date dateAvailableFrom) {
		this.dateAvailableFrom = dateAvailableFrom;
	}

	public long getId() {
		return id;
	}

	public int getPersons() {
		return persons;
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getCityName() {
		return cityName;
	}

}