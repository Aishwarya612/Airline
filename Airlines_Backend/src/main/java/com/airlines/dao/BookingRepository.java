package com.airlines.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.airlines.pojo.Booking;


public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
