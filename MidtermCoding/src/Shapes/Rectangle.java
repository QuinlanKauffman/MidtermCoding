package Shapes;

public class Rectangle extends Shape{

	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength)
	{
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	@Override
	public double area() {
		return (iWidth*iLength);
	}

	@Override
	public double perimeter() {
		return (2*iWidth + 2*iLength);
	}

	public void setiWidth(int iWidth)
	{
		this.iWidth = iWidth;
	}
	
	public void setiLength(int iLength)
	{
		this.iLength = iLength;
	}
	
	public int getiWidth()
	{
		return iWidth;
	}
	
	public int getiLength()
	{
		return iLength;
	}
	
	//Compare to method
	
	public int compareTo(Object obj)
	{
		return 0;
	}
}
