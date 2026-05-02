package klu.fsadendexam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import klu.fsadendexam.Booking;
import klu.fsadendexam.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController 
{
    @Autowired
    private BookingService bookingService;

    // POST → Add Booking
    @PostMapping("/add")
    public Booking addBooking(@RequestBody Booking booking) 
    {
        return bookingService.addBooking(booking);
    }

    // DELETE → Delete Booking
    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable Integer id) 
    {
        return bookingService.deleteBooking(id);
    }
}