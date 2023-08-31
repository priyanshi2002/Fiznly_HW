package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Country {
  ArrayList<City>m1(){
	  
	  City c1=new City("Indore" , 453771);
	  City c2=new City("Jabalpur",483880);
	  City c3=new City("Mandla" , 481998);
	  City c4=new City("Dhar" , 454775);
	  City c5=new City("Balaghat" , 481665);
	  City c6=new City("Pune" , 111045);
	  City c7=new City("Bhusawal" , 41101);
	  City c8=new City("Mumbai" , 411000);
	  City c9=new City("Banglore" , 560091 );
	  City c10=new City("K G road" , 560009);
	  City c11=new City("kothanur" , 560077);
	  
	  ArrayList<City> almp=new ArrayList<>();
	  almp.add(c1);
	  almp.add(c2);
	  almp.add(c3);
	  almp.add(c4);
	  almp.add(c5);
	  
	  ArrayList<City> almh = new ArrayList<>();
	  almh.add(c6);
	  almh.add(c7);
	  almh.add(c8);
	  
	  ArrayList<City> albglr = new ArrayList<>();
	  albglr.add(c9);
	  albglr.add(c10);
	  albglr.add(c11);
	  
	  HashMap<String , ArrayList<City>> hm = new HashMap<>();
	  hm.put("Madhya Pradesh", almp);
	  hm.put("Maharashtra", almh);
	  hm.put("Banglore", albglr);
	  
	  TreeMap<String,HashMap<String,ArrayList<City>>> tm= new TreeMap<>();
	return almp;
	  
  }
  
  public static void main(String[] args) {
	Country c = new Country();
	c.m1();
}
}
