package Java.Project.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import Java.Project.demo.models.User;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public User addUser(User user) {
        users.add(user);
        return user;
    }

    public void deleteUser(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    public List<User> getAllUsers() {
        return users;
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
