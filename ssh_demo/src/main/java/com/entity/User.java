package com.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="smbms_user")
public class User implements Serializable {

    @Id
    @Column(name="roleid")
    @GenericGenerator(name="generator", strategy = "uuid.hex")
    @GeneratedValue(generator="generator")
    private Integer id;
    @Column(name="userCode")
    private String userCode;
    @Column(name="userName")
    private String userName;
    @Column(name="userPassword")
    private String userPassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
