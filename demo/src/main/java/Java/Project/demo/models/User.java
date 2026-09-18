package Java.Project.demo.models;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Data
public class User {

    @Id
    private int id;

    private String name;

    private String email;

    @Column(unique = true)
    private String accountNumber;   

    private double balance;         

    private String accountType;     
}
