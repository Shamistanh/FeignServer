package app.service;

import app.model.User;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface SampleService {

    List<User> getAll();

    User findOne(String id);

    void save(User user);

//    void update(String old_name, String new_name);

    void removeById(int id);
}