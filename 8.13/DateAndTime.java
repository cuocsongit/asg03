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
public class DateAndTime {

    private Time time;
    private Date date;
  
    //contructor : date and time are supplied
    public DateAndTime(int hour, int minute, int second, int month, int day, int year)
    {
        time = new Time(hour, minute, second);
        date = new Date(month, day, year);
    }
    
    //contructor: date and time object are supplied
    public DateAndTime(Time theTime, Date theDate)
    {
        time = new Time(theTime.getHour(), theTime.getMinute(), theTime.getSecond() );
        date = new Date(theDate.getMonth(), theDate.getDay(), theDate.getYear());
    }
    
    // convert to String in standard-time format (H:MM:SS AM or PM MM-DD-YYYY)
    public String toStandardString()
    {
        return String.format("%s %02d-%02d-%04d", time.toString(), 
                date.getMonth(), date.getDay(), date.getYear());
    }
    //end method toStandardString
    
    // convert to String in universal-time format (HH:MM:SS M MM-DD-YYYY) 
     public String toUniversalString()
    {
        return String.format("%s %02d-%02d-%04d", time.toUniversalString(), 
                date.getMonth(), date.getDay(), date.getYear());
    }
    //end method toUniversalString
     
    // add one hour
     public void  incrementHour() {
         if(time.getHour() == 23 )
         {
             time.incrementHour();
             date.nextDay();
         }
         else
         {
             time.incrementHour();
         }
     }
     //end method incrementHour
     
     // add one minute
     public void  incrementMinute() {
         if(time.getHour() == 23 && time.getMinute() == 59)
         {
             time.incrementMinute();
             date.nextDay();
         }
         else
         {
             time.incrementMinute();
         }
     }
     //end method incrementMinute
     
     // add one second
     public void  tick() {
         if(time.getHour() == 23 && time.getMinute() == 59 && time.getSecond() == 59)
         {
             time.tick();
             date.nextDay();
         }
         else
         {
             time.tick();
         }
     }
     //end method tick
}
//end class DateAndTime