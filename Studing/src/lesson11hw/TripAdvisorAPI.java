package lesson11hw;

public class TripAdvisorAPI implements API {
	Room[] rooms;

	public TripAdvisorAPI(Room[] rooms) {
		this.rooms = rooms;
	}

	private static Room[] sorter(Room[] list, int count) {
		Room[] sortlist = new Room[count];
		int iterator = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				sortlist[iterator] = list[i];
				iterator++;
			}
		}
		return sortlist;
	}

	@Override
	public Room[] findRooms(int price, int persons, String city, String hotel) {
		Room[] list;
		if (rooms != null) {
			list = new Room[rooms.length];
		} else {
			return null;
		}
		int count = 0;
		for (int index = 0; index < rooms.length; index++) {
			if (rooms[index] != null && rooms[index].getPersons() <= (persons + 1)
					&& rooms[index].getPersons() >= (persons - 1) && rooms[index].getPrice() == price
					&& rooms[index].getCityName().equalsIgnoreCase(city)
					&& rooms[index].getHotelName().equalsIgnoreCase(hotel)) {
				list[index] = rooms[index];
				count++;
			} else {
				list[index] = null;
			}

		}
		return sorter(list, count);

	}

	@Override
	public Room[] getAll() {

		return rooms;
	}

}