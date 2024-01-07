package com.mycompany.app.car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import static java.sql.DriverManager.println;

public class CarDao implements ICarDao {
    private static final List<Car> cars=new ArrayList<>();


    @Override
    public List<Car> getCarsDao() {

        this.readDataFromFileDao();
        return cars;
    }

    @Override
    public void writeDataToFileDao(Car car) {
        File file = new File("src/main/java/com/mycompany/app/cars.txt");
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
        printWriter.println(car.getUuid()+","+car.getCarBrand()+","+car.isElectric()+","+car.isBooked());

        printWriter.flush();
        printWriter.close();


    }

    @Override
    public void readDataFromFileDao() {
        File file= new File("src/main/java/com/mycompany/app/cars.txt");
        String [] strings;
        int i=0;
        try {
            Scanner scanner= new Scanner(file);
            cars.clear();
            while(scanner.hasNext()){
                strings=    scanner.nextLine().split(",");
                cars.add(new Car(UUID.fromString(strings[0]), Car.CarBrand.valueOf(strings[1]), strings[2].equals("true"), strings[3].equals("true")));
                //System.out.println(cars.get(i).getUuid()+"   "+ cars.get(i).getCarBrand()+"   "+ cars.get(i).isElectric()+"   "+ cars.get(i).isBooked());
                i++;

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public void editDataToFileDao(){

        File file = new File("src/main/java/com/mycompany/app/cars.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                println("file not created");
            }
        }
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            System.out.println("something goes wrong");
        }
        assert fileWriter != null;
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (Car car:cars
             ) {
            printWriter.println(car.getUuid() + "," + car.getCarBrand() + "," + car.isElectric() + "," + car.isBooked());
        }
            printWriter.flush();
            printWriter.close();


    }

}