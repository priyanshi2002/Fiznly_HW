package practise;

class Room {
    private int roomNumber;
    private static int capacity=10;
    private int pricePerNight;
    private boolean isReserved;

    public Room(int roomNumber, int capacity, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
    }

    int getRoomNumber()
    {
    	return roomNumber;
    }
    void setRoomNumber()
    {
    	this.roomNumber=roomNumber;
    }
    int getCapacity()
    {
    	return capacity;
    }
    void setCapacity()
    {
    	this.capacity=capacity;
    }
     
    int getPricePerNight()
    {
    	return pricePerNight;
    }
    void setPricePerNight()
    {
    	this.pricePerNight=pricePerNight;
    }
    
    public boolean checkAvailability()
    {
    	return !isReserved;
    }
    void makeReservation()
    {
    	if(!isReserved)
    	{
    		isReserved=true;
    		System.out.println("room Number: "+roomNumber+" is available");
    	    
    	}else {
    		System.out.println("Room Number+ " + roomNumber+" is not available");
    	}
    }
    void makeReservation(int checkIn , int checkOut)
    {
    	if(!isReserved)
    	{
    		isReserved=true;
    		System.out.println("Room is available reserved from "+ checkIn + "to " +checkOut+" ");
    		
    	}else{
    		System.out.println("Room Number+ " + roomNumber+" is not available");
    	}
    }
    @Override
    public String toString()
    {
    	return "Room Number: "+ roomNumber+ "\nCapacity "+ capacity+"\nPrice per night " +pricePerNight;
    }
    public static void main(String[] args) {
       Room r1= new Room(101,9,3000);
       Room r2 = new Room(102,8,3000);
       System.out.println("Room 101 is available: " + r1.checkAvailability());
       r1.makeReservation();
       System.out.println("Room 101 is available: " + r1.checkAvailability());
       
       System.out.println();
       System.out.println("Room 102 is available: "+r2.checkAvailability());
       r2.makeReservation(5,7);
       System.out.println("Room 102 is available: "+r2.checkAvailability());
       
       System.out.println("\nRoom 101 Details:\n" + r1);
       System.out.println("\nRoom 102 Details:\n" + r2);      
        
    }
}