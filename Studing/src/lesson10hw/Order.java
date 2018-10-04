package lesson10hw;

import java.util.Date;

public abstract class Order {
	private String itemName;
	private Date dateCreated;
	private Date dateConfirmed;
	private Date dateShipped;
	private String shipFromCity;
	private String shipToCity;
	private int basePrice;
	private double totalPrice;
	private Customer customerOwned;

	public Order(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice,
			Customer customerOwned) {

		this.itemName = itemName;
		this.dateCreated = dateCreated;
		this.shipFromCity = shipFromCity;
		this.shipToCity = shipToCity;
		this.basePrice = basePrice;
		this.customerOwned = customerOwned;
	}

	public abstract void validateOrder();

	public abstract void calculatePrice();

	public void confirmShipping() {
		if (dateShipped == null) {
			dateShipped = new Date();
		}
	}

	public Date getDateConfirmed() {
		return dateConfirmed;
	}

	public void setDateConfirmed(Date dateConfirmed) {
		this.dateConfirmed = dateConfirmed;
	}

	public Date getDateShipped() {
		return dateShipped;
	}

	public void setDateShipped(Date dateShipped) {
		this.dateShipped = dateShipped;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public String getShipFromCity() {
		return shipFromCity;
	}

	public String getShipToCity() {
		return shipToCity;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public Customer getCustomerOwned() {
		return customerOwned;
	}

}