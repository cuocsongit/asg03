/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop.asg03;

/**
 *
 * @author cuocsongit
 */
public class Time2Demo {
    public static void main(String [] args) {
        Time2 timeDemo = new Time2( 2, 23, 45);
        timeDemo.setHour(24);
        timeDemo.setMinute(78);
        timeDemo.setSecond(-1);
    }
}
