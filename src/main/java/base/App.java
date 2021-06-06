/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        int age = myApp.readAge();
        System.out.println(myApp.legal(age));
    }
    private int readAge(){
        System.out.print("What is your age? ");
        return inp.nextInt();
    }
    private String legal(int age){
        return ((age < 16) ? "You are not old enough to legally drive.\n" : "You are old enough to legally drive.\n");
    }
}
