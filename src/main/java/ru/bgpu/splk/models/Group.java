package ru.bgpu.splk.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group {

    @Id @GeneratedValue
    private long id;

    @Column
    private String group_name;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<User> users;
}
