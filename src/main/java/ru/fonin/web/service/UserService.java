package ru.fonin.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.fonin.web.models.User;
import ru.fonin.web.repositories.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;

@Service
public class UserService implements UserDetailsService {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    UserRepository userReposity;



    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

        User user= userReposity.findByLogin(login);
        if (user==null){
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }
}
