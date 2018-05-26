package by.znak.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "request")
public class Request {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Column(name = "sender_id")
    @Getter
    @Setter
    private Long senderId;

    @Column(name = "recipient_id")
    @Getter
    @Setter
    private Long recipientId;

    @Column(name = "req_tic_id")
    @Getter
    @Setter
    private Long reqTicId;

    public Request(Long senderId, Long recipientId, Long reqTicId) {
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.reqTicId = reqTicId;
    }

    public Request(){}
}
