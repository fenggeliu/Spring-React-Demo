package com.tonylib.hoteldemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fengge on 7/16/2017.
 */

@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long> {
    List<HotelBooking> findByPricePerNightLessThan(double price);
}
