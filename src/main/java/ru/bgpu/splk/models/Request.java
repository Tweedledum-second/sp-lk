package ru.bgpu.splk.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.javamoney.moneta.Money;
import java.util.Date;
import ru.bgpu.splk.types.RequestStatus;

@Entity
@Table(name = "requests")
public class Request {

    @Id @GeneratedValue
    private long id;

    private Date dateOfRequest;
    private Date deadline;
    private Money cost;
    private RequestStatus status;
}
