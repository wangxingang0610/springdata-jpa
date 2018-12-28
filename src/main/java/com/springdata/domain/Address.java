package com.springdata.domain;

import javax.persistence.*;

@Table(name = "JPA_ADDRESS")
@Entity
public class Address {

    private Integer id;

    private String addressName;

    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "ADDRESS_NAME")
    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }
}
