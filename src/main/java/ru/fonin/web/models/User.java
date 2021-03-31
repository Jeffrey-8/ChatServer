package ru.fonin.web.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.fonin.web.forms.UserForm;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String login;

    @Column(name ="password")
    private String password;


//    @OneToMany( mappedBy = "owner")
//    List <Car> cars;

    public static User from(UserForm userForm){
        return User.builder()
                .login(userForm.getLogin())
                .password(userForm.getPassword())
                .build();
    }
}
