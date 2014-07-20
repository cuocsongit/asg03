package asg03.date;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit test for Date class.
 */

 public class DateTest
 {
	@Test
	public void testNextDayIsNextMonth() 
	{
		Date date = new Date( 4, 30, 2014);
		date.nextDay();
		assertEquals( date.toString(), (new Date( 5, 1, 2014) ).toString() );
	}
	@Test
	public void testNextDayIsNewYear()
	{
		Date date = new Date( 12, 31, 2014);
		date.nextDay();
		assertEquals( date.toString(), ( new Date( 1, 1, 2015) ).toString() );
	}
}