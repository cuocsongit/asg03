/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package date_time;

/**
 *
 * @author cuocsongit
 */


public class Time
{
   final int secondOfMinute = 60;
   final int secondOfHour = 3600;
   final int hourOfDay = 24;
   private int second; // 0 - 24*3600 

   // Time no-argument constructor: initializes each instance variable 
   // to zero; ensures that Time objects start in a consistent state
   public Time()
   {
      second = 0;
   } // end Time no-argument constructor

   // Time2 constructor: hour supplied, minute and second defaulted to 0
   public Time( int h ) 
   { 
	  h = (( h >= 0 && h < 24) ? h : 0);
      second = h * secondOfHour;
   } // end Time one-argument constructor

   // Time constructor: hour and minute supplied, second defaulted to 0
   public Time( int h, int m ) 
   { 
      h = (( h >= 0 && h < 24) ? h : 0);
	  m = (( m >= 0 && m < 60) ? m : 0);
	  second = h * secondOfHour + m * secondOfMinute;
   } // end Time two-argument constructor 

   // Time2 constructor: hour, minute and second supplied
   public Time( int h, int m, int s ) 
   {
	  h = (( h >= 0 && h < 24) ? h : 0);
	  m = (( m >= 0 && m < 60) ? m : 0);
	  s = (( s >= 0 && s < 60) ? s : 0);
	  second = h * secondOfHour + m * secondOfMinute + s;
   } // end Time three-argument constructor 

   // Time2 constructor: another Time object supplied
   public Time( Time time )
   {
      // invoke Time2 three-argument constructor
      this( time.getHour(), time.getMinute(), time.getSecond());
   } // end Time2 constructor with a Time2 object argument

   // Set Methods
   // set a new time value using universal time; ensure that 
   // the data remains consistent by setting invalid values to zero
   public void setTime( int h, int m, int s)
   {
      setHour( h );   // set the hour
      setMinute( m ); // set the minute
      setSecond( s ); // set the second
   } // end method setTime

   // validate and set hour 
   public void setHour( int h ) 
   { 
      h = ( ( h >= 0 && h < 24 ) ? h : 0 );
	  second = second - getHour() * secondOfHour + h * secondOfHour;
   } // end method setHour

   // validate and set minute 
   public void setMinute( int m ) 
   { 
      m = ( ( m >= 0 && m < 60 ) ? m : 0 );
	  second = second - getMinute() * secondOfMinute + m * secondOfMinute;
   } // end method setMinute

   // validate and set second 
   public void setSecond( int s ) 
   { 
	  s = ( ( s >= 0 && s < 60) ? s : 0 );
      second = second - getSecond() + s;
   } // end method setSecond

   // Get Methods
   // get hour value
   public int getHour() 
   { 
      return second / secondOfHour; 
   } // end method getHour

   // get minute value
   public int getMinute() 
   { 
      return ( second - getHour() * secondOfHour ) / secondOfMinute; 
   } // end method getMinute

   // get second value
   public int getSecond() 
   { 
      return second - getHour() * secondOfHour - secondOfMinute * getMinute(); 
   } // end method getSecond

   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString()
   {
      return String.format( 
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
   } // end method toUniversalString

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format( "%d:%02d:%02d %s", 
         ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
   } // end method toString
   
   // add one second
   public void tick() 
   {
	  second = ( second + 1) % ( secondOfHour * hourOfDay);
   }
   
   //add one minute
   public void incrementMinute()
   {
      second = ( second + secondOfMinute ) % ( secondOfHour * hourOfDay );
   }
   
   //add one minute
   public void incrementHour()
   {
      second = ( second + secondOfHour ) % ( secondOfHour * hourOfDay );
   }
} // end class Time2

/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
