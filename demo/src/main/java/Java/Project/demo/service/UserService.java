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

    // ── User CRUD ────────────────────────────────────────────
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

    // ── Bank operations ──────────────────────────────────────

    /** Deposit amount into the account by accountNumber */
    public String deposit(String accountNumber, double amount) {
        User user = bankRepo.findByAccountNumber(accountNumber);
        if (user == null) return "Account not found!";
        user.setBalance(user.getBalance() + amount);
        bankRepo.save(user);
        return "Deposited " + amount + " | New Balance: " + user.getBalance();
    }

    /** Withdraw amount from the account by accountNumber */
    public String withdraw(String accountNumber, double amount) {
        User user = bankRepo.findByAccountNumber(accountNumber);
        if (user == null) return "Account not found!";
        if (user.getBalance() < amount) return "Insufficient balance!";
        user.setBalance(user.getBalance() - amount);
        bankRepo.save(user);
        return "Withdrawn " + amount + " | New Balance: " + user.getBalance();
    }

    /** Check balance by accountNumber */
    public String checkBalance(String accountNumber) {
        User user = bankRepo.findByAccountNumber(accountNumber);
        if (user == null) return "Account not found!";
        return "Balance for " + user.getName() + ": " + user.getBalance();
    }
}
