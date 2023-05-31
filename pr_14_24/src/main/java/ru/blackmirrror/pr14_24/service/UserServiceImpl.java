package ru.blackmirrror.pr14_24.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.blackmirrror.pr14_24.dao.UserDAO;
import ru.blackmirrror.pr14_24.entity.Post;
import ru.blackmirrror.pr14_24.entity.User;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;
    private final EmailService emailService;

    public UserServiceImpl(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        log.info("ALL USERS");
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        log.info("USER: " + user + "WAS SAVED");
        emailService.sendSaveNotification("User " + user.getId() + " saved");
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    @Transactional
    public void setPostToUser(Post post, int id) {
        userDAO.setPostToUser(post, id);
    }

    @Override
    @Transactional
    public List<User> getAllFilteredUsers(String firstName, String lastName, String middleName, String birthDate) {
        return userDAO.getAllFilteredUsers(firstName, lastName, middleName, birthDate);
    }
}
