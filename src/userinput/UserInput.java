/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = null;
        String place = null;
        Integer[] userinput = new Integer[6];
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = inputString(scan, "Enter your name: ");
        
        System.out.println("Enter a place: ");
        place = inputString(scan, "Enter a place: ");
        
        for(int i = 0; i < userinput.length; i++){
            System.out.println("Enter a number: ");
            
            while(!scan.hasNextInt()) {
                scan.next();
                System.out.println("Please enter a number: ");
            }
            userinput[i] = scan.nextInt();
        }
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println(name + " was walking into the forest. ");
        System.out.println("A small paper flew into the vicinity.");
        System.out.println("The paper said: Run away now.");
        System.out.println("The road split. On the left was a " + place);
        System.out.println("And on the right was a dark road covered in trees.");
        System.out.println(name + " went to the " + place);
        System.out.println(name + " went on to have " + userinput[0] + " children.");
        System.out.println("The dark road lead to a secret cave that held " + userinput[2] + " million dollars worth of diamonds.");
        System.out.println(name + " never had the courage to go down the road until he was pursued by " + userinput[5] + " motorcyclists.");
        System.out.println("And so , " + name + " lived happily ever after.");
    }
    
    /**
     *
     * @param scan
     * @param message
     * @return
     */
    public static String inputString (Scanner scan, String message) {
        String pattern = "[a-zA-Z]*";
        while(!scan.hasNext(pattern)){
            scan.next();
            System.out.println(message);
        }
        return scan.next(pattern);
    };
    
}
