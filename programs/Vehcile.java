package programs;

interface vehicle{
	void start();
	void accelerate();
	void brake();
}
class Car implements vehicle
{
	 private String speed;
	 Car()
	{
		this.speed=speed;
	}
	public void start()
	{
	 System.out.println("Car has started");
	}
	
	public void accelerate()
	{
		System.out.println("Car's speed exceed");
	}
	
	public void brake()
	{
		System.out.println("Car has stopped");
	}
}

class Motorcycle implements vehicle{
	 private String speed;
	Motorcycle(){
		
		 this.speed=speed;
	}
	public void start()
	{
		 System.out.println("Motor cycle has started");
	}
	
	public void accelerate()
	{
		System.out.println("Motor cycle speed exceed");
	}
	
	public void brake()
	{
		System.out.println("MotorCycle has stopped");
	}
}
public class Vehcile {
	public static void main(String args[])
	{
		Car c = new Car();
		Motorcycle m = new Motorcycle();
		c.start();
		c.accelerate();
		c.brake();
		m.start();
		m.accelerate();
		m.brake();
	}
}
