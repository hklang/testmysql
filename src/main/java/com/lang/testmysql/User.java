package com.lang.testmysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boottest") //声明实体对应得表，如果没有则创建(前提是application.properties文件中有相应的配置)
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String password;
    
    
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(int id, String name, String password) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}