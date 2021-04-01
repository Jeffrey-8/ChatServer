package ru.fonin.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.fonin.web.forms.UserForm;
import ru.fonin.web.repositories.UserRepository;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpResponse;

@Controller
public class UsersWithJpaController {



    @Autowired
    private UserRepository userRepository;


    @RequestMapping(path = "/login",method = RequestMethod.GET)
    public ModelAndView getStartPage(){
        ModelAndView modelAndView = new ModelAndView("home");
//        modelAndView.
        return modelAndView;
    }

    @RequestMapping(path = "/SignIn",method = RequestMethod.POST)
    public ModelAndView Loggining(UserForm userForm,
                            @CookieValue(value = "foo", defaultValue = "nothing") String cook
                            ,HttpServletResponse response){
        String login    = userForm.getLogin();
        String password = userForm.getPassword();



        ModelAndView modelAndView= new ModelAndView("home");

//        response.addCookie(new Cookie("foo2","someCookie"));



        return modelAndView;
//       return "redirect:/hello";
    }




//    @RequestMapping(path = "/hello", method = RequestMethod.GET)
//    public ModelAndView mainPage(){
//
//    }


}
