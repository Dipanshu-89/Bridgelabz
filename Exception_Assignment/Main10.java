package Bridgelabz.Exception_Assignment;
import java.util.*;
class InvalidSeatException extends Exception {
    public InvalidSeatException(String msg) { super(msg); }
}
class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String msg) { super(msg); }
}
class MovieHall {
    Map<Integer, Boolean> seats = new HashMap<>();

    public MovieHall() {
        for (int i = 1; i <= 10; i++) seats.put(i, true);
    }

    public void bookSeat(int seat) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seat))
            throw new InvalidSeatException("Invalid seat number!");

        if (!seats.get(seat))
            throw new SeatAlreadyBookedException("Seat already booked!");

        seats.put(seat, false);
        System.out.println("Seat booked successfully: " + seat);
    }
}


