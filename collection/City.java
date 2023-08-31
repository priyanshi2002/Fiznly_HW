package collection;

public class City {
	private String name;
	private int pincode;
	
	public City()
	{
		
	}
	public City(String name,int pincode)
	{
		this.name=name;
		this.pincode=pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
   public String toString()
   {
	   return "City[name= "+name +" , Pincode= " +pincode+ "]";
   }
}
