package by.znak.entities;

import by.znak.dao.TicketDao;
import by.znak.dao.UserDao;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Column(name = "aircompany")
    @Getter
    @Setter
    private String aircompany;

    @Column(name = "begin_city")
    @Getter
    @Setter
    private String begin_city;

    @Column(name = "begin_country")
    @Getter
    @Setter
    private String begin_country;

    @Column(name = "end_city")
    @Getter
    @Setter
    private String end_city;

    @Column(name = "end_country")
    @Getter
    @Setter
    private String end_country;

    @Column(name = "data_of_flight")
    @Getter
    @Setter
    private String data_of_flight;

    @Column(name = "count_of_tickets")
    @Getter
    @Setter
    private Long count_of_tickets;

    @Column(name = "price_USD")
    @Getter
    @Setter
    private Integer price_USD;

    @ManyToMany(mappedBy = "tickets")
    @Getter
    @Setter
    private Set<UserDao> UserDaos = new HashSet();


    public Ticket(String begin_city, String begin_country, String end_city, String end_country, String data_of_flight, Long count_of_tickets, Integer price_USD) {
        this.begin_city = begin_city;
        this.begin_country = begin_country;
        this.end_city = end_city;
        this.end_country = end_country;
        this.data_of_flight = data_of_flight;
        this.count_of_tickets = count_of_tickets;
        this.price_USD = price_USD;
    }

    public Ticket() {
    }
}
