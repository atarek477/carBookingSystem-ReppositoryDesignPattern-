package com.mycompany.app.booking;


import java.util.List;

import com.mycompany.app.car.CarServices;
import com.mycompany.app.user.User;
import com.mycompany.app.car.Car;
import com.mycompany.app.user.User;

public class BookingService {
    BookingDao bookingDao;
    CarServices carServices;

    public BookingService(BookingDao bookingDao, CarServices carServices) {
        this.bookingDao = bookingDao;
        this.carServices = carServices;
    }

    public List<Booking> getAllBooking() {
        return bookingDao.getAllBookingDao();
    }

    public void bookCar(Car car, User user) {
        if (!car.isBooked()) {
            car.setBooked(true);
            carServices.editDataToFile();
            System.out.println(car.isBooked());
            this.writeDataToFile(bookingDao.bookCarDao(car, user));
            System.out.println("congratulation");
        } else {
            System.out.println("car is already booked");

        }
    }

    public void viewAllBooking() {
        this.getAllBooking().forEach(System.out::println);
    }

    public void writeDataToFile(Booking booking) {
        bookingDao.writeDataToFileDao(booking);

    }

    public void readDataFromFile() {
        bookingDao.readDataFromFileDao();
    }


}
