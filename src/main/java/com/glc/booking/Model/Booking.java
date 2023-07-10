package com.glc.booking.Model;


import java.time.LocalDate;
import java.time.ZonedDateTime;

import org.springframework.cglib.core.Local;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long hotelId;
    private String guestName;
    private String gmail;
    private String address;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private double totalPrice;
}
