package models;

public class Booking {
	
	//private Plane flight;
	private int bookedSeatNo;
	private Passenger bookedPassenger;
	private Food bookedFood;
	
	public Booking(Passenger passenger, Food food, int seatNo ) {
		this.bookedPassenger = passenger;
		this.bookedFood = food;	
		this.bookedSeatNo = seatNo;
	}

	public Passenger getBookedPassenger() {
		return bookedPassenger;
	}

	public void setBookedPassenger(Passenger bookedPassenger) {
		this.bookedPassenger = bookedPassenger;
	}

	public Food getBookedFood() {
		return bookedFood;
	}

	public void setBookedFood(Food bookedFood) {
		this.bookedFood = bookedFood;
	}

//	public Plane getFlight() {
//		return flight;
//	}

	public int getBookedSeatNo() {
		return bookedSeatNo;
	}

}
