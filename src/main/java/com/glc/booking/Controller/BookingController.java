package com.glc.booking.Controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glc.booking.Model.Booking;
import com.glc.booking.Repository.BookingRepository;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
    @PostMapping("/add")
    public ResponseEntity<Booking> bookStay(@RequestBody Booking booking){
        Booking savedBooking = bookingRepository.save(booking);
        return ResponseEntity.ok(savedBooking);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable Long id){
        Optional<Booking> optionalBooking = bookingRepository.findById((id));
        return optionalBooking.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }
}
