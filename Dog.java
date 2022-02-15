class Cat
{
	/*
	//Shallow Cloning
	int x;
	Cat(int x)
	{
		this.x=x;
	}
}
class Dog implements Cloneable
{
	int y;
	Cat c;
	Dog(int y,Cat c)
	{
		this.y=y;
		this.c=c;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Cat c1=new Cat(10);
		Dog d=new Dog(20,c1);
		System.out.println(d.c.x+ " " +d.y);
		Dog d1=(Dog)d.clone();
		System.out.println(d.c.x+ " " +d.y);
		System.out.println(d1.c.x+ " " +d.y);
		d.c.x=100;
		d.y=200;
		System.out.println(d.c.x+ " " +d.y);
		System.out.println(d1.c.x+ " " +d1.y);
	}
	*/
	int x;
	Cat(int x)
	{
		this.x=x;
	}
}
class Dog implements Cloneable
{
	int y;
	Cat c;
	Dog(int y,Cat c)
	{
		this.y=y;
		this.c=c;
	}
	public Object clone()
	{
		Cat c2=new Cat(this.c.x);
		Dog d2=new Dog(this.y,c2);
		return d2;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Cat c1=new Cat(10);
		Dog d=new Dog(20,c1);
		System.out.println(d.c.x+ " " +d.y);
		Dog d1=(Dog)d.clone();
		System.out.println(d.c.x+ " " +d.y);
		System.out.println(d1.c.x+ " " +d1.y);
		d.c.x=100;
		d.y=200;
		System.out.println(d.c.x+ " " +d.y);
		System.out.println(d1.c.x+ " " +d1.y);
	}
	
	New Changes 
	
}
		
		
