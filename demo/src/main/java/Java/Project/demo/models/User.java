package Java.Project.demo.models;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Data
public class User {
    @Id
    private int id;
    private String name;
    private String email;
}
