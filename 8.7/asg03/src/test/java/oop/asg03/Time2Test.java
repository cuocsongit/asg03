package oop.asg03;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit test for Time2 class.
 */

 public class Time2Test
 {
	@Test
	public void testAddOneMinute()
	{
		Time2 testAddMinute = new Time2( 23 , 59, 34 );
		testAddMinute.incrementMinute();
		assertEquals(testAddMinute.toString(), ( new Time2( 0, 0, 34 ) ).toString() );
	}
	
	@Test
	public void testAddOneHour()
	{
		Time2 testAddHour = new Time2( 23, 6, 14 );
		testAddHour.incrementHour();
		assertEquals( testAddHour.toString(), ( new Time2( 0, 6, 14 ) ).toString() );
	}
	
	@Test
	public void testAddOneDay()
	{
		Time2 testAddDay = new Time2( 23, 59, 59 );
		testAddDay.tick();
		assertEquals( testAddDay.toString(), ( new Time2( 0, 0, 0 ) ).toString() );
	}
	
	@Test
	public void testToString()
	{
		Time2 testAddDay = new Time2( 23, 59, 59 );
		testAddDay.tick();
		assertEquals( testAddDay.toString(), "12:00:00 AM");
	}
}