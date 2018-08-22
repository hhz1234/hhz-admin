package com.hhz.demo.entity;


import sun.nio.cs.Surrogate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sys_user")
public class SysUser {

    @Id
    private Integer id;
    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private Date createTime;
    @Column
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
