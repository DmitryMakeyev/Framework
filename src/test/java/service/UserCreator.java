package service;

import model.User;

public class UserCreator {

    public static final String USER_EMAIL="test.data.user.email";
    public static final String USER_PASSWORD="test.data.user.password";
    public static final String USER_FIRSTNAME="test.data.user.firstName";
    public static final String USER_LASTNAME="test.data.user.lastName";


    public static User withAllProperty(){
        return new User(TestDataReader.getTestData(USER_EMAIL),
                TestDataReader.getTestData(USER_PASSWORD),
                TestDataReader.getTestData(USER_FIRSTNAME),
                TestDataReader.getTestData(USER_LASTNAME));
    }
}