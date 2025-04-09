package ru.bgpu.splk.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "statuses")
public class Status {

    @Id
    @GeneratedValue
    private long id;

    @Column
    @OneToMany(fetch = FetchType.EAGER)
    private List<Request> requests;

    @Column
    private String status;
}
