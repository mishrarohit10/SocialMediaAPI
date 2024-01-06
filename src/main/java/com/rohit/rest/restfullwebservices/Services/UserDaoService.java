package com.rohit.rest.restfullwebservices.Services;

import com.rohit.rest.restfullwebservices.Dao.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoService {
    private static final List<User> users = new ArrayList<>();
    private static int UsersCount = 3;
    static {
        users.add(new User(1, "Rohit", LocalDate.now().minusYears(25)));
        users.add(new User(2, "Mishra", LocalDate.now().minusYears(45)));
        users.add(new User(3, "bruce", LocalDate.now().minusYears(35)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        return users.get(id - 1);
    }

    public User save(User user) {
        user.setId(++UsersCount);
        users.add(user);
        return user;
    }
}
