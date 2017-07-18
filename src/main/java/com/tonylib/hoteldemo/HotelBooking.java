package com.tonylib.hoteldemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by fengge on 7/16/2017.
 */

@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String hotelName;
    private Double pricePerNight;
    private int nbOfNights;

    public HotelBooking(){

    }

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNights){

        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getNbOfNights() {
        return nbOfNights;
    }

    public Double getPricePerNight() {
        return pricePerNight;
    }

    public double getTotalPrice(){
        return pricePerNight * nbOfNights;
    }

    public long getId() {
        return id;
    }
}

