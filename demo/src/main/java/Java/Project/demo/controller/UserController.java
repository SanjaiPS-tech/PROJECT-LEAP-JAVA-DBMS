package Java.Project.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Java.Project.demo.service.UserService;
import Java.Project.demo.models.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // ── User CRUD ────────────────────────────────────────────

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return user.getName() + " added successfully!";
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

    // ── Bank operations ──────────────────────────────────────

    /** POST /users/deposit?accountNumber=ACC-001&amount=5000 */
    @PostMapping("/deposit")
    public String deposit(@RequestParam String accountNumber,
                          @RequestParam double amount) {
        return userService.deposit(accountNumber, amount);
    }

    /** POST /users/withdraw?accountNumber=ACC-001&amount=1000 */
    @PostMapping("/withdraw")
    public String withdraw(@RequestParam String accountNumber,
                           @RequestParam double amount) {
        return userService.withdraw(accountNumber, amount);
    }

    /** GET /users/balance?accountNumber=ACC-001 */
    @GetMapping("/balance")
    public String checkBalance(@RequestParam String accountNumber) {
        return userService.checkBalance(accountNumber);
    }
}
