package com.mycompany.app.booking;

import com.mycompany.app.car.Car;
import com.mycompany.app.user.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;


import static java.sql.DriverManager.println;

public class BookingDao implements IBookingDao {
    private static final List<Booking>booking= new ArrayList<>();
  private User user;
  private Car car;
    private static int count =0;


    @Override
    public Booking bookCarDao(Car car, User user) {
        booking.add( new Booking(user, car));
        count++;
        return booking.get(count - 1);

    }


    @Override
    public List<Booking> getAllBookingDao() {

        this.readDataFromFileDao();
        return booking;
    }





    @Override
    public void writeDataToFileDao(Booking booking) {
        File file = new File("src/main/java/com/mycompany/app/booking.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                println("file not created");
            }
        }
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(file,true);
        } catch (IOException e) {
            System.out.println("something goes wrong");
        }
        assert fileWriter != null;
        PrintWriter printWriter= new PrintWriter(fileWriter);
        printWriter.println(booking.getUuid()+","
                +booking.getCar().getUuid()+","+booking.getCar().getCarBrand()+
                ","+booking.getCar().isElectric()+","+booking.getCar().isBooked()+
                ","+booking.getUser().getUuid()+","+booking.getUser().getUserName());

        printWriter.flush();
        printWriter.close();


    }

@Override
    public void readDataFromFileDao() {
        File file= new File("src/main/java/com/mycompany/app/booking.txt");
        String [] strings;
        int i=0;
        try {
            Scanner scanner= new Scanner(file);
            //file.length();
            booking.clear();
            while(scanner.hasNext()){
                strings=    scanner.nextLine().split(",");
                booking.add( new Booking(UUID.fromString(strings[0]),new Car(UUID.fromString(strings[1]),
                        Car.CarBrand.valueOf(strings[2]),strings[3].equals("true"),
                        strings[4].equals("true")),new User(UUID.fromString(strings[5]),strings[6]) ));
               // System.out.println(users.get(i).getUuid()+"   "+ users.get(i).getUserName());
                i++;

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }



}

