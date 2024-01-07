package com.mycompany.app.user;

import java.io.*;
import java.util.*;

//import static java.lang.System.out;
import static java.sql.DriverManager.println;

public class UserDao implements IUserDao {
    private static final List<User> users= new ArrayList<>();



    @Override
    public List<User> getUsersDao() {

        this.readDataFromFileDao();
        return users;
    }

    @Override
    public void writeDataToFileDao(User user) {
        File file = new File("src/main/java/com/mycompany/app/data.txt");
        try {
            FileWriter myWriter = new FileWriter("src/main/java/com/mycompany/app/data.txt",true);
            myWriter.write(user.getUuid()+","+user.getUserName());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }


    @Override
    public void readDataFromFileDao() {
        File file= new File("src/main/java/com/mycompany/app/data.txt");
        String [] strings;
        int i=0;
        try {
            Scanner scanner= new Scanner(file);
            //file.length();
            users.clear();
            while(scanner.hasNext()){
             strings=    scanner.nextLine().split(",");
             users.add( new User(UUID.fromString(strings[0]), strings[1]));
              //  System.out.println(users.get(i).getUuid()+"   "+ users.get(i).getUserName());
               i++;

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}