package com.mycompany.app.car;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class  CarServices {
CarDao carDao;

    public CarServices(CarDao carDao) {
        this.carDao= carDao;
    }

    public List<Car> getCars() {
        return carDao.getCarsDao();
    }
    public  void viewElectricCars (){
       this.getCars()
               .stream()
               .filter(Car::isElectric)
               .collect(Collectors.toList())
               .forEach(System.out::println);
    }
    public  void viewAllCars () {
      this.getCars().forEach(System.out::println);
    }

    public  Car getCarById (UUID uuid) {


        List<Car> collect = this.getCars()
                .stream()
                .filter(car -> car.getUuid().equals(uuid))
                .limit(1)
                .toList();
        return collect.isEmpty() ?null:collect.get(0);


    }
    public  void viewAllAvailableCars () {

        this.getCars()
                .stream()
                .filter(car -> !car.isBooked())
                .forEach(System.out::println);
    }

    public  void viewAllAvailableElectricCars () {
        this.getCars()
                .stream()
                .filter(car -> !car.isBooked())
                .filter(Car::isBooked)
                .forEach(System.out::println);
    }
    public void readDataFromFile() {
        carDao.readDataFromFileDao();
    }
    public void writeDataToFileDao(Car car){carDao.writeDataToFileDao(car);}

    public void editDataToFile(){
        carDao.editDataToFileDao();
    }


}


