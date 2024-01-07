package com.mycompany.app.car;

import java.util.List;

public interface ICarDao {
    List<Car> getCarsDao();

    void writeDataToFileDao(Car car);

    void readDataFromFileDao();
}
