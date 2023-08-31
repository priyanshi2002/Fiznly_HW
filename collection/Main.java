package collection;

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
	Country c= new Country();
	ArrayList<City> al= c.m1();
	
	for(City city : al)
	{
		if(city.getName()=="Indore")
		{
			System.out.println(city);
		}
	}
}
}
