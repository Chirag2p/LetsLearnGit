class Codeplanet
{
	/*
	public final void add(int x, int y)
	{
		System.out.println(x+y);
	}
}
class Techno extends Codeplanet
{
	public void add(int x, int y)
	{
		System.out.println(x*y);
	}
	public static void main()
	{
		Codeplanet cp = new Techno();
		cp.add(10,20);
	}
	*/
	static int x=10;
	public void csd(int... z)
	{
		x =x+5;
	}
	public static void csd1(int... z)
	{
		x =x+8;
	}
}
class Techno extends Codeplanet 
{
	static int x=20;
	public void csd(int... y)
	{
		x =x+10;
	}
	public static void csd1(int... z)
	{
		x =x+12;
	}
	public static void main(String[] args)
	{
		Codeplanet t= new Techno();
		t.csd(10,20);
		t.csd1(10,20);
		System.out.println(t.x);
	}	
}
	