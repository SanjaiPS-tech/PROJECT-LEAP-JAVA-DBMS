package Java.Project.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import Java.Project.demo.models.User;

@Service
public class BankService {
    private List<User> list = new ArrayList<>();

    public List<User> getAllUsers() {
        return list;
    }
}



































// package Java.Project.demo.service;

// import java.util.ArrayList;
// import java.util.List;
// import org.springframework.stereotype.Service;
// import Java.Project.demo.models.User;

// @Service
// public class UserService {
//     private List<User> users = new ArrayList<>();

//     public void addUser(User user) {
//         users.add(user);
//     }

//     public void deleteUser(int id) {
//         users.removeIf(user -> user.getId() == id);
//     }

//     public List<User> getAllUsers() {
//         return users;
//     }
// }
