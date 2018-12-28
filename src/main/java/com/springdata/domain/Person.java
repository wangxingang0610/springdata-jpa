package com.springdata.domain;

import javax.persistence.*;
import java.util.Date;


@Table(name = "JPA_PERSON")
@Entity
public class Person {

    private Integer id;

    private String name;

    private String email;

    private Date birth;

    private Date createTime;

    private Integer addressId;

    private Address address;

    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Column(name = "CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Person有Address属性，而Address没有Person属性
     *
     * @ManyToOne 来映射多对一的关联关系
     *
     * @JoinColumn 来映射外键
     *
     * @ManyToOne 的 fetch 属性来修改默认的关联属性的加载策略
     *
     * @return
     */
    @JoinColumn(name = "ADDRESS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                ", createTime=" + createTime +
                ", addressId=" + addressId +
                ", address=" + address +
                '}';
    }
}
