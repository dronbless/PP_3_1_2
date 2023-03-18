package ru.rumyantsev.com.PP_3_1_2.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.rumyantsev.com.PP_3_1_2.dao.UserDAOImpl;
import ru.rumyantsev.com.PP_3_1_2.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDAOImpl userDAO;

    public UserServiceImpl(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public void removeUserById(long id) {
        userDAO.removeUserById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
