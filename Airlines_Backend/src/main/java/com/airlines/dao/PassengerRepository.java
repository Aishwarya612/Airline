package com.airlines.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.airlines.pojo.Booking;
import com.airlines.pojo.Flight;
import com.airlines.pojo.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger, Integer> {



	@Query("Select p from Passenger p join p.booking b  where b.flight.flightNumber=:id")
    List<Passenger> findByFlightNo( @Param("id")  int fno);
}
