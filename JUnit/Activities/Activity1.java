
package activities;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
	
	static ArrayList<String> list;
	
	@BeforeAll
	static void setUp() {
		System.out.println("Inside setUp method");
		list = new ArrayList<String>();
		list.add("alpha");
		list.add("beta");
	}
	
	
	@Test
	public void insertTest()
	{
		System.out.println("Inside insertTest Method now");
		
		System.out.println("values of the list at the beginning of insertTest is ");
		
		for ( String l : list)
		{
			System.out.println(l);
		}
		int actualArraySize1=list.size();
		assertEquals(2,actualArraySize1);
		System.out.println("Verifying the original ArraySize is done");
		list.add("charlie");
		int actualArraySize2=list.size();
		assertEquals(3,actualArraySize2);
		System.out.println("Verifying the ArraySize after Insertion is done");
		assertEquals("alpha",list.get(0));
		assertEquals("dhara",list.get(1));
		assertEquals("charlie",list.get(2));
		System.out.println("Verifying each item on the ArrayList is done");
		System.out.println("values of the list at the end of insertTest is ");
		
		for ( String l : list)
		{
			System.out.println(l);
	}
		
	}
	
	@Test
	public void replaceTest()
	{
		
		System.out.println("Inside replaceTest method now");	
		System.out.println("values of the list at the beginning of replaceTest is ");
		
		for ( String l : list)
		{
			System.out.println(l);
		}
		
		
/*		

//		int actualArraySize2=list.size();
//		assertEquals(2,actualArraySize2);
//		System.out.println("Verifying the ArraySize in replace method is done");
//		list.add("rep3");
//		actualArraySize2=list.size();
//		assertEquals(3,actualArraySize2);
//		System.out.println("Verifying the ArraySize in replace method is done");*/
		list.set(1, "dhara");
		//System.out.println(list.size());
		assertEquals(2,list.size());
		System.out.println("Verifying the array size after replace action is verified");
		assertEquals("alpha",list.get(0));
		assertEquals("dhara",list.get(1));
		System.out.println("Verifying each item on the ArrayList is done");
		
		System.out.println("values of the list at the end of replaceTest is ");
		
		for ( String l : list)
		{
			System.out.println(l);
		}
		
			
	}
	
	}


