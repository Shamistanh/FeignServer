package app.service.impl;

import app.client.SampleClient;
import app.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import app.service.SampleService;

import java.util.List;

@Service
@AllArgsConstructor
public class SampleServiceImplementation implements SampleService {

    private final SampleClient sampleClient;


    @Override
    public List<User> getAll() {
        List<User> all = sampleClient.findAll();
        return all;
    }

    @Override
    public User findOne(String id) {
        User usr = sampleClient.findOne(id);
        return usr;
    }

    @Override
    public void save(User user) {
        sampleClient.save(user);
    }

//    @Override
//    public void update(String old_name, String new_name) {
//        sampleClient.update(old_name,new_name);
//    }

    @Override
    public void removeById(int id) {
        sampleClient.remove(id);
    }
}