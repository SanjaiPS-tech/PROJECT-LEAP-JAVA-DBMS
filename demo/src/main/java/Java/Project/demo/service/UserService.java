package Java.Project.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Java.Project.demo.models.User;
import Java.Project.demo.repositorp.BankRepo;

@Service
public class UserService {
    
    @Autowired
    private BankRepo bankRepo;

    public User addUser(User user) {
        return bankRepo.save(user);
    }

    public void deleteUser(int id) {
        bankRepo.deleteById(id);
    }

    public List<User> getAllUsers() {
        return bankRepo.findAll();
    }
    public String findEmail(int id) {
        return bankRepo.findEmailById(id);
    }
}
