package practise;

	class Animal {
		private String name;
		private int age;
		
		Animal(String name , int age)
		{
			this. name= name;
			this.age= age;
		}
		public String getName()
		{
			return name;
		}
		void setName(String name)
		{
			this.name= name;
		}
		public int getAge()
		{
			return age;
		}
		void setAge(int age)
		{
			this.age=age;
		} 
		
		void makesound() {
			System.out.println("Animal sounds");
		}
	}
	class Lion extends Animal
	{
		 public Lion(String name,int age)
		{
			super(name,age);
		}
		 @Override
		void makesound() {
			System.out.println("Rore!!");
		}
	}
	class Elephant extends Animal{
		public Elephant(String name, int age)
		{
			super(name,age);
		}
		 @Override
		void makesound(){
			System.out.println("trumphhh!!!");
		}
	}
	class Giraffe extends Animal{
	    public Giraffe(String name, int age)
	     {
	    	super(name,age);
	     }
	    @Override
		void makesound(){
			System.out.println("Neckyyy !!");
		}
	}
	public class Zoo {
	public static void main(String args[])
	{
		
		Animal a = new Animal("",0);
		Lion l = new Lion("Simba",20);
		Elephant e=new Elephant("bobo",10);
		Giraffe g = new Giraffe("dodo",21);
		
		a.makesound();
		l.makesound();
		e.makesound();
		g.makesound();
	}
}
