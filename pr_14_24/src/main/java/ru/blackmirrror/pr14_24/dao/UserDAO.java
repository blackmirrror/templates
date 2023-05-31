package ru.blackmirrror.pr14_24.dao;

import ru.blackmirrror.pr14_24.entity.Post;
import ru.blackmirrror.pr14_24.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(int id);
    public void deleteUser(int id);
    public void setPostToUser(Post post, int id);
    public List<User> getAllFilteredUsers(String firstName, String lastName, String middleName, String birthDate);
}
