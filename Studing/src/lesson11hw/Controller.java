package lesson11hw;

public class Controller {
	private API[] apis;

	public Controller(API[] apis) {

		this.apis = apis;
	}

	private static Room[] connection(Room[] firstArray, Room[] secondArray) {

		int fLen = firstArray.length;
		int sLen = secondArray.length;
		Room[] returnArray = new Room[fLen + sLen];
		System.arraycopy(firstArray, 0, returnArray, 0, fLen);
		System.arraycopy(secondArray, 0, returnArray, fLen, sLen);
		return returnArray;

	}

	public Room[] requestRooms(int price, int persons, String city, String hotel) {
		Room[] resultArray = new Room[0];
		for (API api : apis) {
			resultArray = connection(resultArray, api.findRooms(price, persons, city, hotel));
		}

		return resultArray;
	}

	public Room[] check(API api1, API api2) {
		Room[] list1 = api1.getAll();
		Room[] list2 = api2.getAll();
		Room[] list = new Room[list1.length];
		int count = 0;
		for (int i = 0; i < list1.length; i++) {
			for (int i2 = 0; i2 < list2.length; i2++) {
				if (list1[i].getCityName().equalsIgnoreCase(list2[i2].getCityName())
						&& list1[i].getHotelName().equalsIgnoreCase(list2[i2].getHotelName())
						&& list1[i].getPersons() == list2[i2].getPersons()
						&& list1[i].getPrice() == list2[i2].getPrice() && list1[i].getId() != list2[i2].getId()
						&& !list1[i].getDateAvailableFrom().equals(list2[i2].getDateAvailableFrom())  ) {
					list[count] = list1[i];
					count++;
				}
			}
		}

		return list;

	}

}