package com.lang.testmysql;

import org.springframework.data.jpa.repository.JpaRepository;



//继承JpaRepository类
public interface UserMapper extends JpaRepository<User, Integer>{
    
    public User findByName(String name);

}