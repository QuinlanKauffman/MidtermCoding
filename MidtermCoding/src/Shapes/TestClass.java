package Shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

import Shapes.Cuboid.SortByArea;

public class TestClass {

	@Test
	public void testRec1()
	{
		Rectangle rec1 = new Rectangle(5,4);
		System.out.println("The area of the rectangle is: ");
		System.out.println(rec1.area());
		
		System.out.println("The perimeter of the rectangle is: ");
		System.out.println(rec1.perimeter());
		
	}
	
	@Test
	public void testRec2()
	{
		Rectangle rec1 = new Rectangle(6,3);
		System.out.println("The area of the rectangle is: ");
		System.out.println(rec1.area());
		
		System.out.println("The perimeter of the rectangle is: ");
		System.out.println(rec1.perimeter());
		
	}
	
	@Test
	public void testCuboid1()
	{
		Cuboid cub1 = new Cuboid(8,3,6);
		System.out.println("The volume of the cuboid is: ");
		System.out.println(cub1.volume());
		
		System.out.println("The surface area of the cuboid is: ");
		System.out.println(cub1.area());
		
		System.out.println("The perimeter of the cuboid is: ");
		cub1.perimeter();
		
	}
	
	@Test
	public void testCuboid2()
	{
		Cuboid cub1 = new Cuboid(1,1,1);
		System.out.println("The volume of the cuboid is: ");
		System.out.println(cub1.volume());
		
		System.out.println("The surface area of the cuboid is: ");
		System.out.println(cub1.area());
		
		System.out.println("The perimeter of the cuboid is: ");
		cub1.perimeter();
		
	}
	
	@Test
	public void testRecComparator1()
	{
		Rectangle r1 = new Rectangle(5,4);
		Rectangle r2 = new Rectangle(1,1);
		
		System.out.println("Compare here first time: ");
		System.out.println(r1.compareTo(r2));
	}
	
	
	@Test
	public void testRecComparator2()
	{
		Rectangle r1 = new Rectangle(1,1);
		Rectangle r2 = new Rectangle(5,4);
		
		System.out.println("Compare here second time: ");
		System.out.println(r1.compareTo(r2));
	}
	
	
	@Test
	public void testCuboidComparator1()
	{
		Cuboid c = new Cuboid(0,0,0);
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>(); 
        ar.add(new Cuboid(1,1,1)); 
        ar.add(new Cuboid(5,4,3)); 
        ar.add(new Cuboid(6,6,6)); 
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
        {
            System.out.println(ar.get(i));
        }
        
        Collections.sort(ar, c.compareTo(ar(i))); 
       
        //Collections.sort(array, new PacketComparator());
        //How to call the comparator, but doesn't work because comparator is a nested class
        
        System.out.println("Sorted by volume"); 
        for (int i=0; i<ar.size(); i++) 
        {
            System.out.println(ar.get(i)); 
        }
        	
		
		
	}
}