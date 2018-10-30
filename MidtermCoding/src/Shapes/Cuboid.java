package Shapes;

import java.util.Comparator;
import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class Cuboid extends Rectangle{

	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
		super.setiLength(iLength);
		super.setiWidth(iWidth);
	}
	
	public int getiDepth()
	{
		return iDepth;
	}

	public void setiDepth(int iDepth)
	{
		this.iDepth = iDepth;
	}
	
	
	
	@Override
	public double perimeter() {
		//throws exception
		try
        { 
            // Throw an object of user defined exception 
            throw new UnsupportedOperationException(); 
        } 
        catch (UnsupportedOperationException ex) 
        { 
            System.out.println("Caught"); 
  
            // Print the message from the exception
            System.out.println(ex.getMessage()); 
        } 
		return 0;
	}
	
	
	@Override
	public double area()
	{
		return (2*super.getiLength()*super.getiWidth() + 2*super.getiLength()*iDepth + 2*super.getiWidth()*iDepth);
	}
	
	public double volume()
	{
		return (super.getiWidth()*super.getiLength()*iDepth);
	}

	
	@Override
	public int compareTo(Object obj)
	{
		SortByArea s = new SortByArea();
		return s.compare(this,(Cuboid) obj);
	}


	public class SortByVolume implements Comparator<Cuboid>{
		SortByVolume(){}
		
		public int compare(Cuboid c1, Cuboid c2)
		{
			if (c1.volume() < c2.volume())
				return -1;
			if (c1.volume() > c2.volume())
				return 1;
			return 0;
		}
	}
	 
	
	public class SortByArea implements Comparator<Cuboid>{
		SortByArea(){}
		
		public int compare(Cuboid c1, Cuboid c2)
		{
			if (c1.area() < c2.area())
				return -1;
			if (c1.area() > c2.area())
				return 1;
			return 0;
		}
	}
}
