package com.ewflorencio.SpringBootWebLearn.controler;

import com.ewflorencio.SpringBootWebLearn.model.User;
import com.ewflorencio.SpringBootWebLearn.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Controller
public class MainControler {

    private final UserService userService;

    @Autowired
    public MainControler(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("errorLogin")
    public String messageError(){
        return "Access denied!!!";
    }

    @ModelAttribute("listUsers")
    public List<User> listUsers(){
        List<User> list = userService.getAllUsers();
        System.out.println(list);
        return list;
    }

    @RequestMapping("/")
    public String mainStart(){
        System.out.println("Main run");
        return "index";
    }

    @RequestMapping("/login")
    public String login(User user){

        if(Objects.equals(user.getLogin(), "sa") && Objects.equals(user.getPassword(), "0000")){


            return "result";

        }else{

            return "index";
        }

    }
}
