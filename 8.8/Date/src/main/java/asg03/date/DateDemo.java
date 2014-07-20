/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asg03.date;

/**
 *
 * @author cuocsongit
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date( 12, 25, 2000);
        System.out.println( "The date is " + date.toString());
        for( int i = 0; i < 30; i++)
        {
            date.nextDay();
            System.out.println("Date is " + date.toString());
        }
    }
}
