package com.mycompany.app.user;


import com.mycompany.app.car.Car;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class UserService {
   UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao= userDao;
    }

    public List<User> getUsers(){
        return userDao.getUsersDao();
    }
    public User getUserById (UUID uuid) {


        List<User> collect = this.getUsers()
                .stream()
                .filter(user -> user.getUuid().equals(uuid))
                .limit(1)
                .toList();
        return collect.isEmpty() ?null:collect.get(0);


    }


    public void ViewAllUser () {

      this.getUsers().forEach(System.out::println);

    }

    public void writeDataToFile(User user) throws IOException
    {userDao.writeDataToFileDao(user);}

    public void readDataFromFile()
    {userDao.readDataFromFileDao();}




}
