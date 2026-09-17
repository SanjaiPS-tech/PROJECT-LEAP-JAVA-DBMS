
package Java.Project.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Java.Project.demo.service.UserService;
import Java.Project.demo.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return user.getName() +" added successfully!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "User deleted successfully!";
    }

    @GetMapping("/all")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public String getEmail(@PathVariable int id) {
        return userService.findEmail(id);
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
