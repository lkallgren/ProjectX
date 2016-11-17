package models;

import java.util.ArrayList;
import java.util.List;

public class Plane extends Booking{
	
	
	private List<Seat> seats; 
	
	private int counterFirstClass;
	private int counterEconomyClass;
	private int noOfBookedSeats;
	
	public Plane(Passenger passenger, Food food, int seatNo) {
		super(passenger, food, seatNo);
		}
	
	@Override
	public Passenger getBookedPassenger() {
		return super.getBookedPassenger();
	}

	@Override
	public void setBookedPassenger(Passenger bookedPassenger) {
		super.setBookedPassenger(bookedPassenger);
	}

	@Override
	public Food getBookedFood() {
		return super.getBookedFood();
	}

//	@Override
//	public void setBookedFood(Food bookedFood) {
//		 super.setBookedFood(bookedFood);
//	}
//
//
//	@Override
//	public int getBookedSeatNo() {
//		return super.getBookedSeatNo();
//	}

//	public Plane() {
//		 seats = new ArrayList<Seat>();
//	}
//	
//	public Booking(Passenger passenger, Food food) {
//		this.bookedPassenger = passenger;
//		this.bookedFood = food;		
//	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
	
	//get arraylist.
	
	
	//find seat in array?
	
	
	
	

}
