package ru.fonin.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.fonin.web.forms.UserForm;
import ru.fonin.web.models.User;
import ru.fonin.web.repositories.UserRepository;

import java.util.List;

@Controller
public class UsersWithJpaController {



    @Autowired
    private UserRepository userRepository;


    @RequestMapping(path = "/start",method = RequestMethod.GET)
    public ModelAndView getStartPage(){
        ModelAndView modelAndView = new ModelAndView("start");
        return modelAndView;
    }



}
