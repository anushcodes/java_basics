//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//package com.java.basicapplication; 
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter your name");
        //Scanner scanner = new Scanner(System.in);
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        //String customerName = scanner.nextLine();
        String customerName = bReader.readLine();
        System.out.println("Hello "+customerName+" "+new com.java.basicapplication.BasicApplication());
        //scanner.close();
        bReader.close();

    }
}
