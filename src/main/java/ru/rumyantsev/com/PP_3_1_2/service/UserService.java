package ru.rumyantsev.com.PP_3_1_2.service;


import ru.rumyantsev.com.PP_3_1_2.models.User;

import java.util.List;

public interface UserService {
    User getUser(int id);

    void updateUser(User user);

    void saveUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();
}
