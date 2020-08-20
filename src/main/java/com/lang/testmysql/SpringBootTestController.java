package com.lang.testmysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SpringBootTestController {

    @Autowired
    private UserMapper userMapper;
    
    @RequestMapping(value = "/find")
    public String springBootTest(Model model) {
        User findByName = userMapper.findByName("test");
        model.addAttribute("user", findByName);
        return "test";
    }
    
    @RequestMapping(value = "/all")
    public String selectAll(Model model) {
         List<User> selectAll = userMapper.findAll();
         model.addAttribute("user", selectAll);
        return "test2";
    }
    
}