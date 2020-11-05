package app.service;

import app.model.UpdateModel;
import app.model.User;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface SampleService {

    List<User> findAll();

    User findOne(String id);

    void save(User user);

    void update(UpdateModel updateModel);

    void removeById(String id);
}