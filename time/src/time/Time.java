/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package time;

/**
 *
 * @author bhian
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyTime myTime = new MyTime(10, 30, 45, true);
        System.out.println("Time: " + myTime.toString());
        
        myTime.advanceSeconds(120);
        System.out.println("After adding 120 seconds:");
        System.out.println("Time: " + myTime.toString());
        myTime.advanceSeconds(400);
        System.out.println("After adding 400 seconds:");
        System.out.println("Time: " + myTime.toString());
    }
    
}
