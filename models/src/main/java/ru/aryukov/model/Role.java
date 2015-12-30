package ru.aryukov.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * Created by oleg on 23.12.2015.
 */
@Entity
@Table(name = "role")
public class Role {

    private Integer id;
    private String name;
    private List<ClientEntity> clients;

    @Id
    @Column(name = "id",  insertable = true, updatable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name",  insertable = true, updatable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "role")
    @LazyCollection(LazyCollectionOption.FALSE)
    public List<ClientEntity> getClients() {
        return clients;
    }

    public void setClients(List<ClientEntity> clients) {
        this.clients = clients;
    }


}
