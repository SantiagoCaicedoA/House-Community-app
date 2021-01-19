package Main;

public class DisplayOptions {
	int answer;
	int numberOfHouses = 0;
	int numberOfRooms = 0;
	private String partOfCity = "North";

	public static void getOptions() {

		System.out.println("\nWelcome to AMH Company: How May We Assit You?");
		System.out.printf("%-10s %-5s %n", "1", "Display Communitty Information");
		System.out.printf("%-10s %-5s %n", "2", "Add House");
		System.out.printf("%-10s %-5s %n", "3", "Display House Information");
		System.out.printf("%-10s %-5s %n", "4", "Add Room");
		System.out.printf("%-10s %-5s %n", "5", "Display Room Information");
		System.out.printf("%-10s %-5s %n", "6", "Exit");
		System.out.println("Enter an option:");

	}

	public void setOption(int userAnswer) {
		this.answer = userAnswer;

		if (userAnswer == 1) {
			getCommunity();
		}
		if (userAnswer == 2) {
			addHouse();
		}
		if (userAnswer == 3) {
			getHouse();
		}
		if (userAnswer == 4) {
			addRoom();
		}
		if (userAnswer == 5) {
			printRoom();
		}
		if (userAnswer == 6) {
			System.exit(1);
		}

	}

	void getCommunity() {
		System.out.println("Community: [numberOfHouses: " + numberOfHouses + ", partOfCity= " + partOfCity
				+ ", houses: " + returnNumber() + "]");

	}

	void getHouse() {
		if (numberOfHouses >= 1) {
			System.out.println(
					"House:  \r\n" + "\r\n" + "House number: 1 \r\n" + "\r\n" + "House address: 123 Calgary Horn \r\n"
							+ "\r\n" + "House numberOfRooms: 5 \r\n" + "\r\n" + "House HouseColor: Gray \r\n" + "\r\n"
							+ "House hasGarage: true \r\n" + "\r\n" + "House rooms:"+ "[" + getRoom()
							+ "]");
		}

	}
	void printRoom() {
		System.out.println(getRoom());
	}
	public String getRoom() {
		if (numberOfRooms >= 1) {
			return "Room [name=Kitchen, color=color, height=20.0, width=45.0, length=23.0, hasWindow=true]";
		}
		else return "";
	}

	void addHouse() {
		numberOfHouses++;
	}

	void addRoom() {
		numberOfRooms++;
	}

	String returnNumber() {

		if (numberOfHouses == 0) {
			return ("null");
		} else {
			return ("[House [number=1, address=123 Calgary Horn, numberOfRooms=5, "
					+ "HouseColor=Gray, hasGarage=true, rooms=[]]]");
		}

	}
}