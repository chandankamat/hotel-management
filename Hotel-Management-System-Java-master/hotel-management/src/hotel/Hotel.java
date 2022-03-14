package hotel;

public class Hotel {
	
    private String hotelName;
    private String hotelAddress;
	
	private Hotel(String hotelName,String hotelAddress)
	{
		this.setHotelName(hotelName);
		this.setHotelAddress(hotelAddress);
	}
	
	private static final Hotel INSTANCE = new Hotel("CRESCENT","HUBLI");
	
	public static Hotel getInstance()
	{
		return INSTANCE;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

}
 

