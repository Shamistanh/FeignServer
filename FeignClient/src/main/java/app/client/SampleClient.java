package app.client;

import app.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "SampleClient", url = "http://localhost:8081")
public interface SampleClient {

    @GetMapping("/findAll")
    List<User> findAll();

    @GetMapping("/findOne")
    User findOne(String id);

    @PostMapping("/save")
    void save(User user);

//    @PostMapping("/update_name")
//    void update(String old_name, String new_name);

    @PostMapping("/removeById")
    void remove(int id);
}