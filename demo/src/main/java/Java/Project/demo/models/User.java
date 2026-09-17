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

    // ── Bank fields ──────────────────────────────────────────
    @Column(unique = true)
    private String accountNumber;   // e.g. "ACC-001"

    private double balance;         // current balance

    private String accountType;     // "SAVINGS" or "CURRENT"
}
