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
public class DateAndTimeDemo {
    public static void main(String [] args)
    {
        DateAndTime obj = new DateAndTime(1 , 4, 45, 4, 30, 2015);
        obj.incrementHour();
        
        DateAndTime obj2 = new DateAndTime(new Time(23, 59, 5), new Date(12, 31, 2011));
        obj2.incrementMinute();
        
        DateAndTime obj3 = new DateAndTime(new Time(23, 59, 59), new Date(12, 31, 2011));
        obj3.tick();
        obj2.incrementMinute();
        System.out.println(obj.toStandardString() );
        System.out.println(obj2.toUniversalString() );
        System.out.println(obj3.toStandardString());
    }
}
