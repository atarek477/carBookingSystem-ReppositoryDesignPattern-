package com.mycompany.app.user;

import java.util.List;

public interface IUserDao {
    List<User> getUsersDao();

    void writeDataToFileDao(User user);

    void readDataFromFileDao();
}
