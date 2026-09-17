package Java.Project.demo.repositorp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Java.Project.demo.models.User;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface BankRepo extends JpaRepository<User, Integer> {

    @Query("SELECT u.email FROM User u WHERE u.id = ?1")
    String findEmailById(int id);

    // Find user by account number
    User findByAccountNumber(String accountNumber);
}
