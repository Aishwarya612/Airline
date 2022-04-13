package com.airlines.service;

import java.time.LocalDate;
import java.util.Collection;

import com.airlines.exception.FlightException;
import com.airlines.pojo.Flight;

public interface FlightService {
	
	 int addFlight(Flight flight) throws FlightException;
	
	 Collection<Flight> fetchAll();
	
	 Flight fetchFlight(String source, String destination, LocalDate scheduleDate) 
			throws FlightException;
	 
	 Collection<Flight> fetchFlightsOnCondition(String source, String destination, LocalDate scheduleDate) 
				throws FlightException;
	
	 int updateFlight(Flight flight) throws FlightException; //seatnotavailableexception
	 
	 void removeFlight(int flightNumber);
	 
	 Flight fetchById(int fid);
}