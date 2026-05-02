package klu.fsadendexam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking_table")
public class Booking 
{
    @Id
    private Integer bookingId;   // MUST be manually provided

    private String name;
    private String date;
    private String status;

    // Constructors
    public Booking() {}

    public Booking(Integer bookingId, String name, String date, String status) 
    {
        this.bookingId = bookingId;
        this.name = name;
        this.date = date;
        this.status = status;
    }

    // Getters and Setters
    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}