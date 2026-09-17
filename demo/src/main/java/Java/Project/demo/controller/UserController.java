package Java.Project.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Java.Project.demo.models.User;
import Java.Project.demo.service.BankService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private BankService bankService;

    @GetMapping("/user")
    public List<User> getUsers() {
        return bankService.getAllUsers();
    }
}




























// package Java.Project.demo.controller;

// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;
// import Java.Project.demo.service.UserService;
// import Java.Project.demo.models.User;

// @RestController
// @RequestMapping("/users")
// public class UserController {

// @Autowired
// private UserService userService;

// @PostMapping("/add")
// public String addUser(@RequestBody User user) {
// userService.addUser(user);
// return "User added successfully!";
// }

// @DeleteMapping("/delete/{id}")
// public String deleteUser(@PathVariable int id) {
// userService.deleteUser(id);
// return "User deleted successfully!";
// }

// @GetMapping("/all")
// public List<User> getUsers() {
// return userService.getAllUsers();
// }
// }
