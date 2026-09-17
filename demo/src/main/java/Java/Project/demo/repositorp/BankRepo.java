package Java.Project.demo.repositorp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Java.Project.demo.models.User;

@Repository
public interface BankRepo extends JpaRepository<User, Integer> {
}
