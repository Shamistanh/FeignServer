package app.service.impl;

import app.client.SampleClient;
import app.model.UpdateModel;
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
    public List<User> findAll() {
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

    @Override
    public void update(UpdateModel updateModel) {
        sampleClient.update(updateModel);
    }

    @Override
    public void removeById(String id) {
        System.out.println("Sample service implementation "+id);
        sampleClient.remove(id);
    }
}