package ru.blackmirrror.pr14_24.controllers;

import org.springframework.web.bind.annotation.*;
import ru.blackmirrror.pr14_24.entity.Post;
import ru.blackmirrror.pr14_24.entity.User;
import ru.blackmirrror.pr14_24.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping("/{index}")
    public User getUser(@PathVariable int index) {
        return userService.getUser(index);
    }

    @PostMapping("/{index}")
    public void setPostToUser(@RequestBody Post post, @PathVariable int index) {
        userService.setPostToUser(post, index);
    }

    @DeleteMapping("/{index}")
    public void deleteUser(@PathVariable int index) {
        userService.deleteUser(index);
    }

    @GetMapping("/filtered")
    public List<User> getAllFilteredUsers(@RequestParam(name = "firstName", required = false) String firstName,
                                          @RequestParam(name = "lastName", required = false) String lastName,
                                          @RequestParam(name = "middleName", required = false) String middleName,
                                          @RequestParam(name = "birthDate", required = false) String birthDate) {
        return userService.getAllFilteredUsers(firstName, lastName, middleName, birthDate);
    }
}
