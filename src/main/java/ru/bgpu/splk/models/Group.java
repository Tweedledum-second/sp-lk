package ru.bgpu.splk.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@Entity
@EntityScan
@Table(name = "groups")
public class Group {

    @Id @GeneratedValue
    private long id;

    @Column
    private String group_name;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<User> users;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Privilege> privileges;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }
}
