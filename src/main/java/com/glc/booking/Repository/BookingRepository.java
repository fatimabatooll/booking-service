package com.glc.booking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glc.booking.Model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
