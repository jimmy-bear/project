package com.train;

public class Ticket {
    int number;
    int round_trip;
    static int One_way_fare=1000;
    static int Round_trip_fare=1800;

    public Ticket(int number, int round_trip) {
        this.number = number;
        this.round_trip = round_trip;
    }
        public int Total(){
        int total=(number-round_trip)*One_way_fare+round_trip*Round_trip_fare;
        return total;
    }
}
