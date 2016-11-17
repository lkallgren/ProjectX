package models;

public class Seat {
	
	//private int id;
	//private String name;
	private int seatNo;
	private boolean isbooked = false;
	
	
	public Seat(int seatNo){
		this.seatNo = seatNo;
		
	}
	
	public Seat(int seatNo, boolean booked){
		this.seatNo = seatNo;
		this.isbooked = true;
		
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public boolean isIsbooked() {
		return isbooked;
	}

	public void setIsbooked(boolean isbooked) {
		this.isbooked = isbooked;
	}
	

}
