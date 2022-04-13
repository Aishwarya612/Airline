package com.airlines.service;

import java.util.List;

import com.airlines.pojo.Booking;
import com.airlines.pojo.Passenger;
import com.airlines.pojo.Ticket;

public interface BookingService {
	
	int addBooking(Booking booking);
	
	int addPassenger(Passenger passenger, int bookingId);
	
	Ticket generateTicket(Ticket ticket, int userId, int bookingId);
	
	List<Ticket> getTicket(int uid);
	
	Booking getBookingById(int bid);
	
	void updateBooking(Booking bookPay);
	
	List<Passenger> getPassenger(int fno);
	
}
