package klu.fsadendexam;



	import org.springframework.data.jpa.repository.JpaRepository;
	import klu.fsadendexam.Booking;


	public interface BookingRepository extends JpaRepository<Booking, Integer> 
	{
	}

