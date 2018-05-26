package by.znak.entities;

import by.znak.dao.TicketDao;
import by.znak.dao.TicketDaoImpl;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Column(name = "email", unique = true)
    @Getter
    @Setter
    private String email;

    @Column(name = "password")
    @Getter
    @Setter
    private String password;

    @Column(name = "firstname")
    @Getter
    @Setter
    private String firstname;

    @Column(name = "surname")
    @Getter
    @Setter
    private String surname;

    @Column(name = "role")
    @Getter
    @Setter
    private String role = "user";

    @JoinTable(name = "users_tickets", joinColumns = @JoinColumn(name = "users_id"), inverseJoinColumns = @JoinColumn(name = "tickets_id"))
    @ManyToMany
    @Getter
    @Setter
    private Set<TicketDao> ticketDaos = new HashSet();

    public User(String email, String password, String firstname, String surname) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.surname = surname;
    }
    public User(String email, String password, String firstname, String surname, String role) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.surname = surname;
        this.role = role;
    }
    public User(){}
}
