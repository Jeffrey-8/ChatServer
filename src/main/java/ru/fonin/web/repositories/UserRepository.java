package ru.fonin.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fonin.web.models.User;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByLogin(String login);


}
