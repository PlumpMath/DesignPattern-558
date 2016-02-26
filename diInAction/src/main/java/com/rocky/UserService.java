package com.rocky;

public class UserService {

    private UserDao userDao;

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
