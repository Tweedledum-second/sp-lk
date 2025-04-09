package ru.bgpu.splk.models;

import jakarta.persistence.*;
import org.javamoney.moneta.Money;
import java.util.Date;
import ru.bgpu.splk.types.RequestStatus;

@Entity
@Table(name = "requests")
public class Request {

    @Id @GeneratedValue
    private long id;

    @Column
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @Column
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @Column
    @ManyToOne(fetch = FetchType.EAGER)
    private Status status;

    @Column
    private Date dateOfRequest;

    @Column
    private Date deadline;

    @Column
    private Money cost;
}
