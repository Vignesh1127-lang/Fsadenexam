package klu.fsadendexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import klu.fsadendexam.Booking;
import klu.fsadendexam.BookingRepository;

@Service
public class BookingService 
{
    @Autowired
    private BookingRepository bookingRepository;

    // Add Booking
    public Booking addBooking(Booking booking) 
    {
        return bookingRepository.save(booking);
    }

    // Delete Booking
    public String deleteBooking(Integer id) 
    {
        if(bookingRepository.existsById(id)) 
        {
            bookingRepository.deleteById(id);
            return "Booking Deleted Successfully";
        } 
        else 
        {
            return "Booking ID Not Found";
        }
    }
}
