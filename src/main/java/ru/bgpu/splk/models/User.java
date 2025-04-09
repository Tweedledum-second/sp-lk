package ru.bgpu.splk.models;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id @GeneratedValue
    private Long id;

    @Column
    @OneToMany(fetch = FetchType.EAGER)
    private List<Request> requests;

    @Column
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Group> groups;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String phoneNumber;

    @Column
    private String email;
}
