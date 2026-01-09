/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kandy kochar
 */

    /**
 * This class tests the SecretMessage with the requested samples
 */
public class MessageTest {
    public static void main(String[] args) {
        // Sample 1: THE ZEBRA IS ON THE WAY with displacement 5
        System.out.println("Sample Run 1: The character array is rotated by 5");
        SecretMessage sample1 = new SecretMessage("THE ZEBRA IS ON THE WAY", 5);
        System.out.println(sample1);
        System.out.println("----------------------------------------");
        
        // Sample 2: HELP IN DANGER with displacement 4
        System.out.println("Sample Run 2: The character array is rotated by 4");
        SecretMessage sample2 = new SecretMessage("HELP IN DANGER", 4);
        System.out.println(sample2);
        System.out.println("----------------------------------------");
        
        // Sample 3: MY NAME IS KANDY KOCHAR with displacement 7
        System.out.println("Additional Test: Displacement 7");
        SecretMessage sample3 = new SecretMessage("MY NAME IS KANDY KOCHAR", 7);
        System.out.println(sample3);
    }
}
