package com.train

import java.util.*

fun main() {
    val scanner=Scanner(System.`in`)
    println("Please enter number of tickets:")
    val number=scanner.nextInt()
    println("How many round-trip tickets:")
    val round_trip=scanner.nextInt()
    var ticketKotlin=TicketKotlin(number, round_trip)
    println(
        "Total tickets:" + number + " Round-trip:" + round_trip + " Total:"
    +ticketKotlin.TotalKotlin()
    )
}
class TicketKotlin(val number:Int,val round_trip:Int){
    fun TotalKotlin():Int{
        val One_way_fare = 1000
        val Round_trip_fare = 1800
        return (number - round_trip) * One_way_fare + round_trip * Round_trip_fare
    }
}