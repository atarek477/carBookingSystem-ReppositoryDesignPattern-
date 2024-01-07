package com.mycompany.app;

import com.mycompany.app.booking.BookingDao;
import com.mycompany.app.booking.BookingService;
import com.mycompany.app. car.CarDao;
import com.mycompany.app.car.CarServices;

import com.mycompany.app.user.User;
import com.mycompany.app.user.UserDao;
import com.mycompany.app.user.UserService;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


import static java.sql.DriverManager.println;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        int num = 0;
        CarDao carDao= new CarDao();
        UserDao userDao =new UserDao();
        println("here");
        BookingDao bookingDao= new BookingDao();
//        while (flag) {
//            System.out.println(" 1️⃣ - Book Car");
//            System.out.println(" 2️⃣ - View All User Booked Cars");
//            System.out.println(" 3️⃣ - View All Bookings");
//            System.out.println(" 4️⃣ - View Available Cars");
//            System.out.println(" 5️⃣ - View Available Electric Cars");
//            System.out.println(" 6️⃣ - View all users");
//            System.out.println(" 7️⃣ - Exit");
//            Scanner scanner = new Scanner(System.in);
//            num = scanner.nextInt();
//            switch (num) {
//                case 1 -> {System.out.println("case one");}
//                case 2 -> {System.out.println("case two");}
//                case 3 -> {System.out.println("case three");}
//                case 4 ->{ System.out.println("case four");}
//                case 5 -> {System.out.println("case five");}
//                case 6 -> {System.out.println("case six");}
//                case 7 -> {
//                    System.out.println("case seven");
//                    flag = false;
//                }
//                default -> System.out.println("num incorrect");
//            }
//        }
        CarServices carServices = new CarServices(carDao);
        UserService userService = new UserService(userDao);
        BookingService bookingService= new BookingService(bookingDao,carServices);
//        bookingService.bookCar(carServices.getCarById(UUID.fromString("b2db0f6f-8398-4e49-a106-6a92bdb2e9cd")),userService.getUserById(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3")));
//        bookingService.bookCar(carServices.getCarById(UUID.fromString("b2db0f6f-8398-4e49-a106-6a92bdb2e9cd")),userService.getUserById(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3")));
//        bookingService.viewAllBooking();

       // System.out.println(new File(String.valueOf(Main.class.getClassLoader().getResource("com/mycompany/app/booking/data.txt"))));

//userService.readDataFromFile();

      //  carServices.readDataFromFile();
      //  carServices.writeDataToFileDao(new Car(UUID.fromString(String.valueOf(UUID.randomUUID())), Car.CarBrand.HONDA,false,true));
//Car car[]=carServices.getCars();

//        bookingService.bookCar(carServices.getCarById(UUID.fromString("280ed130-11db-43d0-b5ba-4fc1507d483a")),userService.getUserById(UUID.fromString("7e4b9220-a47a-45a7-a33b-7182ee0dc30e")));
//        bookingService.bookCar(carServices.getCarById(UUID.fromString("b2db0f6f-8398-4e49-a106-6a92bdb2e9cd")),userService.getUserById(UUID.fromString("7e4b9220-a47a-45a7-a33b-7182ee0dc30e")));
//        bookingService.bookCar(carServices.getCarById(UUID.fromString("51e8f646-cd24-45c1-9663-8644bcf5351")),userService.getUserById(UUID.fromString("7e4b9220-a47a-45a7-a33b-7182ee0dc30e")));
        System.out.println(  userService.getUserById(UUID.fromString("7e4b9220-a47a-45a7-a33b-7182ee0dc30")));

//carServices.readDataFromFile();
//        System.out.println(car[0].toString());
//        System.out.println(car[1].toString());
//        System.out.println(car[2].toString());
//       userService.writeDataToFile(new User(UUID.randomUUID(),"ahmed tarek"));
//bookingService.viewAllBooking();
//carServices.viewElectricCars();


   }
}