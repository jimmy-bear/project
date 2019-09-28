package com.train;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int number = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int round_trip = scanner.nextInt();
        Ticket ticket=new Ticket(number,round_trip);
        System.out.println( "Total tickets:"+number+" Round-trip:"+round_trip+" Total:"
                +ticket.Total());

    }
}
