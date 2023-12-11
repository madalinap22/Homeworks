package org.madalina.bankingsystem.service;

import org.madalina.bankingsystem.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Locale.filter;

@Service
public class UserService {

    private static final List<User> KNOWN_USERS = new ArrayList<>();
    private static int NO_USERS =3;

    static{
        KNOWN_USERS.add(new User(1,"Bogdan", 25, LocalDate.now()));
        KNOWN_USERS.add(new User(2,"Ionut", 30, LocalDate.of(2023,1,6)));
        KNOWN_USERS.add(new User(3,"Ioana", 23, LocalDate.of(2022, 4,7)));
          }

    public static List<User> getKnownUsers() {
        return KNOWN_USERS;
    }

    public User getUserById(int id) {
        return KNOWN_USERS.stream()
                .filter(user -> id == user.getId())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    public void deleteUserById(int id) {
            User user =   KNOWN_USERS.stream()
                    .filter(u -> id == u.getId())
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

            KNOWN_USERS.remove(user);
    }



    public User createUser(User user) {

        user.setId(NO_USERS++);
              KNOWN_USERS.add(user);
              return user;
    }

    public User updateUser(Integer id, User user) {
        User user1 = KNOWN_USERS.stream()
                .filter(u -> id == u.getId())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        user1.setName(user.getName());
        user1.setAge(user.getAge());
        user1.setJoinDate(user.getJoinDate());

        return user1;

    }
}
