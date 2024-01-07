package  com.mycompany.app.booking;


import com.mycompany.app.car.Car;
import com.mycompany.app.user.User;

import java.util.UUID;

public class Booking {
 private User user;
 private Car car;
 private UUID uuid;

    public Booking(User user, Car car) {
        this.user = user;
        this.car = car;
        this.uuid= UUID.randomUUID();
        System.out.println(UUID.fromString(String.valueOf(this.uuid)));
    }

    public Booking( UUID uuid, Car car,User user) {
        this.user = user;
        this.car = car;
        this.uuid = uuid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "user=" + user +
                ", car=" + car +
                ", uuid=" + uuid +
                '}';
    }
}
