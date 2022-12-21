class Rectangle 
{
	static void area( int a, int b)
	{
		int area = a * b;
		System.out.println("Area of the rectangle is " + area +" Square meter");
	}
	public static void main(String[] args) 
	{
		System.out.println("------Main starts------");
		area(5,10);
		System.out.println("------Main ends------");
	}
}