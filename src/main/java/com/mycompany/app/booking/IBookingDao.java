package  com.mycompany.app.booking;

import com.mycompany.app.car.Car;
import com.mycompany.app.user.User;

import java.util.List;

public interface IBookingDao {
    Booking bookCarDao(Car car, User user);

    List<Booking> getAllBookingDao();

    void writeDataToFileDao(Booking booking);

    void readDataFromFileDao();
}
