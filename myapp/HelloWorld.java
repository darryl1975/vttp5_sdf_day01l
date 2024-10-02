package myapp;

import java.io.Console;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Console console = System.console();
        String name = console.readLine("What is your name?");

        System.out.println("your name is ..." + name);


        String sport = console.readLine("What is the sport that you like to do?");

        if (sport.toUpperCase().equals("SWIMMING")) {
            System.out.println("That's a nice water sports");
        } else if (sport.toUpperCase().equals("SOCCER")) {
            System.out.println("It's a worldy accepted sports");
        } else {
            System.out.println("I am not sure about the sports you like.");
        }

        String replacedName = name.replace('a', 'e');
        System.out.printf("your name ... %s \n", replacedName);
        
    }
}