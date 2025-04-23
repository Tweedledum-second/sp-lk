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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getDateOfRequest() {
        return dateOfRequest;
    }

    public void setDateOfRequest(Date dateOfRequest) {
        this.dateOfRequest = dateOfRequest;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Money getCost() {
        return cost;
    }

    public void setCost(Money cost) {
        this.cost = cost;
    }
}
