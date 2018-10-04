package lesson10hw;

import java.util.Date;

public class ElectronicsOrder extends Order {
	private int guaranteeMonths;

	public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice,
			Customer customerOwned, int guaranteeMonths) {
		super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
		this.guaranteeMonths = guaranteeMonths;
	}

	private boolean validateStorage(String adress) {
		if (adress.equals("Киев") || adress.equals("Одесса") || adress.equals("Днепр") || adress.equals("Харьков")) {
			return true;
		}

		return false;
	}

	@Override
	public void validateOrder() {
		if (getCustomerOwned() == null) {
			return;
		}
		if (validateStorage(getShipFromCity()) && validateStorage(getShipToCity())
				&& getCustomerOwned().getGender().equals("Женский") && getBasePrice() > 100) {

			setDateConfirmed(new Date());

		}
	}

	@Override
	public void calculatePrice() {
		if (getShipToCity().equals("Киев") || getShipToCity().equals("Одесса")) {
			setTotalPrice(getBasePrice() * 1.1);

		} else {
			setTotalPrice(getBasePrice() * 1.15);
		}
		if (getBasePrice() > 1000) {
			setTotalPrice(getTotalPrice()-getBasePrice() * 0.05);
		}

	}

}
